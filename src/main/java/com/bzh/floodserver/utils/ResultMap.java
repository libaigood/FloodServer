package com.bzh.floodserver.utils;


import java.util.HashMap;

/**
 * @author wean2016
 */
public class ResultMap extends HashMap<String, Object> {


	public ResultMap() {

	}

	public ResultMap success() {
		this.put("code", "200");
		return this;
	}

	public ResultMap fail(String code) {
		this.put("code", code);
		return this;
	}

	public ResultMap message(Object message) {
		this.put("message", message);
		return this;
	}

	public ResultMap data(Object obj) {
		this.put("data", obj);
		return this;
	}
}
