package com.weaving.service.business.platform.login.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import com.weaving.common.Contants;
import com.weaving.common.RedisUtils;
import com.weaving.dao.sys.user.UserDao;
import com.weaving.entry.sys.user.User;
import com.weaving.service.business.platform.login.LoginService;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private RedisUtils redisUtils;

	@Override
	public User login(User user) throws Exception{
		String username = user.getUsername();
		String password = user.getPassword();
		String md5Str = Contants.PASSWORD_STR + password + username;
		String Md5Password = DigestUtils.md5DigestAsHex(md5Str.getBytes());
		user.setPassword(Md5Password);
		User paltformUser = userDao.queryUser(user);

		if (null != paltformUser) {
			String deptId = userDao.queryDeptByUserId(paltformUser.getId());
			paltformUser.setDeptId(deptId);
			// 保存到redis,保存30min
			boolean setResult = redisUtils.set(paltformUser.getPassword(), paltformUser, 30 * 60);
			if (setResult) {
				return paltformUser;
			}
		}
		return null;
	}

	@Override
	public void logout(String token) throws Exception{
		redisUtils.del(token);
	}

}
