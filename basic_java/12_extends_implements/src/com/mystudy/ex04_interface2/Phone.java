package com.mystudy.ex04_interface2;

class Phone implements I_Phone {
	
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
	
	
	public String getType() {
		return type;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	@Override
	public void view() {
		System.out.println("타입 : " + type + ", 전화번호 : " + phoneNo);
	}

	@Override
	public void call() {
		System.out.println(">> 전화걸기");
	}

	@Override
	public void receiveCall() {
		System.out.println(">> 전화받기~~");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		
	}
	
}
