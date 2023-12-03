package com.mystudy.stringbuilder;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex03_StringTokenizer {

	public static void main(String[] args) {
		// String 클래스의 split() vs StringTokenizer 클래스
		System.out.println("--- String split() ---");
		String str = "사과,배,복숭아,,포도"; 
		System.out.println("str : " + str.toString());
		// String에 있는 문자열을 가져다 쓰려면 toString!!!!
		// , , <- 스페이스 한 칸은 유의미한 의미임!!!
		// split은 빈 문자열도 배열 데이터로 취급한다.
		
		String[] strSplit = str.split(","); // String[] 스트링 배열 타입
		System.out.println("strSplit.length : " + strSplit.length);
		System.out.println(Arrays.toString(strSplit));// Arrays.toString <- 배열에 있는 데이터를 간단히 보려면 
		
		System.out.println("---  str.split(\",\") 실행 결과 배열 ----");
		for (int i = 0; i < strSplit.length; i++) {
			System.out.println(i + ":" + strSplit[i]);
		}
		System.out.println();
		
		System.out.println("--- 개선된/향상된 for문으로 (또는 forEach) ---");
		for (String str2 : strSplit) {
			System.out.println(str2);
		}
		System.out.println("----");
		
		int idx = 0;
		for (String str2 : strSplit) {
			System.out.println(idx++ + ": " + str2);
			//  idx++; 이거 위에 출력란에 써도 된다!!!
		}
		
		System.out.println("\n ==== StringTokenizer ===="); //\n 한줄 띄우기.
		str = "사과,배,복숭아,,포도";
		System.out.println("str : " + str);
		
		StringTokenizer strToken = new StringTokenizer(str, ",");
		System.out.println("strToken.countTokens() : " + strToken.countTokens()); //데이터 갯수가 4개
		
		
		// while문 쓰는 게 직관적임!
		// for문으로도 쓸 수는 있음. 데이터 특성에 따라 맞춰서 써라!
		while (strToken.hasMoreTokens()) {
			String token = strToken.nextToken(); // nextToken 문자열을 가져다 줌.
			System.out.println("-" + token + "-");
		}
		// (주의) 토근이 없을 때 nextToken() 사용하면 <-- strToken.nextToken(); 
		// NoSuchElementException 예외 발생!
		System.out.println("strToken.countTokens() : " + strToken.countTokens());
		
		////////////////////////////////////////////////
		System.out.println("===============");
		System.out.println("----(실습) 토큰데이터 for문으로 화면 출력 ---");
		// 굳이 할 필요는 없지만 일단 for문으로도 쓸 수 있음...
		
		strToken = new StringTokenizer(str, ",");
		for (int i = 0; i < strToken.countTokens(); i++) {
			String token = strToken.nextToken();
			System.out.println("-" + token + "-");
			System.out.println("토큰갯수 : " + strToken.countTokens());
		}
		System.out.println();
//		
//		int tokenCnt = strToken.countTokens();
//		for (int i = 0; i < tokenCnt; i++) {
//			String token = strToken.nextToken();
//			System.out.println("-" + token + "-");
//			System.out.println("토큰갯수 : " + strToken.countTokens());
		
		////////
		String str1 = "사과,배,복숭아,,포도";
		StringTokenizer strToken1 = new StringTokenizer(str1,",");
		int a = strToken1.countTokens();
		for (int i = 0; i < a; i++) {
			System.out.print(strToken1.nextToken());
		}
		System.out.println();
		
		////////
		String str2 = "오이,당근,무,,배추,상추,호박";
		StringTokenizer strToken2 = new StringTokenizer(str2, ",");
		int b = strToken2.countTokens();
		for (int i = 0; i < b; i++) {
			System.out.print(strToken2.nextToken() + ",");
		}
		System.out.println();
		
		
	}

}
