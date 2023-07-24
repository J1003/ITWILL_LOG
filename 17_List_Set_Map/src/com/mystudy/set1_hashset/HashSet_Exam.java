package com.mystudy.set1_hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Exam {

	public static void main(String[] args) {
		// HashSet : set 인터페이스 구현한 구현체(클래스)
		// 특징 : 중복데이터 없음(동일데이터는 1개만 저장), 순서가 없다.
		// ---------------------
		// Set에서 동일데이터 여부 확인할 때 hashCode(), equals() 값을 확인한다.
		// 1. 해시코드 값 확인 : hashCode()
		// 2. equals() 메소드 결과값이 모두 일치하면 동일데이터 처리.
		
		HashSet<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("김유신");
		set.add("홍길동");
		set.add(new String("홍길동"));
		
		System.out.println("set : " + set);
		System.out.println("set.size() : " + set.size());
		System.out.println("\"홍길동\".hashCode() : " + "홍길동".hashCode());
		System.out.println("new String(\"홍길동\").hashCode() : " + new String("홍길동"));
	
		System.out.println("set.contains(\"홍길동\") : " + set.contains("홍길동"));
		System.out.println("set.contains(\"김자바\") : " + set.contains("김자바"));
		
		set.add("을지문덕");
		set.add("홍경래");
		
		System.out.println("set : " + set);
		
		System.out.println("--- Set 전체 데이터 조회");
		for (String name : set) {
			System.out.println(name);
		}
		
		System.out.println("--- Set 전체 데이터 조회 (Iterator 사용)");
		Iterator<String> ite = set.iterator();
		while (ite.hasNext()) {
//			String name = ite.next();
//			System.out.println(name);
			System.out.println(ite.next());
		}
		
		System.out.println("=== 김유신 ---> 강감찬(수정/변경) ===");
		// 수정(변경) : 김유신 ---> 강감찬
		// 일단 김유신이 있는지 확인하고 있으면 변경하고, 없으면 진행하지 않는다.
		// 김유신 삭제 and 강감찬 입력
		// 강감찬 입력 and 김유신 삭제
		System.out.println("수정전 : " + set);
		
		// 있늕 ㅣ확인하고 있으면 수정작업, 없으면 작업중단
		if (set.contains("김유신")) {
			System.out.println(">> 김유신 있음 : 수정 처리");
			set.remove("김유신");
			set.add("강감찬");
		} else {
			System.out.println(">> 김유신 없음 : 작업처리 안함");
		}
		
		System.out.println("수정후 : " + set);
		
		if (set.remove("홍길동2")) {
			System.out.println(" 삭제처리됨");
		} else {
			System.out.println("없어서 삭제 못 함");
		}
		
		
		System.out.println("--- 전체 데이터 화면 출력");
		for (String name : set) {
			System.out.println(name);
		}
		
		
//		for (int i = 0; i < set.size(); i++) {
//			set.remove("김유신");
//		}
//		
//		Iterator<String> kim = set.iterator();
//		while (kim.hasNext()) {
//			String inside = kim.next();
//			if (inside.equals("김유신")) {
//				kim.remove();
//				set.add("강감찬");
//			}
//		break;
//		}
//		System.out.println("수정후 : " + set.toString());
//		
		
		
	}

}
