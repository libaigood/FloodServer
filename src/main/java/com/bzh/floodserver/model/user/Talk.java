package com.bzh.floodserver.model.user;


import java.util.Date;

/**
 * 消息表
 */
public class Talk {
	private Long id;//消息ID
	private String code;//消息标号
	private String sender;//发件人
	private String receiver;//接受者
	private int push;//是否推送？
	private Date time;
	private String message;

	public Talk() {
	}

	public Talk(Long talkID, String s, String username, String friendName, Date date, String imgtobyte) {
	}

	public Talk(Long id, String code, String sender, String receiver, int push, Date time, String message) {
		this.id = id;
		this.code = code;
		this.sender = sender;
		this.receiver = receiver;
		this.push = push;
		this.time = time;
		this.message = message;
	}

	@Override
	public String toString() {
		return "Talk{" +
				"id=" + id +
				", code='" + code + '\'' +
				", sender='" + sender + '\'' +
				", receiver='" + receiver + '\'' +
				", push=" + push +
				", time=" + time +
				", message='" + message + '\'' +
				'}';
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public int getPush() {
		return push;
	}

	public void setPush(int push) {
		this.push = push;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
