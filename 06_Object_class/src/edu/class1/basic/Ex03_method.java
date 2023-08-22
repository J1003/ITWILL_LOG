package edu.class1.basic;

public class Ex03_method {
	
	Ex03_method() {} // 기본생성자.

	public static void main(String[] args) {
		int num1 = 500;
		int num2 = 200;
		int sum = 0;
		
		sum = add(num1, num2); //메소드 실행(호출)하고 나면 int 값을 되돌려 받는다.
		System.out.println("sum : " + sum);
		
		// 객체를 통하면 static이던 non-static이던 다 사용가능.
		// static 영역에서는 non-static 영역 접근시 객체(인스턴스)를 통해서 사용해야 함.
		// 인스턴스(객체)를 사용하면 static, non-static 변수, 메소드 모두 사용가능.
		Ex03_method ex03 = new Ex03_method(); //{new 생성자호출()}
		System.out.println("sub : " + ex03.sub(num1, num2));
		System.out.println("mul : " + ex03.mul(num1, num2));
		System.out.println("div : " + ex03.div(num1, num2));
	}
	
	// 메소드 선언(static)
	static int add(int a, int b){   //class 영역 안에 작성! 밖으로 넘어가면 오류!
		return a + b;
	}
	// 메소드 선언(non-static)
	int sub(int a, int b) {
		return a - b;
	}
	
	int mul(int a, int b) {
		return a * b;		// return을 만나면 거기서 거기서 정지됨
	}
	
	int div(int a, int b) { // 리턴타입 -> 있다 = 무한대, 없다 = void
		return a / b ;		// 리턴타입 & 파라미터의 유 or 무로 형태를 구분한다.
	}
	
	//====================================
	// 메소드 형태 : 파라미터 & 리턴값의 유무에 따라 4가지 형태로 구분한다.
	void method1 () {
		System.out.println("파라미터 X, return 값 X");
	}
	
	void method2 (String param) { //param 파라미터
		System.out.println("파라미터 O, return 값 X");
	}
	
	String method3 () {
		System.out.println("파라미터 X, return 값 O");
		return "파라미터 X, return 값 O";
	}
	
	String method4 (String param) { //param 파라미터
		System.out.println("파라미터 O, return 값 O");
		return "파라미터 O, return 값 O"; 
	}	
}
