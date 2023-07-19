package com.mystudy.phone;

public class Phone {
	
	String name = "아이폰";
	String type = "15pro";
	int hszie = 10;
	int vsize = 20;
	int storage = 256;
	String sms = "어디가세요?";
	String sms1 = "뭔 상관?";
	boolean hasLCD;
	
	
	//생성자 선언---------여기는 출력되는 값에 영향을 주지 않음---------
	Phone() {} //기본생성자
	
	Phone (String name, String type){
		this.name = name; // this : 현재객체(인스턴스). 필드명 name과 파라미터명이 구분이 안 되니까 this. 입력
		this.type = type; // this키워드는 생성자에서만 쓰는 게 아니라 메소드에서도 가능.
		hszie = 20;
	}
	
	Phone(String name, String type, boolean hasLCD){ //n=name,t=type,l=hasLCD
		this.name = name;
		this.type = type;
		this.hasLCD = hasLCD;
	}
	
	//메소드 영역 ---------------------
	
	void call (){
		System.out.println(">> 전화걸기");
	}
	void receiveCall () {
		System.out.println(">> 전화받기");
	}
	/*
	 void sendSms (String msg) {
		System.out.println("[메세지전송] : " + msg);
	} //이렇게 하고 뒤에 Main에다가 ph1.senMsg("안녕") 이렇게 해도 돼.
	 */
	
	void sendSms () {
		System.out.println("[메세지전송] : " + sms);
	}
	/* String receiveSms(String msg){
	 	System.out.println("[메세지수신] : " + msg);
	 	return.msg;
  	    }
  	    
  	    뒤에 Main에 String receiveMsg = ph1.reciveSms("오랜만이네요");
  	    System.out.println("::받은메세지 : " + receiveMsg);
	 */
	void receiveSms () {
		System.out.println("[메세지수신] : " + sms1);
	}
	void viewData () {
		System.out.println("--- 전화기 정보 ---");
		System.out.println("모델명 : " + name);
		System.out.println("타입 : " + type);
		System.out.println("가로사이즈 : " + hszie);
		System.out.println("가로사이즈 : " + vsize);
		System.out.println("LCD유무 : " + hasLCD);
	}

}
