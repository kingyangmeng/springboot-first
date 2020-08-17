package com.weaving.service.business.platform.blacklist;

import com.weaving.common.PageUtils;
import com.weaving.entry.business.platform.blacklist.Blacklist;

public interface BlacklistService {

	void add(String token, Blacklist blacklist)throws Exception;

	PageUtils<Blacklist> listPage(Blacklist blacklist, Integer pageNum, Integer pageSize)throws Exception;

	void delete(String id)throws Exception;

}
