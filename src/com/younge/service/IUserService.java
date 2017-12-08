package com.younge.service;

import com.younge.entity.User;

public interface IUserService {

	/**
	 * 根据编号获取用户
	 */
	public User selectUserById(String id);
}
