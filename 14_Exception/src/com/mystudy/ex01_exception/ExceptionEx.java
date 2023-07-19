package com.mystudy.ex01_exception;

public class ExceptionEx {

	public static void main(String[] args) {
		System.out.println("--- main()의 시작 ---");
		int num1 = 100; 
		int num2 = 30;
		int result = 0;
		System.out.println(">> 연산 시작");
		
		// result = num1 / num2; // ArithmeticException : / by zero
		
		// 예외처리 ---------
		if (num2 == 0) {
			System.out.println("[예외발생] 나누는 값이 0입니다.");
		} else {
			result = num1 / num2;
			System.out.println("연산결과 result : " + result);
		}
		
		System.out.println();
		System.out.println("=== try ~ catch 예외처리 ===");
		
		// 잡을 수 없는 예외는 빠져나가니까 작은 타입을 먼저 작성하고 큰 타입을 뒷쪽에 작성해라!
		
		try {
			System.out.println("--- try문 시작");
			result = num1 / num2;
			System.out.println("연산결과 result : " + result);
			System.out.println("--- try문 끝");
			// return;  <--- 메소드 종료
		} catch (ArithmeticException e) { 	// try ~ catch 예외가 발생하면 붙잡아라
			System.out.println("[예외발생] 나누는 값이 0입니다.");
			System.out.println("[예외발생] - ArithmeticException]" + e.getMessage());
								// e에 담겨있는 메세지를 출력할 수 있음. ( = / by zero)
		} catch (RuntimeException e) {
			System.out.println("[예외발생] - RuntimeException" + e.getMessage());
		} catch (Exception e) {
			System.out.println("[예외발생] - Exception" + e.getMessage());
		} finally {
			System.out.println("*** >> finally : 항상 무조건 실행된다 << ***");
		}
		
		System.out.println("--- test : try ~ catch ~ finally 이후 문장 ---");
		
		
		
		System.out.println("--- main()의 끝 ---");

	}

}
