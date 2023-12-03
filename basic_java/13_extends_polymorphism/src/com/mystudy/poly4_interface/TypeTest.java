package com.mystudy.poly4_interface;

public class TypeTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.sound();
		cat.sleep();
		cat.sound();
		
		dog.sound();
		
		Pig pig = new Pig();
		pig.sound();
		
		System.out.println("==== Animal 타입 사용 (Cat 객체를 가져다가) ====");
		Animal animal = new Cat(); // Cat 타입의 객체를 Animal에 저장했다
		animal.eat();
		animal.sleep();
		animal.sound();
		
		// 타입 변경시 해당 데이터 타입에 정의된 기능(메소드)만 사용 가능!
		// animal.test(); // <--- undefined 정의될 수 없음.
		
		System.out.println("=== 메소드 파라미터 Animal 인터페이스 사용 ===");
		soundPoly(cat);
		soundPoly(dog);
		soundPoly(pig);
	}
	// 인터페이스 Animal 타입으로 데이터를 받아서
	// 인터페이스 타입의 저장된 데이터에 있는 sound() 메소드를 호출한다.
	// 이 때, (메소드 오버라이딩에 의해서 저장된 객체의 메소드가 최종 호출된다.)
	static void soundPoly(Animal animal) {
		animal.sound();
	}
	
}
