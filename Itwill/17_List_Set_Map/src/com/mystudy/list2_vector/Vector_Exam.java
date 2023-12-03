package com.mystudy.list2_vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Vector_Exam {

	public static void main(String[] args) {
		// Vector 클래스 : List 인터페이스를 구현한 구현체
		Vector<String> v = new Vector<String>();
		//List<String> v = new Vector<String>();
		v.add("1");
		v.add("2");
		v.add("3");
		// List에 있는 건지 Vector에 있는 건지 출력하려면 설정하는 것에 따라 다 쓸 수 있다.
		
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());
		
		String temp = v.toString(); 
		System.out.println(temp);
		
		v.remove(2);
		System.out.println(v);
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());
		
		
		System.out.println("--- v.trimToSize() 실행후 ---");
		v.trimToSize();
		System.out.println(v);
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());
		
		v.addElement("4문자열");
		System.out.println();
		
		v.add("AAA"); // 맨 뒤에 추가
		System.out.println(v);
		
		v.add(2, "BBB"); // 삽입, 특정위치에 입력(insert)
		System.out.println(v);
		
		Vector<String> v2 = (Vector)v.clone();
		System.out.println("v : " + v);
		System.out.println("v2 : " + v2);
		
		// (개인별 실습)주소값 복사인지 물리적으로 분리된 복사본인지 확인
		
		
		//// Enumeration
		System.out.println("===== Enumeration 객체 사용 =====");
		Enumeration<String> enu = v.elements();
		while(enu.hasMoreElements()) {   // while문 : OO이 있냐? 데이터를 달라!
			System.out.println("enu.nextElement() : " + enu.nextElement());
		}
		System.out.println("---------");
		// (개인별 실습) 기본 for문 사용해서 화면출력 (Enumeration 객체 사용)
		
		//=====================
		
		Iterator<String> ite = v.iterator();
		// hasnext -> 데이터가 있냐 // next -> 그 데이터를 가져다 쓸 때.
		System.out.println("ite.hasNext() : " + ite.hasNext());
		while (ite.hasNext()) {
			System.out.println("ite.next() : " + ite.next());
		}
		System.out.println("ite.hasNext() : " + ite.hasNext());
		
		
		System.out.println("=== 개선된 for문 사용 데이터 조회 ===");
		for (String str : v) {
			System.out.println(str);
		}
	}
	
}
