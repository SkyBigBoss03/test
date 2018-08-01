package com.iflytek.manage.dao;

import java.util.List;
import java.util.Map;

import com.iflytek.manage.pojo.SysUser;
import org.apache.ibatis.annotations.Param;


public interface SysUserDao {
	SysUser findUserById(Integer id);


}
