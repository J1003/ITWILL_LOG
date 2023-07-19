package com.mystudy.poly2_overriding;

public class TypeTest {

	public static void main(String[] args) {
		Animal an = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Pig pig = new Pig();
		
		cat.sound();
		dog.sound();
		pig.sound();
		
		System.out.println("--- 메소드 오버로딩(overloading)");
		sound_overloading(cat);
		sound_overloading(dog);
		
		System.out.println("-- instanceof 타입체크");
		sound_instanceof(cat);
		sound_instanceof(dog);
		sound_instanceof(pig);
		
		
		System.out.println("=== 메소드 오버라이딩(overriding) 사용 ===");
		sound(an);
		sound(cat);
		sound(dog);
		sound(pig);
	}
	
	
	// 메소드 오버라이딩(overriding) 사용
	// sound라는 똑같은 형식의 메소드가 있으면 하위타입에 있는지 확인 후 있으면 
	// 최종 즉 마지막에 정의되어 있는 메소드를 사용한다.
	// 실체가 Animal 타입의 경우 하위가 없기 때문에 sound에 "소리없음"으로 나온다.
	// 다형성 - 상위타입에 담은 객체들에 따라 야옹, 멍멍, 꿀꿀, 소리없음 등 다양하게 추출된다.
	static void sound(Animal animal) {
		animal.sound();
	}
	

	// instanceof를 사용하여 타입을 확인하는 패턴
	static void sound_instanceof(Animal animal) { //부모타입으로 전달해주고 타입 체크!
		if (animal instanceof Cat) {
			((Cat)animal).sound();
		} else if (animal instanceof Dog) {
			((Dog) animal).sound();
		}
		
	}
	
	// 메소드 오버로딩(overloading) 방식 ========
	static void sound_overloading(Cat cat) {
		cat.sound();
	}
	static void sound_overloading(Dog dog) {
		dog.sound();
	}
	static void sound_overloading(Pig pig) {
		pig.sound();
	}
}
