package com.db.sys.dao;

import java.util.List;

import com.db.sys.entity.SysLog;

public interface SysLogDao {
	
	List<SysLog> findObjects();
}
