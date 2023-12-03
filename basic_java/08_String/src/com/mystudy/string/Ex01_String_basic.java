package com.mystudy.string;

public class Ex01_String_basic {

	public static void main(String[] args) {
		// String 클래스 : 문자열 저장, 처리하기 위한 클래스 
		// String 클래스 : "참조형 데이터 타입"
		// String 데이터는 불변임(immutable)
		// 모든 참조형 데이터는 객체를 사용해서 나타낸다.
		// --------------------
		// 사용형식 2가지 
		// String str = "홍길동"; // 기본 데이터 타입처럼 사용 가능
		// String str = new String("홍길동"); // 객체(인스턴스) 생성
		// --------------------
		String str1 = "홍길동";
		String str2 = "홍길동";
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		// == : 객체(인스턴스, 주소값) 비교(동일 객체 여부 확인)
		System.out.println("str1 == str2 : " + (str1 == str2));
		/* 문자열 붙이기 처리가 돼서 "str1 == str2 : " + str1 이 부분 그대로  
		   str1 == str2 : 홍길동 이렇게 결과가 나온다. 그래서 () 괄호 처리 해줘야 함.
		*/
		System.out.println("str1 == str2 : " + str1.equals(str2));
		// '같은 객체'이고 '같은 문자열'이라서 true 값이 나온다. 
		System.out.println("----------");
		
		// !! 문자열 비교할 때는 equals를 써라 !!!
		 
		String strObj1 = new String("홍길동");
		String strObj2 = new String("홍길동");
		System.out.println("strObj1 : " + strObj1);
		System.out.println("strObj2 : " + strObj1);
		System.out.println("str1 == strObj2 : " + (str1 == strObj1)); //같은 객체냐, 같은 주소값이냐?
		System.out.println("str1.equals(strObj1) : " + str1.equals(strObj1));
		System.out.println("strObj1 == strObj2 : " + (strObj1 == strObj2));// 같은 객체냐?
		System.out.println("strObj1 == strObj2 : " + strObj1.equals(strObj2));// 같은 객체냐?
	
		System.out.println("=== 문자열 값 비교시 equal() 메소드 사용 ===");
		// equals() : 문자열 값을 비교할 때는 !!반드시!! equals() 사용할 것!!!!
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str1.equals(strObj1) : " + str1.equals(strObj1));
		System.out.println("strObj1.equals(strObj2) : " +strObj1.equals(strObj2));
	}

}
