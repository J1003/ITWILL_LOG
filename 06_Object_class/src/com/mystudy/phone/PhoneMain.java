package com.mystudy.phone;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		Phone ph1 = new Phone();
		// 참조형 데이터 타입이 의미하는 것은 해당 변수의 주소값이다. (주소값에 가면 인스턴스변수 etc..있다.)
		
		//System.out.println("모델명 : " + ph1.name);
		//System.out.println("타입 : " + ph1.type);
		//System.out.println("가로크기 : " + ph1.hszie);
		//System.out.println("가로크기 : " + ph1.vsize);
		//System.out.println("LCD유무 : " + ph1.hasLCD);
		
		System.out.println("===ph.1===");
		System.out.println("ph1");
		ph1.call();
		ph1.receiveCall();
		ph1.sendSms();
		ph1.receiveSms();
		ph1.viewData();
		
		System.out.println("===ph.2===");
		Phone ph2 = new Phone("새로운 폰", "아이폰17pro");
		System.out.println("ph2");
		ph1.call();
		ph1.receiveCall();
		ph1.sendSms();
		ph1.receiveSms();
		ph2.viewData();
		
		Scanner scan = new Scanner(System.in);
		System.out.print(">> 메세지를 입력하세요 : ");
		String sms = scan.nextLine();
		System.out.println("");
		ph1.receiveSms();
	}

}
