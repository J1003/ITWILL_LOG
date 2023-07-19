package com.mystudy.poly2_overriding;

class Cat extends Animal {
	
	// 부모클래스(Animal)의 sound() 메소드와 동일하게 선언하고,
	// 기능은 다르게 구현! (메소드 재정의 - method overriding)
	// 메소드 재정의시 기본적으로 메소드 선언부를 동일하게 작성
	// 단, 메소드 접근제한자의 범위를 부모와 동일하거나, 더 크게(넓게) 정의 가능!
	// 		(부모가 허용한 것보다 좁게 설정할 수 없다)
	
	// 재정의해서 사용할 때는 오버라이드 어노테이션을 쓰는 게 좋다.
	@Override // 메소드 오버라이딩해서 사용하는 메소드임을 컴파일러에게 알리는 어노테이션(주석문)이다.
	public void sound() {  //public, protected 가능 BUT private 불가능.
		System.out.println(">> 야옹야옹야옹야옹 ");
	}
}
