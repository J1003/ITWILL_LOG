package com.mystudy.ex03_sungjuk;

// Exception 상속, 확장
public class SungjukProcessException extends Exception {
	
	public SungjukProcessException() {}
		
	public SungjukProcessException(String msg) {
		super(msg);
	
	}
}
