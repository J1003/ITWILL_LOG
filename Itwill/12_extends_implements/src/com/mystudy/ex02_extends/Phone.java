package com.mystudy.ex02_extends;

//public class Phone extends Object {
class Phone { // extends Object 생략되어 있지만 내부적으로는 만들어져 있음
	// 필드변수 (속성) --------------------
	private String type; // 전화타입(형태)  //private String type = "Phone 타입"; 해줘도 돼.
	private String phoneNo; // 전화번호
	
	// 생성자 ------------
	public Phone() {}
	public Phone(String phoneNo) {
		this.type = "Phone 타입";
		this.phoneNo = phoneNo;
	}
	
	public Phone(String type, String phoneNo) {
		this.type = type;
		this.phoneNo = phoneNo;
	}
	
	// 메소드 ------------
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
	
}
