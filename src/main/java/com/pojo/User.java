package com.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User implements Serializable {

	private static final long serialVersionUID = -2811134687378990361L;
	private Integer id;
	private String userName;
	private String passWord;
	private String sex;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	private String address;

	public User() {
		super();
	}

	public User(Integer id, String userName, String passWord, String sex, Date birthday, String address) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.sex = sex;
		this.birthday = birthday;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", sex=" + sex + ", birthday="
				+ birthday + ", address=" + address + "]";
	}

}
