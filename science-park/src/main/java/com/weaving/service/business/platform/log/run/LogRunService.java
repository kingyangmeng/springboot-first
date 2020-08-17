package com.weaving.service.business.platform.log.run;

import com.weaving.common.PageUtils;
import com.weaving.entry.business.platform.log.run.Run;

public interface LogRunService {

	void add(Run run)throws Exception;

	PageUtils<Run> list(Run run, Integer pageNum, Integer pageSize)throws Exception;

}
