package com.weaving.service.business.platform.log.operate;

import com.weaving.common.PageUtils;
import com.weaving.entry.business.platform.log.operate.Operate;

public interface LogOperateService {

	void add(Operate operate)throws Exception;

	PageUtils<Operate> list(Operate operate, Integer pageNum, Integer pageSize)throws Exception;

}
