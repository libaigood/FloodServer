package com.bzh.floodserver.model.user;

import lombok.Data;

/**
 * @author 毕泽浩
 * @Description: 添加好友
 * @time 2018/10/1 15:30
 */
@Data
public class Friend {
	private String username;
	private String friendName;
	private String remarkName;

	public Friend() {
	}

	@Override
	public String toString() {
		return "Friend{" +
				"username='" + username + '\'' +
				", friendName='" + friendName + '\'' +
				", remarkName='" + remarkName + '\'' +
				'}';
	}

	public Friend(String username, String friendName, String remarkName) {
		this.username = username;
		this.friendName = friendName;
		this.remarkName = remarkName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFriendName() {
		return friendName;
	}

	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}

	public String getRemarkName() {
		return remarkName;
	}

	public void setRemarkName(String remarkName) {
		this.remarkName = remarkName;
	}
}
