package com.weaving.service.business.platform.workorder;

import com.weaving.common.PageUtils;
import com.weaving.entry.business.platform.workorder.Workorder;

public interface WorkorderService {

	void add(String token, Workorder order)throws Exception;

	PageUtils<Workorder> list(Workorder order, Integer pageNum, Integer pageSize)throws Exception;

}
