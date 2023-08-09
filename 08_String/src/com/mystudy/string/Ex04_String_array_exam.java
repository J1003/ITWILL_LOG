package com.mystudy.string;

import java.util.Arrays;

public class Ex04_String_array_exam {

	public static void main(String[] args) {
		/* String[]과 String 메소드 사용 실습
		문자열 : "홍길동","이순신","이순신","을지문덕","김유신","연개소문","Tom","TOM"
		1. 위의 문자열 값을 저장할 수 있는 문자열 배열(names) 변수를 선언하고 입력
		2. 배열에 있는 값을 구분자 콤마(,)로 구분하여 한 라인에 출력
		   출력 예) 홍길동,이순신,이순신,을지문덕....
		3. 배열에 있는 데이터의 첫 글자만 출력-구분자 콤마(,) 사용 한 라인에 출력
		   출력 예) 홍,이,이,을,김,연,T,T...
		4. 이름의 글자수가 4글자 이상인 이름을 검색해서 "인덱스번호:이름" 형태로 출력
		   예) 3:을지문덕
		5. 이름이 같은 데이터를 "인덱스번호:이름=인덱스번호:이름" 형태로 출력
		   예) 1:이순신=2:이순신
		(기타) 이름 비교시에는 대소문자 구분 없이 비교처리(Tom, TOM 은 같다)
		========================================================= */
		

//		String[] names = new String[8];
//		names[0] = "홍길동";
//		names[1] = "이순신";
//		System.out.println(Arrays.toString(names));
		
		
		//1번/////////////////////////////////////////////////
		System.out.println("=== 문제1 ===");
		String[] names = {"홍길동", "이순신", "이순신", "을지문덕", "김유신", "연개소문", "Tom", "TOM"};
//		변수를 선언과 동시에 쓰면 {} 앞에 " new String[8] " 생략 가능
		System.out.println();
		
		//2번/////////////////////////////////////////////////////////
		System.out.println("=== 문제2 ===");
		///// 선생님 답변 ////
		for (int i = 0; i < names.length; i++) {
			if (i == names.length - 1) { // 마지막 데이터냐?
				System.out.print(names[i]);
			} else {
				System.out.print(names[i] + ",");
			}
		}
		System.out.println();
		
		/// 처음부터 마지막 이전까지
		for (int i = 0; i < names.length - 1; i++) {
			System.out.print(names[i]+ ",");
		}
		System.out.println();
		
		/// 마지막 데이터 처리
		if (names.length > 0) {
			System.out.print(names[names.length - 1]);
		}
		System.out.println();
		
		// 패턴 : 이름, / 이름(마지막)
		for (int i = 0; i < names.length; i++) {
			if (i == 0) { // 첫번째냐?
				System.out.print(names[i]);
			} else {
				System.out.print("," + names[i]);
			}
		}
		System.out.println();
		
		System.out.println(names[0]);
		for (int i = 1; i < names.length; i++) {
			System.out.print("," + names[i]);
		}
		System.out.println();
		
		
		boolean isFirst = true;
		for (String name : names) {
			if(isFirst) {
				System.out.println(name);
				isFirst = false;
			} else {
			System.out.print(name +",");
		}
		}
		System.out.println();
		
		///-----내 답변-------///
		for (String name : names) {
			System.out.print(name + ",");
		}
		System.out.println();
		
		
		//3번/////////////////////////////////////////////////////////
		System.out.println("=== 문제3 ===");
		///// 선생님 답변 ////
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i].charAt(0) + ",");
		}
		System.out.println();
		
		
		///-----내 답변-------////
		for (int i = 0; i < names.length; i++) {
			String namesj = names[i];
			System.out.print(namesj.charAt(0) + ",");
		}
		System.out.println();
		
		//4번/////////////////////////////////////////////////////////
		System.out.println("=== 문제4 ===");
		for (int i = 0; i < names.length; i++) {
			if(names[i].length() >= 4) {
				System.out.print(i + ":" + names[i]);
			}
		}
		System.out.println();
		
		///-----내 답변-------///
		for (int i = 0; i < names.length; i++) {
			String namesj = names[i];
			if (namesj.length() >= 4) {
				System.out.print(i + " : " + namesj);
			}
		}
		System.out.println();
		
		//5번///////////////////////////////////////////////////////////
		System.out.println("=== 문제5 ===");
		int lastIndex = names.length - 1;
		for (int baseIdx = 0; baseIdx < names.length - 1; baseIdx++) { //lenth -1 : 마지막 데이터
			for (int i = baseIdx + 1; i < names.length; i++) {
				if (names[baseIdx].equalsIgnoreCase(names[i])) { 
					//IgnoreCase 대소문자 구분 없이 equals 같이 뽑는다. // equals만 쓰면 구분이 된다.
					System.out.println(baseIdx + ":" + names[baseIdx]
							+ " = " + i + ":" + names[i]);
				}
			}
		}
		
		// 인덱스 : 	0 	1 	 2 	  3	 	4 	 5 		6 	7(마지막 : length-1)
		// 데이터 : 홍길동 이순신 이순신 을지문덕 김유신 연개소문 Tom TOM
		names = new String[]  {"홍길동", "이순신", "이순신", "을지문덕", "김유신", "연개소문", "Tom", "TOM"};
		if (names[0].equalsIgnoreCase(names[1])) {
			System.out.println(0 + ":" + names[0] + "=" + 1 + ":" + names[1]);
		} 
		if (names[0].equalsIgnoreCase(names[2])) {
			System.out.println(0 + ":" + names[0] + "=" + 2 + ":" + names[2]);
		} // 데이터값 바꾸지 않는 이상 출력없음
		if (names[0].equalsIgnoreCase(names[3])) {
			System.out.println(0 + ":" + names[0] + "=" + 3 + ":" + names[3]);
		}
		//
		// 마지막 데이터 비교
		if (names[0].equalsIgnoreCase(names[names.length - 1])) {
			System.out.println(0 + ":" + names[0] + "=" + (names.length - 1) + ":" + names[names.length - 1]);
		}
		System.out.println();
		
		// ----- 위에껄로 다시 만들어주면?
		// 기준인덱스 : 0
		for (int i = 1; i < names.length; i++) {
			if (names[0].equalsIgnoreCase(names[i])) {
				System.out.println(0 + ":" + names[0] + "=" + 1 + ":" + names[i]);
			} 
		}
		// 기준인덱스 : 1
		for (int i = 2; i < names.length; i++) {
			if (names[1].equalsIgnoreCase(names[i])) {
				System.out.println(1 + ":" + names[1] + "=" + 1 + ":" + names[i]);
			} 
		}
		// 기준인덱스 : 2
		for (int i = 3; i < names.length; i++) {
			if (names[2].equalsIgnoreCase(names[i])) {
				System.out.println(2 + ":" + names[2] + "=" + 1 + ":" + names[i]);
			} 
		}
		// 기준인덱스 : 3 ~ (생략)
		
		// 기준인덱스(최종적용할 마지막 기준 인덱스) : 마지막 이전 인덱스
		for (int i = names.length -1 ; i < names.length; i++) {
			if (names[names.length - 2].equalsIgnoreCase(names[i])) {
				System.out.println(names.length - 2 + ":" + names[names.length - 2] + "=" + 1 + ":" + names[i]);
			} 
		}
		
		System.out.println("== 이중 for문 작성 ==");
		lastIndex = names.length - 1;
		System.out.println("마지막 인덱스 번호 : " + lastIndex);
		System.out.println("----");
		//기준인덱스 : 0 ~ 마지막 이전 인덱스
		for (int gijun = 0; gijun < lastIndex; gijun++) {
			for (int i = gijun + 1; i < names.length; gijun++) {
				if (names[gijun].equalsIgnoreCase(names[gijun])) {
					System.out.println(gijun + " " + names[gijun]);
				}
			}
		}
		
		
		// .equalsIgnoreCase() 이거 메모 안 해둠.
		// 선생님이 말했다고 하는데 안 한듯 :)
		
		String namesjj = new String("Tom");
		String namesjjj = new String("TOM");
		System.out.println(namesjj == namesjjj);
		System.out.println(namesjj.equals(namesjjj));
		
	}
}
