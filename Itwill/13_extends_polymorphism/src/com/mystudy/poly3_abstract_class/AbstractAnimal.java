package com.mystudy.poly3_abstract_class;


// 추상클래스 : abstract class
// class에는 추상메소드가 올 수 없음. 구현메소드만 가능.
// 해결방법 - 구현해야 함, class 앞에 abstract 쓰면 돼.
// class에 추상메소드가 1개 이상 있으면 추상클래스로 선언
// 추상클래스에는 객체(인스턴스) 생성 할 수 없음.

abstract class AbstractAnimal {
	String name; // 이름, 명칭
	int legCnt; // 다리갯수
	
	void eat() {
		System.out.println("먹는다");
		
	}
	void sleep() {
		System.out.println(">> 잠을 잔다");
	}

	abstract void sound(); // 추상메소드(abstract 메소드)
	
	
}