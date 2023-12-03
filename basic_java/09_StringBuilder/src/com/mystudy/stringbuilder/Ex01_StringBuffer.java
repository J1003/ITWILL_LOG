package com.mystudy.stringbuilder;

public class Ex01_StringBuffer {

	public static void main(String[] args) {
		// StringBuffer 클래스
		// StringBuffer 데이터 문자열들을 수정하고 변경할 때 사용하는 자료형이다.
		// append - StringBuffer자료형은 append 메서드를 사용하여 계속해서 문자열을 추가해 나갈 수 있다
		// Buffer는 여유공간
		
		StringBuffer sb = new StringBuffer("Hello Java!!!");
		System.out.println(sb);
		String str = sb.toString(); //StringBuffer의 저장 문자열 확인할 때 .toString 쓴다.
		System.out.println("sb.length() : " + sb.length());
		System.out.println("sb.capacity() : " + sb.capacity());
		
		System.out.println("---- String : 데이터 불변(immutable) ----");
		String str1 = sb.toString();
		System.out.println("str1 : " + str1);
		String str2 = str1.concat(" 반갑습니다"); 
		// concat = 괄호 안 문자열을 전부 결합해서 반환해 주는 함수(오픈사전)
		// str1에 저장한다고 데이터가 바뀌는 게 아니라 "Hello Java"라는 스트링 타입의 새로운 객체가 만들어진다.
		System.out.println("str2 : " + str2);
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("---------");
		
		System.out.println("--- StringBuffer : 데이터 변경 가능 ----");
		System.out.println("sb : " + sb.toString());
		
		sb.append(" 반갑습니다").append("~~~"); // 객체 자체에 .append를 하면 데이터 객체가 바뀐다!!!
		System.out.println("append 후 sb : " + sb.toString());
		System.out.println("sb.length() : " + sb.length());    	//length랑 capacity 값 바뀐 거 확인!!!
		System.out.println("sb.capacity() : " + sb.capacity()); // 위 참고!
		// .append(" 반갑습니다").append("~~~"); --> 데이터를 계속 바꿔 줄 수 있다.
		
		sb.reverse();
		System.out.println("reverse 후 sb : " + sb.toString());
		sb.reverse();
		System.out.println("reverse 후 sb : " + sb.toString()); //뒤집었던 걸 또 뒤집으면 원상복귀!
	
	
		System.out.println("=== delete(), insert(), replace() ====");
		// Hello Java!!! 반갑습니다~~~ <-- 현재 이 문자열이다.
		// Java!!! 반갑습니다~~~ 로 만들어 보면
		StringBuffer sb2 = sb.delete(0, 6);  
		// toString은 전체 데이터를 불러 올 수 있는 유일한 방법이다.
		System.out.println("sb.delete(0, 6) : " + sb2.toString()); // delete->작업이 끝난 그 객체를 다시 리턴해준다.
		System.out.println("sb : " + sb.toString());
		System.out.println("sb == sb2 : " + (sb == sb2));
		// 객체 하나 가지고 다 바꿀 수 있음. 과정 중에 불필요한 데이터들이 안 만들어진다.ㅎㅎ
		
		sb.insert(0, "Hello ");
		System.out.println("sb(0, \"Hello\") : " + sb.toString());
		
		sb.replace(0, 5, "Hi, ");
		System.out.println("sb.replace(0, 5, \"Hi, \") : " + sb.toString());
		
		System.out.println("sb.length() : " + sb.length()); // 용량 확인
		System.out.println("sb.capacity() : " + sb.capacity()); // 용량 확인
		System.out.println("-------------");
		
		sb2 = new StringBuffer(100);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		
		sb2.append("안녕하세요");
		System.out.println("sb2 : " + sb2.toString());
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		
		System.out.println("---- trimToSize() 실행하면 ----");
		sb2.trimToSize(); // 크기를 줄여주고 여유공간 삭제 후 끝! 리턴값이 없음! void가 없다(?)
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		
		System.out.println("----- sb2.setLength(5) 실행하면 -----");
		sb2.setLength(5); // 데이터 크기 설정 (작게 설정하면 delete 효과)
		//sb2.delete(5, sb.length()); // --> 5번 인덱스부터 맨 마지막까지! 앞에 5개 남기고 모두 삭제!
		System.out.println("sb2 : " + sb2.toString());
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		
		System.out.println("---- sb2.setLength(0) 실행하면 ----");
		sb2.setLength(0); //delte 써서 삭제해도 되고, setLength를 써서 삭제해도 된다!!!!
		//sb2.delete(0, sb.length()); // 전체 데이터 삭제
		System.out.println("sb2 : -" + sb2.toString()); //"sb2 : -" <-- '-' 좌우로 빈칸 있는지 확인/
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
	
		// CRUD 입력 수정 삭제 조회 검색 읽기
	}

}
