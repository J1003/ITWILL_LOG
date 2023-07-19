package com.mystudy.string;

import java.util.Arrays;

public class Ex02_String_method {

	public static void main(String[] args) {
		// String 클래스 메소드 사용해서 문자열 처리 (단, 원본문자열 불변)
		//			0123456789    <- 인덱스 번호 //문자열을 사용할 때 인덱스 번호가 사용된다.
		String str = "Java World";
		System.out.println("str : " + str);
		
		
		System.out.println("---- charAt(인덱스번호) ----");
		char ch = str.charAt(0);
		System.out.println("str.charAt(0) : " + ch);
		System.out.println("str.charAt(1) : " + str.charAt(1));
		
		char[] ch2 = new char[4];
		
		for (int i = 0; i <ch2.length; i++) {
			ch2[0] = str.charAt(i);
		}
//		ch2[0] = str.charAt(0);
//		ch2[1] = str.charAt(1);
//		ch2[2] = str.charAt(2);
//		ch2[3] = str.charAt(3);
		System.out.println(Arrays.toString(ch2));
		
		System.out.println("---- compareTo() : 문자열비교(결과 : 음수, 0, 양수)");
		System.out.println("\"java\".comparTo(\"java\") : " + "java"); // <- \" 단순 역슬래쉬
		System.out.println("aaa vs aaa : " + "aaa".compareTo("aaa")); //0
		System.out.println("bbb vs aaa : " + "bbb".compareTo("aaa")); //1
		System.out.println("ccc vs aaa : " + "ccc".compareTo("aaa")); //2
		
		System.out.println("aaa vs bbb : " + "aaa".compareTo("bbb")); //-1
		
		System.out.println();
		System.out.println("===============");
		//		0123456789 
		str = "Java World";
		System.out.println("str : " + str);
		
		
		System.out.println("str.contains(\"Java\") : " + str.contains("Java"));//특정 문자열이 있냐 없냐 할 때 : contains
		
		
		System.out.println("---- indexOf() : 문자(문자열) 위치값 확인 ----");
		System.out.println("str.indexOf('X') : " + str.indexOf('X')); // -1 : 없다.
		System.out.println("str.indexOf('J') : " + str.indexOf('J')); // 0 : 리턴값이 첫번째 위치에 있다.
		System.out.println("str.indexOf(\"Java\") : " + str.indexOf("Java")); // 0 : 첫번째 위치
		System.out.println("str.indexOf('a') : " + str.indexOf('a')); // 1 : 두번째 위치
		System.out.println("str.indexOf('a', 2) : " + str.indexOf('a', 2)); // 3 : 세번째 위치
		System.out.println("---- lastIndexOf() : 문자(문자열) 찾기 (뒤에서부터) ");
		System.out.println("str.lastIndexOf('a') : " + str.lastIndexOf('a')); // 3
		
		System.out.println("------------");
		System.out.println("str.startsWith(\"Java\") : " + str.startsWith("Java")); // 자바로 시작하냐???
		System.out.println("str.startsWith(\"World\") : " + str.startsWith("World")); // 월드로 시작하냐???
		
		
		System.out.println("str.endsWith(\"Java\") : " + str.endsWith("Java")); // 자바로 끝나냐???
		System.out.println("str.endsWith(\"World\") : " + str.endsWith("World")); // 월드로 끝나냐???
	
		System.out.println("---- isEmpty() ----");
		System.out.println("str : " + str);
		System.out.println("str.isEmpty() : " + str.isEmpty());
		
		str = ""; //빈문자열
		System.out.println("str : -" + str + '-');
		System.out.println("str.isEmpty() : " + str.isEmpty());
		System.out.println("str.length() : " + str.length());
		System.out.println();
		
		System.out.println("----- replace() : 문자, 문자열 변경하고 변경된 문자열 받기(리턴) ----");
		//		0123456789 
		str = "Java World";
		System.out.println("str : " + str);
		System.out.println("str.replace(\"Java\", \"Hello\") : " + str.replace("Java", "Hello"));
		System.out.println("str.replace(\"a\", \"m\") : " + str.replace("a", "m")); 
		//문자 & 문자열 둘 다 변경 가능! BUT 원본 데이터는 안 바뀜! 원본데이터는 불변이다!!!!!!!!!
		System.out.println("str : " + str);
		System.out.println("-----------------");
		
		str = "Java Java";
		System.out.println("str : " + str);
		System.out.println("str.replace(\"Ja\", \"JA\") : " + str.replace("Ja", "JA"));
		System.out.println("str.replace(\"Java\", \"Hello\") : " + str.replace("Java", "Hello"));
		// replaceAll해도 똑같음. 단지 특정문자열을 바꿔야겠다 하면 replace를 써라!
		System.out.println("=======");
		
		System.out.println("----- substring() : 부분 문자열 추출 -----");
		//	   0123456789 
		str = "Java World";
		System.out.println("str : " + str);
		System.out.println("str.substring(5) : " + str.substring(5)); // 5번 인덱스 위치에서 끝까지.
		System.out.println("str.length() : " + str.length()); 
		
		
		// String.substring(int beginIndex, int endIndex)
		// beginIndex : 부터(포함)
		// endIndex : end 이전까지(불포함)
		System.out.println("str.substring(0, str.length()) : " + str.substring(0, str.length())); // 전체 데이터! 0부터 
		System.out.println("str.substring(0, 8) : " + str.substring(0, 8)); // 0부터(맨앞에서부터) 8이전까지
		
		// 뒤에서 5개 문자만 사용.
		System.out.println("str.substring(str.length() - 5)) : "
					+ str.substring(str.length() - 5)); // 뒤에서 5개의 문자 사용
		System.out.println("----------");
		
		str = " Java World  ";// 뒤에 띄어쓰기까지 
		System.out.println("str : -" + str + '-'); // "-" 앞뒤 스페이스 공간 확인
		System.out.println("str : -" + str.trim() + '-'); //앞뒤에 있는 스페이스를 잘라 없애고 문자열만 리턴해준다.
		System.out.println("str.toUpperCase() : " + str.toUpperCase()); // 대문자 변경
		System.out.println("str.toLowerCase() : " + str.toLowerCase()); // 소문자 변경
		System.out.println("------");
		
		
		System.out.println("---- String.ValueOf() : 문자열로 변환 ----"); //전달받은 숫자 데이터를 String 타입으로 변환
		int num = 100;
		str = 100 + ""; // int를 String으로 바꾸는 작업. "" <-문자열 붙이기.
		str = String.valueOf(100); // "100" 문자열로 형변환. 100 대신 num 써도 돼.
		str = String.valueOf(num); //
		// static 안 쓰는 이유 --> 해당 고유의 객체 데이터를 사용해야 하기 때문에 인스턴스 메소드임.
		// static 선언되어 있으면 .valueOf로 쓸 수 있음
		// 형변환 처리를 할 때 valueOf를 쓴다.
		
		System.out.println("---- toCharArray() : 문자열을 char[]로 변환");
		// 전달받은 데이터를 가져다가 가지고 있는 데이터를 char타입의 배열로 바꿔준다.	
		str = "Java World";
		System.out.println("str : " + str);
		char[] charArray = str.toCharArray(); //이 기능 없는데 필요하면 가져다 써도 돼.
		System.out.println(Arrays.toString(charArray));
		System.out.println(charArray[0]); // 첫번째 글자만 보겠다.
		
	
	}

}
