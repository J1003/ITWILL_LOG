package com.mystudy.list3_linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Exam {

	public static void main(String[] args) {
		// Linked List : List 속성(List 인터페이스 구현체)
		// 연결 정보를 가지고 데이터를 정리한다.
		// ArrayList는 연속된 저장공간을 가지고 사용
		// linked list 연속된 저장공간 필요 없음
		
		//LinkedList<String> list = new LinkedList<String>();
		List<String> list = new LinkedList<String>();
		list.add("홍길동"); // 0번 인덱스
		list.add("홍길동"); // 1번 인덱스
		list.add("김유신"); 
		System.out.println("list : " + list);
		System.out.println("list.get(0) : " + list.get(0));
		
		list.remove("홍길동");
		System.out.println("list : " + list); //모든 홍길동을 삭제하는 게 아니라 하나만 삭제.
		
		String str = "홍길동,홍길동,김유신,강감찬,을지문덕,홍경래,김유신,홍길동";
		String[] names = str.split(",");
		System.out.println("names : " + Arrays.toString(names));
		// Arrays.toString() = 데이터에 담겨 있는 데이터 확인
		
		
		//배열에 있는 데이터를 리스트에 추가
		 for (int i = 0; i < names.length; i++) {
			 list.add(names[i]);
		 }
		 System.out.println("list : " + list);
		 
		 
		//   실습 ////////////////////////////////// 
		//list : [홍길동, 김유신, 홍길동, 홍길동, 김유신, 강감찬, 을지문덕, 홍경래, 김유신, 홍길동]
		//----------------------
		//(실습) 리스트에 있는 데이터 변경하기
		//1. 홍길동 : 모두 삭제(Delete)
		//2. 김유신 ---> 김유신2 모두 수정(Update)
		//-------------------------
		System.out.println("======  실습  ======");
		
		
		for (int i = 0; i < names.length; i++) {
			list.remove("홍길동");
		}
		System.out.println(list);
		
		list.set(0,"김유신2");
		list.set(1, "김유신2");
		list.set(5, "김유신2");
		System.out.println(list);
		
		/////
		// ==== 풀이1 ==========
		System.out.println("=== 풀이1 ===");
	
		Iterator<String> ite = list.iterator();
		// hasNext -> 데이터가 있냐 // next -> 그 데이터를 가져다 쓸 때.
		// ???? 문자열은 == 이게 아니라 .equals !!!!!! 완전 중요!!!!
		String inside = ite.next();
		while (ite.hasNext()) {
			if (inside.equals("김유신")) {
				ite.remove();
				list.add("김유신2");
			}
		break;
		}
		
		///////////////////////////////////
		// 쌤 답변
		System.out.println("// 쌤 답변 //");
		System.out.println("김유신 --> 김유신2로 모두 수정");
		
		for (int i = 0; i < list.size(); i++) {
			if ("김유신".equals(list.get(i))) {
				System.out.println(i + " : " + list.get(i));
				list.set(i, "김유신2");
			}
		}
		System.out.println("김유신 수정후 : " + list);
		
		System.out.println("==== 홍길동 : 모두 삭제(Delete) =====");
		System.out.println("홍길동 삭제전 : " + list);
		System.out.println("삭제전 size : " + list.size());
		/* 뒤에서부터 검색하고 찾으면 삭제 처리
		int size = list.size();
		int lastIdx = list.size() - 1;
		for (int i = lastIdx; i >= 0; i--) {
			System.out.println(i + " -  size : " + list.size());
			if ("홍길동".equals(list.get(i))) {
				System.out.println(i + " : " + list.get(i));
				list.remove(i);
			}
		}
		-----------------------*/
		System.out.println("list.remove(\"홍길동\") : " + list.remove("홍길동"));
		System.out.println("list.remove(\"ABC\") : " + list.remove("ABC"));
		
		
		/* 찾아서 삭제할 수 없을 때까지 삭제 반복처리
		//while (list.remove("홍길동")) {} <- 이걸 풀어내면 아래 참고
		while (true) {
			boolean removeSuccess = list.remove("홍길동");
			if (!removeSuccess ) { 		//삭제 실패시
				break;
			}
		}
		---------------------------- */

		System.out.println("list.contains(\"홍길동\") : " + list.contains("홍길동"));
		System.out.println("list.contains(\"ABC\") : " + list.contains("ABC"));
		/* 
		while (true) {
			if (list.contains("홍길동")) { // 데이터가 있냐?
				list.remove("홍길동");
			} else {
				System.out.println(">> 삭제 완료(작업끝)");
				break;
			}
		}
		--------------- */
		System.out.println("list.indexOf(\"홍길동\") : " + list.indexOf("홍길동"));
		System.out.println("list.indexOf(\"ABC\") : " + list.indexOf("ABC"));
		
		while (true) {
			int idx = list.indexOf("홍길동"); // 데이터의 위치를 확인해봐라.
			if (idx == -1) { // 데이터가 없으면?
				System.out.println(">> 삭제 완료(작업끝)");
				break; 		// 끝내라.
			}
			list.remove(idx); 
		}
		
		System.out.println("홍길동 삭제후 : " + list);
		System.out.println("삭제전 size : " + list.size());
	
		
		
		
		
		
		// ==== 풀이2 ==========
		
//		for (int i = list.size() - 1; i >= 0; i--) {
//		    String element = list.get(i);
//		    if (element.equals("김유신")) {
//		        list.remove(i);
//		        list.add(i, "김유신2");
//		    }
//		}
//		System.out.println(list);
		
	
		
		
		// ==== 친구 방식1 ==========
//		Iterator<String> ite = list.iterator();
//		
//		while (ite.hasNext()) {
//			if (ite.next().equalsIgnoreCase("김유신")) {
//				list.set(list.indexOf("김유신"),"김유신2);
//			}
//		}

		
		
		
		// ==== 친구 방식2 ==========
		
//		for (int i = 0; i < list.size(); i++) {
//			if(list.get(i).equalsIgnoreCase("김유신")) {
//				list.set(i, "김유신2")
//			}
//		}
//		System.out.println(list);
		
	}

}
