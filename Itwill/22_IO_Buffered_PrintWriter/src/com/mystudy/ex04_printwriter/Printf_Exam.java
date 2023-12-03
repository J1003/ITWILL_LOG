package com.mystudy.ex04_printwriter;

import java.util.Calendar;

public class Printf_Exam {

	public static void main(String[] args) {
		// printf() 메소드 사용시 형식문자 사용
		int a = 20;
		long b = 300_000_000_000L; //천단위로 끊어서 ,콤마 대신에 _언더바 사용!
		float c = 34.95f;
		double d = 234.234;
		char e = 'A';
		String f = "Hello~~~~";
		boolean g = false;
		
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.printf("%tF", today);
		System.out.println();
		
		System.out.println(">>" + a + " " + b + " " + c + " " + 
				d + " " + e + " " + f + " " + g);
		System.out.println();
		
		/* [ ] : 생략가능!!
		 %[인덱스$][-][크기]형식문자 : % 와 형식문자 필수!!!
		 기본은 우측정렬!
		 - 마이너스 부호는 좌측정렬 
		   ex. %-10d (d = decimal, s = string...etc)
		 ------------------------ */
		
		System.out.printf("%d %d %c %s%n", 100, 12345, 'A', "Hello~");
					  // 순서대로 1:1 매칭, %d:100, %d:12345, %c:'A' ...)
		System.out.println("---- 인덱스(파라미터위치값) 사용 ----");
		// [인덱스%] 파라미터 위치값 $ 부호와 함께 사용
		// [주의] 인덱스 사용하면 데이터 매칭에서 제외됨
		System.out.printf("%1$d %1$d %c %s%n", 67, "Hello!"); // 67 67 C Hello 출력
				// %1$d %1$d 자체가 없는 거나 마찬가지임.
		
		System.out.println("---- 실수형 데이터 표시 ----");
		System.out.printf("%f %1$a %1$e %1$g %n", 65.812345678);
		System.out.printf("%10.3f %n", 65.567890); 
		// %10.3f = 전체자리수 10, 소수점이하 3자리, %n = 줄바꿈
		System.out.printf("%10.3f %n", 12345.567890); //전체자리수 10, 소수점이하 3
		System.out.printf("%-10.3f %n", 65.567890); //좌측정렬 전체자리수 10, 소수점이하 3
		System.out.printf("%30.10f %n", 65.12345678901234); 
		
		System.out.println("----- 날짜관련 ----");
		System.out.printf("%tF %n", today); //2023-08-02
		System.out.printf("%tT %n", today); // 16:00:35
		System.out.printf("%ta %n", today); // 수
		System.out.printf("%1$tY/%1$tm/%1$td %n", today); //2023-08-02
		System.out.printf("%1$tY/%1$tm/%1$td(%1$ta) %n", today); //2023/08/02
		System.out.printf("%1$tH:%1$tM:%1$tS %n", today); //2023-08-02
		System.out.println("==================");
		
		String name = "홍길동";
		// 변수 선언하는 거 라인 하나당 하나를 권장!
		int kor = 100, eng = 90, math = 81;
		System.out.printf("%s은 국어 %d, 영어 %d, 수학 %d 입니다.",
					name, kor, eng, math); // 첫번째값 string, 두번째 decimal ....
		System.out.println(name + "은 국어 " + kor + ", 영어 " + eng
					+ ", 수학 " + math + " 입니다.");
		
		
		
		
		
	}

}
