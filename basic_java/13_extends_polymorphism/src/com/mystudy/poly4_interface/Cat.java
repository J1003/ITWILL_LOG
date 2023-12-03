package com.mystudy.poly4_interface;

public class Cat extends AbstractAnimal {
	
	public Cat() {
		super("고양이"); //super 상위클래스, 부모클래스에 있는 메소드
	}
	
	@Override
	public void sound() {
		//System.out.println(getName() + "야옹야옹야옹");  <--super는 없어도 노상관. 명시적으로~
		System.out.println(super.getName() + "야옹야옹야옹");
		// super.getName() <--이 메소드는 부모타입에 있는 메소드이다.
		// super. 상위클래스, this. 현재/자신
	}
	
	// Cat에만 있는 메소드 - 못 쓴다. 
	// 인터페이스에 정의된 메소드만 쓸 수 있음.
	// 인터페이스에 정의가 되어 있어야 메소드의 오버라이딩이 적용이 된다. 
	public void test() {
		System.out.println(">> 테스트용 메소드 실행 <<");
	}
	
	
}
