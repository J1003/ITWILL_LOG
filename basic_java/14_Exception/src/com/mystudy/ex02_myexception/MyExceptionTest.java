package com.mystudy.ex02_myexception;

public class MyExceptionTest {

	public static void main(String[] args) throws MyException {
		System.out.println("--- main() 시작 ---");
		//throw new MyException("처음만든예외");
		
		try {
		firstMethod();
		} catch (MyException e) {
			//e.printStackTrace();
			System.out.println("메인 캐치문 실행");
			System.out.println("오류메세지 ::: " + e.getMessage());
		}
		
		System.out.println("--- main() 끝 ---");
	}

	private static void firstMethod() throws MyException {
		System.out.println("--- firstMethod() 시작 ---");
		secondMethod();
		System.out.println("--- firstMethod() 끝 ---");
	}

	private static void secondMethod() throws MyException {
		System.out.println("---- secondMethod() 시작 ----");
		// 예외 발생시키기
		throw new MyException("secondMethod()에서 예외 발생");
		
		//System.out.println("---- secondMethod() 끝 ----"); <-- try~catch 안 하면 출력 못 함
	}

}
