package com.bzh.floodserver.model.user;

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

	public UserInfo() {
	}

	@Override
	public String toString() {
		return "UserInfo{" +
				"username='" + username + '\'' +
				", name='" + name + '\'' +
				", headportrait='" + headportrait + '\'' +
				", descript='" + descript + '\'' +
				", address='" + address + '\'' +
				", motto='" + motto + '\'' +
				'}';
	}

	public UserInfo(String username, String name, String headportrait, String descript, String address, String motto) {
		this.username = username;
		this.name = name;
		this.headportrait = headportrait;
		this.descript = descript;
		this.address = address;
		this.motto = motto;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeadportrait() {
		return headportrait;
	}

	public void setHeadportrait(String headportrait) {
		this.headportrait = headportrait;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMotto() {
		return motto;
	}

	public void setMotto(String motto) {
		this.motto = motto;
	}
}
