package com.younge.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.younge.dao.IUserDao;
import com.younge.entity.User;
import com.younge.service.IUserService;


public class UserServiceImpl implements IUserService{
	
	@Autowired
    public IUserDao userDao;
	
	@Override
	public User selectUserById(String id) {
		return userDao.selectByPrimaryKey(Integer.parseInt(id));
	}
}
