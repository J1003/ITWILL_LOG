package com.mystudy.innerclass;

public class StaticClassTest { //외부클래스
	int a = 100;
	private int b = 100;
	static int c = 200;
	
	static int sum = 0;
	static int sNum1 = 20;
	static int sNum2 = 30;
	
	static void sum() {
		//sum =  sNum1 + sNum2; // 결과값 : 50
		sum = Inner.d + sNum2; // 결과값 : 1000 + 30
		//같은 static이기 때문에 Inner.d도 가능하다.
	}
	
	
	// static(스태틱) 내부 클래스
	static class Inner {
		static int d = 1000;
		int e = 2000; // non-static
						
		void printData() {  
			// non-static 메소드지만 클래스가(외부에 있는 박스 자체가) static이라 못 쓴다.
			// 이 필드는 객체 생성 안 하고 못 쓴다.
			// static에서 non-static 영역에 접근할 수 없다.	
			System.out.println("외부 static int c : " + c);
			System.out.println("내부 static int d : " + d);
			System.out.println("내부 static int e : " + e);
			sum();
			System.out.println("외부 static int sum : " + sum);
		}
	}
	
	public static void main(String[] args) {
		int Num = StaticClassTest.c; // 메소드던 변수던 class명.으로 변수처리 해서 쓸 수 있다.
		
		// static 내부클래스의 static 필드변수 사용.
		int innerNum = StaticClassTest.Inner.d;
		
		// static 내부 클래스에 객체(인스턴스) 생성 후 printData() 호출(실행)
		StaticClassTest.Inner inner = new StaticClassTest.Inner();
		inner.printData();
	}

}
