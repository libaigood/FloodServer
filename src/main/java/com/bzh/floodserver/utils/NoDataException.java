package com.bzh.floodserver.utils;

public class NoDataException extends RuntimeException{
	private static final long serialVersionUID = 3270575270485883914L;

	public NoDataException() {
	}

	public NoDataException(String message) {
		super(message);
	}

	public NoDataException(Throwable cause) {
		super(cause);
	}

	public NoDataException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
}
