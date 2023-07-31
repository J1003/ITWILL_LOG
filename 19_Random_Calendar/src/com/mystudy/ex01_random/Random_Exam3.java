package com.mystudy.ex01_random;

import java.util.Calendar;
import java.util.Random;

public class Random_Exam3 {

	public static void main(String[] args) {
		// (실습)오늘 당신의 행운지수 알아보기(0~100)
		// Math.random(), Random 사용해서 행운지수 값 만들기
		// 실행결과 출력
		// 예) 2023년 7월 31일 당신의 행운지수(0~100)는 77입니다.
		// --------------------------------------------
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; 
		// 0~11 (0 -> 1월, 11 -> 12월을 의미한다)
		int date = calendar.get(Calendar.DATE);
		System.out.println("year : " + year);
		System.out.println("month : " + month);
		System.out.println("date : " + date);
		System.out.println(year + "년" + month + "월" + date + "일");
		String yyyymmdd = year + "년" + month + "월" + date + "일"; //문자열로 저장
		System.out.println("------");
		
		
		// 방법1 : Random nextInt(숫자)
		Random ran = new Random();
		int result = ran.nextInt(101);
		System.out.println(yyyymmdd + "당신의 행운지수(0~100)는 " + result + "입니다.");
		

		System.out.println("------");
		// 방법2 : Math.random()
		result = (int) (Math.random() * 101);
		System.out.println("당신의 행운지수(0~100) : " + result);
////		System.out.println(luck.nextInt() + " - Random nextInt()");
//		System.out.println(Math.random() + " - Math.random()");
//		
		
	}

}
