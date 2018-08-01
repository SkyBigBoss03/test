package com.iflytek.manage.service.impl;

import com.iflytek.manage.dao.SysUserDao;
import com.iflytek.manage.pojo.SysUser;
import com.iflytek.manage.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SysUserServiceImpl implements SysUserService {
    private static Logger logger = LoggerFactory.getLogger(SysUserServiceImpl.class);
    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public SysUser findUserById(Integer id) {
        SysUser sysUser = sysUserDao.findUserById(id);
        return sysUser;

    }
    //fvkjsvsdnfsdnflsdn
}
