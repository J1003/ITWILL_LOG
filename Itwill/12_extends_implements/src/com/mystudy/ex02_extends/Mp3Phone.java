package com.mystudy.ex02_extends;

class Mp3Phone extends Phone { 
	// extends Phone = Phone클래스를 상속받아(extends : 확장해서) Mp3Phone을 만들겠다.
	// extends 키워드를 사용해서 만들기!
	// Phone에서 허용된 속성, 기능을 사용 + Mp3Phone 속성, 기능을 추가해서 사용.
	
	public Mp3Phone(String phoneNo) {
		// super(phoneNo); // 부모클래스 생성자 호출
		super("Mp3Phone 타입", phoneNo); //() 소괄호 열고 닫으면 생성자 호출. // 부모클래스 생성자 호출.
	}
	public Mp3Phone(String type, String phoneNo) {
		super(type, phoneNo);  // 부모클래스 생성자 호출
	}
	
	// 메소드(기능) ------------
	public void playMusic() {
		System.out.println(">> Mp3Phone - 음악플레이");
	}
}
