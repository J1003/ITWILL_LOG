package com.mystudy.list1_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		// ArrayList : Array(배열)의 속성을 가진 리스트(목록)
		//ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<>();
		System.out.println("list1.size() : " + list1.size()); 
		System.out.println("list1.isEmpty() : " + list1.isEmpty());
		
		// 입력(C) : 맨 뒤에 추가
		list1.add(new Integer(5)); // Integer 저장
		list1.add(1); // int --> Integer 자동형변환 되어 입력됨
		list1.add(5); 
		list1.add(6);
		
		boolean isSuccess = list1.add(7);
		
		System.out.println("isSuccess : " + isSuccess);
		System.out.println(list1.toString()); // toString 안 써도 데이터 똑같이 출력됨.
		System.out.println("list1.size() : " + list1.size()); 
		System.out.println("list1.isEmpty() : " + list1.isEmpty());
		
		System.out.println("--- 검색(get)---");
		// 입력(C) : 지정된 특정 위치에 데이터 추가
		list1.add(0,100);
		System.out.println("0 인덱스에 100 add 후 : " + list1.toString());
		System.out.println("list1.size() : " + list1.size()); 
		
		// (주의) add, get, set, remove 사용시 인덱스 사용에 주의.
		// list1.add(100, 999); // IndexOufOfBoundsException
		
		System.out.println("--- 검색(get)---");
		// 검색, 조회(R) : 특정 위치의 데이터 읽기(조회, 검색, 확인, 선택)
		int firstData = list1.get(0);
		System.out.println("list1.get(0) : " + firstData);
		System.out.println(list1);
		
		
		// 데이터 존재 여부
		boolean isExist = list1.contains(999);
		System.out.println("list1.containts(999) : " + isExist);
		System.out.println("list1.contains(100) : " + list1.contains(100));
		
		
		System.out.println("--- 수정(set) ---");
		int returnValue = list1.set(1, 888);
		System.out.println("list1.set(1,888) : " + returnValue);
		//인덱스 1번에 있는 숫자 5를 숫자 888로 바꿔라!
		System.out.println(list1);
		
		
		System.out.println("--- 삭제(remove) ---");
		returnValue = list1.remove(0);
		System.out.println("list1.remove(0) 리턴값 : " + returnValue);
		System.out.println(list1);
		
		//list1.remove(5); // remove(int) 인텍스 찾아서 삭제
		isSuccess = list1.remove(new Integer(5)); // remove(object) 동일데이터 찾아서 삭제
		System.out.println(list1);
		System.out.println("list1.remove(new Integer(5)) 리턴값 : " + isSuccess);
		
		
		System.out.println("====================");
		System.out.println("reverse 전 list1 : " + list1);
		Collections.reverse(list1);
		System.out.println("reverse 후 list1 : " + list1);
		
		
		System.out.println("--------");
		//[7, 6, 1, 888]
		System.out.println("list1.subList(1,3)" + list1.subList(1,3));
		List<Integer> list2 = list1.subList(1, 3);
		// List에 커서 갖다대서  java.util에 있는 List로 바꿔주기
		ArrayList<Integer> list3 = new ArrayList<Integer>(list1.subList(1, 3));
		
		System.out.println("--- Collections.sort() ---");
		System.out.println("정렬 전 list1 : " + list1);
		Collections.sort(list1);
		System.out.println("Collections.sort(list1) 사용 후 : " + list1);
	
		System.out.println("==================");
		System.out.println("list1 : " + list1);
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(i + " : " + list1.get(i));
		}
		
		// (개인별실습)개선된(향상된) for문 ----

	}

}
