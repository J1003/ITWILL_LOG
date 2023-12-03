package com.mystudy.poly4_interface;

public abstract class AbstractAnimal implements Animal {
	private String name = "동물"; //이름, 명칭
	int legCnt; // 다리갯수
	
	// 생성자 생성
	public AbstractAnimal() {}
	public AbstractAnimal(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	
	@Override
	public void eat() {
		System.out.println(">> 먹는다");
	}

	@Override
	public void sleep() {
		System.out.println(">> 잠을 잔다");
	}

	@Override
	public abstract void sound();
		 //인터페이스 Animal을 구현한다.
		 // 중간 역할을 할 추상 클래스를 만들었다.
}
