package com.mystudy.list4_list_exam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_String_Exam {

	public static void main(String[] args) {
		/* List 중 ArrayList<String> 사용 실습
		문자열 : "홍길동","이순신","이순신","을지문덕"
		1. ArrayList 타입 names 변수를 선언하고 데이터 입력
		2. List에 있는 값을 구분자 콤마(,)로 구분하여 한 라인에 출력
		   출력 예) 홍길동,이순신,이순신,을지문덕
		3. List에 있는 데이터의 첫 글자만 출력
		   출력 예) 홍,이,이,을
		4. 이름이 을지문덕 찾아서 "인덱스번호:이름" 형태로 출력
		   예) 3:을지문덕
		5. 이름이 "이순신" 데이터 모두 삭제
		============================================ */
		
		
		//1. ArrayList 타입 names 변수를 선언하고 데이터 입력
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("홍길동");
		names.add("이순신");
		names.add("이순신");
		names.add("을지문덕");
		System.out.println(names);
		
		//2. List에 있는 값을 구분자 콤마(,)로 구분하여 한 라인에 출력
		//   출력 예) 홍길동,이순신,이순신,을지문덕
		
		
		
		/// 3. List에 있는 데이터의 첫 글자만 출력
		//   출력 예) 홍,이,이,을
		String str = "홍길동,이순신,이순신,을지문덕";
		String[] name = str.split(",");
		
		for (int i = 0; i < name.length-1; i++) {
			System.out.print(name[i].charAt(0) + ",");
		} System.out.println(name[name.length-1].charAt(0));
		
		System.out.println();
		
		/// 4. 이름이 을지문덕 찾아서 "인덱스번호:이름" 형태로 출력. 예) 3:을지문덕
	
		
		/// 5. 이름이 "이순신" 데이터 모두 삭제
		for (int i = 0; i < name.length; i++) {
			names.remove("이순신");
		}
		System.out.println(names);
		
		
		////// 쌤 답변
		System.out.println();
		System.out.println("--- 쌤 답변 -----");
		
		
		//1. ArrayList 타입 names 변수를 선언하고 데이터 입력
		//ArrayList<String> names = new ArrayList<String>();
		List<String> names2 = new ArrayList<String>();
		names2.add("홍길동");
		names2.add("이순신");
		names2.add("이순신");
		names2.add("을지문덕");
		System.out.println(names2);
		
		//2. List에 있는 값을 구분자 콤마(,)로 구분하여 한 라인에 출력
		//   출력 예) 홍길동,이순신,이순신,을지문덕
		for (int i = 0; i < names2.size(); i++) {
			if (i == 0) {
				System.out.print(names2.get(i));
			} else {
				System.out.print("," + names2.get(i));
			}
		}
		System.out.println();
		System.out.println("-----");
		int idx = 0;
		for (String name1 : names2) {
			if (idx == 0) {
				System.out.print(name1);
			} else {
				System.out.print("," + name1);
			}
			idx++;
		}
		System.out.println();
		
		System.out.println("== 문제3 ===========");
		//3. List에 있는 데이터의 첫 글자만 출력
		//   출력 예) 홍,이,이,을
		boolean isFirst = true;
		for (String name1 : names2) {
			if (isFirst) {
				System.out.print(name1.charAt(0));
				isFirst = false;
			} else {
				System.out.print("," + name1.charAt(0));
			}
		}
		System.out.println();
		
		System.out.println("=== 문제4 ==========");
		//4. 이름이 을지문덕 찾아서 "인덱스번호:이름" 형태로 출력
		//   예) 3:을지문덕
		for (int i = 0; i < names2.size(); i++) {
			if ("을지문덕".equals(names2.get(i))) {
				System.out.println(i + ":" + names2.get(i));
			}
		}
		
		System.out.println(">> 4글자 이상 ----");
		for (int i = 0; i < names2.size(); i++) {
			if (names2.get(i).length() >= 4) {
				System.out.println(i + ":" + names2.get(i));
			}
		}
		

		
	}

}
