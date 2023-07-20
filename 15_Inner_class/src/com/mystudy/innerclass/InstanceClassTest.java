package com.mystudy.innerclass;

public class InstanceClassTest { // 외부 클래스
	int a = 100;
	private int b = 10;
	static int c = 200;
	int sum = 0;
	
	void sum() {
		sum = a + b;
	}
	
	// 내부 클래스 : static을 안 붙인 인스턴스 클래스
	class Inner {
		int in = 100;
		void printData() { // 내부에서는 외부에 있는 생성자들 호출해서 쓸 수 있음. (instance냐 아니냐에 따라 다르긴 하지만)
			System.out.println("외부 int a : " + a);
			System.out.println("외부 private int b : " + b);
			System.out.println("외부 static int c : " + c);
			sum();
			System.out.println("sum : " + sum);
			
			System.out.println("내부 클래스 필드 in : " + in);
		}
	}
	
	public static void main(String[] args) {
		InstanceClassTest out = new InstanceClassTest();
		System.out.println("필드변수 a : " + out.a);
		
		System.out.println("--- 내부 인스턴스 클래스 사용");
		// 내부클래스 타입 : 외부클래스명.내부클래스명
		// 만들어진 객체가 없으면 내부 클래스 객체를 만들어야 함!
		// 인스턴스 클래스의 객체(인스턴스) 생성하기 위해서는 외부클래스 객체를 통해서 생성할 수 있다.
		// InstanceClassTest.Inner = new InstanceClassTest().new Inner();
		InstanceClassTest.Inner inner = out.new Inner();
		inner.printData();
	}

}
