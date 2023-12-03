package com.mystudy.ex01_exception;

public class Exception_throw_throws {

	public static void main(String[] args) {
		// throw : 예외 발생시키기
		// throws : 예외(들) 던질 때(위임, 전가)
		// throws는 메소드 선언부에 사용한다.
		// --------------------------
		// throw new ArithmeticException();
		// throw new ArithmeticException("throw 테스트 중");
		//  Exception 계열은 강제 예외처리 //예외를 발생 시킴
		// throw new Exception(); // 예외를 발생시킴
		System.out.println("--- main() 시작 ---");
		int num1 = 100;
		int num2 = 50;
		int result = 0;
		
		System.out.println(">> 연산처리 시작");
		num2 = 0; // 어쩌다 0이 들어가면 예외 발생
		try {
			result = divThrows(num1, num2);
		} catch (Exception e) {
			e.printStackTrace(); // 예외가 발생한 곳이 어디인지 확인하고 싶을 때.
				// printStackTrace(); ---> [최종오류발생위치] 예외가 발생한 곳이 어디인지 확인.
			System.out.println("[예외발생] main() divThrows : " + e.getMessage());
		}
		
		System.out.println("계산결과 : " + result);
		
		System.out.println("--- main() 끝 ---");
	}
	
	// throws : 메소드 선언부에 작성해서 호출한 곳으로 예외를 던짐(위임, 전가)
	// throw : 예외를 발생시킴				 // 발생한 예외를 던져주겠다.(throws Exception)
	static int divThrows(int num1, int num2) throws Exception {
		System.out.println("---> divThrows() 시작");
		int result = 0;
		try {
			result = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println(">> 예외발생 : " + e.getMessage());
			throw new Exception(":: 내가 발생시킨 예외 ::");
		}
		System.out.println("---> divThrows() 끝");
		return result; 
	}
	
}
