package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.UserMapper;
import com.pojo.User;
import com.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserMapper userMapper;
	@Override
	public User queryByNameAndPassWord(String userName,String passWord) {
		return userMapper.queryByNameAndPassWord(userName,passWord);
	}
	
	@Override
	public void addUser(User user) {
		userMapper.addUser(user);	
	}

}
