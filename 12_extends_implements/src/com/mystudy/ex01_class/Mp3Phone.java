package com.mystudy.ex01_class;

class Mp3Phone { 			// class 앞에 public을 떼면 현재 페이지에서만 쓸 수 있게 한다.
	private String type;
	private String phoneNo;
	
	// 생성자
	public Mp3Phone() {}
	public Mp3Phone(String phoneNo) {
		type = "Mp3Phone 타입"; // this 안 해줘도 돼 - type이라는 변수가 따로 없으니까.
		this.phoneNo = phoneNo;
	}
	public Mp3Phone(String type, String phoneNo) {
		this.type = type;
		this.phoneNo = phoneNo;
	}
	
	// 메소드 생성
	public String getType() {
		return type;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	
	// 전화걸기 기능
	public void call() {
		System.out.println(">> 전화걸기");
	}
	
	// 전화받기 기능
	public void receiveCall() {
		System.out.println(">> 전화받기~~");
	}
	
	// 전화정보 확인
	public void view() {
		System.out.println("타입 : " + type + ", 전화번호 : " + phoneNo);
	}
	
	// 음악플레이 기능 ----------------
	public void playMusic() {
		System.out.println(">> 음악 플레이 ~~");
	}
	
	
	
}
