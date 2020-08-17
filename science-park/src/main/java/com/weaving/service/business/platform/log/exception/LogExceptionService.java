package com.weaving.service.business.platform.log.exception;

import com.weaving.common.PageUtils;
import com.weaving.entry.business.platform.log.exception.Exception;

public interface LogExceptionService {

	void add(Exception exception);

	PageUtils<Exception> list(Exception exception, Integer pageNum, Integer pageSize);

}
