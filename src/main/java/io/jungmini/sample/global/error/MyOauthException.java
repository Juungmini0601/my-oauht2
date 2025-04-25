package io.jungmini.sample.global.error;

import lombok.Getter;

@Getter
public class MyOauthException extends RuntimeException {
	private final ErrorType errorType;
	private final Object data;

	public MyOauthException(ErrorType errorType) {
		super(errorType.getMessage());
		this.errorType = errorType;
		this.data = null;
	}

	public MyOauthException(ErrorType errorType, Object data) {
		super(errorType.getMessage());
		this.errorType = errorType;
		this.data = data;
	}
}
