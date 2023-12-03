package com.mystudy.stringbuilder;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex04_String_controls_exam {

	public static void main(String[] args) {
		/* 문자열 다루기
		0.문자열 데이터
		  String str1 = "홍길동 이순신  이순신 Tom 홍길동";
		  String str2 = "    TOM   을지문덕 김유신 연개소문";
		1. 위의 문자열을 StringBuilder 변수 sb를 이용해서 하나의 문자열로 만들고,
		2-1. sb의 문자열을 빈칸 1개(" ")를 구분자로 잘라서(이름만 추출) 화면 출력(데이터확인)
		     (String split() 또는 StringTokenizer 클래스 사용)
		      예) 홍길동,이순신,이순신,Tom,홍길동,TOM...
		2-2. 문자열을 저장할 수 있는 배열변수(names)에 저장
		3. 배열에 있는 값을 구분자 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
		      예) 홍길동,이순신,이순신,Tom,홍길동,TOM...   
		4. 데이터의 첫글자만 추출해서 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
		      예) 홍,이,이,T,홍,T,을... 
		5. 배열의 문자열중 이름의 글자수가 4 이상인 값을 "인덱스번호:이름" 출력
		      예) 인덱스번호:을지문덕
		*/
		
		// 1번 //////////////////////////////////////
		System.out.println("=== 0번 ~ 1번 ===");
		
		String str1 = "홍길동 이순신  이순신 Tom 홍길동";
		String str2 = "    TOM   을지문덕 김유신 연개소문";
		StringBuilder sb = new StringBuilder(str1);
		sb.append (str2);
		System.out.println(sb);
		
		// 2-1번 //////////////////////////////////////////////////
		System.out.println("=== 2-1번 ===");
		//// 선생님 답변 /////
		System.out.println(">>>> 선생님 답변");
		
		//String str = sb.toString();
		//String[] names = str.split(" ")
		String[] names = sb.toString().split(" ");
		System.out.println("names.length : " + names.length);
		System.out.println();
		
		// 저장된 배열 데이터 확인
		for (int i = 0; i < names.length; i++) {
			System.out.println(i + " : -" + names[i].length());
		}
		System.out.println();
		
		// 화면에 출력 : 홍길동,이순신,이순신,Tom,홍길동,TOM...
		System.out.println("--- equals()사용 ---");
		for (int i = 0; i < names.length; i++) {
			if (!"".equals(names[i])) { //문자열 비교할 때 == 써서 같냐 비교하지 말아라 모든 데이터 다 나옴.
//			!names[i].equals("") 위치에 null값이 담겨있을 수도 있기 때문에 웬만하면 위에 처럼 써라.
				System.out.print(names[i] + ",");
			}
		} System.out.println(names[names.length -1]); // 뒤에 , 쉼표처리 없애기.
		
		System.out.println();
		
		System.out.println("--- length() > 0 사용 ---");
		for (int i = 0; i < names.length; i++) {
			if (names[i] != null && names[i].trim().length() > 0) { //문자열 비교할 때 == 써서 같냐 비교하지 말아라 모든 데이터 다 나옴.
				System.out.print(i + " : - " + names[i] + " - ");
			}
		}
		System.out.println();

		
		System.out.println("=================");
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) continue;
			if (names[i].trim().length() < 1) continue;
			if (i == 0) {
				System.out.print(names[i]);
			} else {
			System.out.print("," + names[i]);
		}
		}
		System.out.println();
		
		
		/////////////////
		// 3번 //////////////////////////////////////////////////////
		System.out.println("===== 3번 =====");
		
		StringBuilder sb3 = new StringBuilder();
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) continue;
			if (names[i].trim().length() == 0) continue;
			if (i == 0) {
				sb3.append(names[i]);
			} else {
				sb3.append(",").append(names[i]);
			}
		}
		System.out.println(sb3.toString());
		
		
		///////////////////////
		// 4번 ///////////////////////////////////////////////////////
		System.out.println("==== 4번 =====");
		
		StringBuilder sb4 = new StringBuilder();
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) continue;
			if (names[i].trim().length() < 1) continue;
			if (i == 0) {
				sb4.append(names[i].charAt(0)).append(",");
			}
		}
		//sb4.delete(sb4.length() - 1, sb4.length());
		sb4.deleteCharAt(sb4.length() - 1); // 마지막 콤마(,) 삭제처리
		System.out.println("sb4 : " + sb4);
		
		
		System.out.println("==== StringTokenizer 사용 =====");
		System.out.println("StringBuilder(sb) : " + sb);
		StringTokenizer tokens = new StringTokenizer(sb.toString(), " ");
		System.out.println("토큰갯수 : " + tokens.countTokens());
		
		// 확인해보자.
		while (tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}
		
		tokens = new StringTokenizer(sb.toString(), " ");
		System.out.println("토큰갯수 : " + tokens.countTokens());
		
		String[] names2 = new String[tokens.countTokens()];
		System.out.println(names2.length);
		System.out.println(Arrays.toString(names2));
		
		
		int idx = 0;
		while (tokens.hasMoreTokens()) {
			// 배열에 저장
			names2[idx] = tokens.nextToken();
		}
		System.out.println(Arrays.toString(names2));
		
		System.out.println();
		
		// nextToken - 다음 토큰이 아니라 배열이 있으면 첫번째부터 그냥 들어간다.
		

		}
	
}
