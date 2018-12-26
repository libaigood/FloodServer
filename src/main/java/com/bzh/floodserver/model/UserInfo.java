package com.bzh.floodserver.model;

import lombok.Data;

/**
 * @author 毕泽浩
 * @Description: 用户信息表
 * @time 2018/9/18 14:59
 */
@Data
public class UserInfo {
	private String username;
	private String name;
	private String headportrait;
	private String descript;
	private String address;
	private String motto;

	public UserInfo(String username, String name, String headportrait, String descript, String address, String motto) {
		this.username = username;
		this.name = name;
		this.headportrait = headportrait;
		this.descript = descript;
		this.address = address;
		this.motto = motto;
	}

}
