package com.mystudy.scanner2_sungjuk;

import java.util.Scanner;

/* (실습) Scanner 사용 성적처리
입력 : 성명, 국어, 영어, 수학 점수를 입력받아
처리 : 총점, 평균 계산한다
출력 : 결과를 화면 출력
===(처리결과 출력예시)===
성명 : 홍길동
국어 : 100
영어 : 90
수학 : 81
------------
총점 : 271
평균 : 90.33
================= */

public class Scanner_Exam2 {

	public static void main(String[] args) {
		
		while (true) {
		// 입력 -------------------
		// 입력 : 성명, 국어, 영어, 수학 점수를 입력받아
		Scanner scan = new Scanner(System.in);	
		System.out.print("이름 : ");
		String name = scan.nextLine();	 // 문자열(String) 값 읽기.	
		
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		scan.nextLine();
		System.out.print("영어 : ");
		int eng = Integer.parseInt(scan.nextLine());
		System.out.print("수학 : ");
		int math = Integer.parseInt(scan.nextLine());
		
		
		// 총점, 평균 계산
		System.out.println("---총점 및 평균 계산---");
		int tot = kor + eng + math;
		double avg = 0;
		avg = Math.round(tot * 100 / 3) / 100.0;
		// Math.round = 결과를 long 타입으로 반환하기 때문에 반올림된 값을 정수로 받을 때 유용.
		
		
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		
		
		System.out.println("\n=== 성적처리 결과 ===");
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("------");
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		
		System.out.print(">> 계속할거냐(중단시 : n 입력)? ");
		String answer = scan.nextLine();
		if (answer.equalsIgnoreCase("n")) {
			System.out.println(":: 작업을 중단 !!");
		}
		}
	}
}
