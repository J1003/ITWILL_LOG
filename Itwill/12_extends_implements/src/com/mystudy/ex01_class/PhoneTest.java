package com.mystudy.ex01_class;

public class PhoneTest {

	public static void main(String[] args) {
		// Phone 객체(인스턴스) 생성 후 기능 테스트
		System.out.println("=== Phone ===");
		Phone ph1 = new Phone("010-1111-1111");
		ph1.view();
		ph1.call();
		ph1.receiveCall();
		
		System.out.println("--------");
		// 생성자를 Phone타입으로 쓰면? 
		// 생성자 = 초기 타입 세팅하는 역할.
		Phone ph2 = new Phone("아이폰", "010-2222-2222");
		ph2.view();
		ph2.call();
		ph2.receiveCall();
		
		
		// Mp3Phone (Phone과 아무 상관 없음)
		System.out.println("=== Mp3Phone ===");
		Mp3Phone mp3ph = new Mp3Phone("010-3333-3333");
		mp3ph.view();
		mp3ph.call();
		mp3ph.receiveCall();
		mp3ph.playMusic();
	}

}
