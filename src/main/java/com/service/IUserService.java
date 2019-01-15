package com.service;

import com.pojo.User;

public interface IUserService {
	
	/**
	 * 根据用户名和密码登录
	 * @param userName
	 * @param passWord
	 * @return
	 */
	User queryByNameAndPassWord(String userName, String passWord);
	
	/**
	 * 注册用户
	 * @param user
	 */
	void addUser(User user);

}
