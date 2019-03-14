package com.db.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.db.sys.entity.SysLog;

public interface SysLogDao {
	
	List<SysLog> findObjects();
	
	List<SysLog> findPageObjects(@Param("username")String username,
			@Param("startIndex")Integer startIndex,
			@Param("PageSize")Integer PageSize);
	
	int getRowCount(@Param("username")String username);
}
