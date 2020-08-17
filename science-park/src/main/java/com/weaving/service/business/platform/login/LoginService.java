package com.weaving.service.business.platform.login;

import com.weaving.entry.sys.user.User;

public interface LoginService {

	User login(User user) throws Exception;

	void logout(String token) throws Exception;

}
