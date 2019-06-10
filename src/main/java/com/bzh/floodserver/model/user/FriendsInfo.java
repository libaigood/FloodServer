package com.bzh.floodserver.model.user;

import lombok.Data;

/**
 * @author 毕泽浩
 * @Description: 好友信息
 * @time 2018/10/8 11:54
 */
@Data
public class FriendsInfo{
	private String username; //用户名
	private String name; //真实姓名
	private String headportrait;
	private String descript;
	private String address;
	private String motto;
	private String remarkName; //REMARK_NAME; 备注姓名

	public FriendsInfo(String username, String name, String headportrait, String descript, String address, String motto, String remarkName) {
		this.username = username;
		this.name = name;
		this.headportrait = headportrait;
		this.descript = descript;
		this.address = address;
		this.motto = motto;
		this.remarkName = remarkName;
	}

	public FriendsInfo() {
	}

	@Override
	public String toString() {
		return "FriendsInfo{" +
				"username='" + username + '\'' +
				", name='" + name + '\'' +
				", headportrait='" + headportrait + '\'' +
				", descript='" + descript + '\'' +
				", address='" + address + '\'' +
				", motto='" + motto + '\'' +
				", remarkName='" + remarkName + '\'' +
				'}';
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

	public String getRemarkName() {
		return remarkName;
	}

	public void setRemarkName(String remarkName) {
		this.remarkName = remarkName;
	}
}
