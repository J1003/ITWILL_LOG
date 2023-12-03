package com.mystudy.scanner1;

import java.util.Scanner;

public class Scanner_Exam1 {

	public static void main(String[] args) {
		// Scanner 클래스 : 콘솔(화면)에서 데이터 읽어오기
		Scanner scan = new Scanner(System.in);
		
		//줄단위 데이터를 입력할 때 nextLine을 사용하면 된다.
		System.out.print("문자열 입력1 : ");
		String str1 = scan.nextLine();
		//읽어들인 문자열을 string 타입으로 변환해서 출력한다.
		System.out.println(">>> " + str1);
		System.out.println("-----");
		
		System.out.print("문자열 입력2 : ");
		String str2 = scan.nextLine();
		System.out.println(">>> " + str2);
		
		System.out.println("====================");
		System.out.println("정수값 2개를 입력하면 둘을 더한 결과를 출력");
		//int num1 = 10;
		//int num2 = 20;
		int sum = 0;
		
		
		// (주의) nextXxx 메소드 사용 후 nextLine() 사용시 문제가 발생
		// 문제원인 : 다음에 오는 nextLine() 메소드가 줄바꿈 문자(엔터)까지 읽어서 처리해서
		System.out.print("숫자입력1 : ");
		int num1 = scan.nextInt();
		scan.nextLine(); // 줄바꿈(엔터)문자까지의 값을 읽어서 버리기
		
		System.out.print("숫자입력2 : ");
//		String strTemp = scan.nextLine();
		int num2 = Integer.parseInt(scan.nextLine());
		
		sum = num1 + num2;
		System.out.println("합계 : " + sum);
		
		System.out.print("문자열(nextLine) : ");
		String temp = scan.nextLine();
		System.out.println("입력문자열 출력 : " + temp);
		
		System.out.println("===========");
		System.out.println("문자열 1개와 정수 숫자3개 연속 입력 : ");
		String strTemp = scan.next(); // next() 문자열 데이터 하나 읽는 거!
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		System.out.println("첫번째문자열 : " + strTemp);
		System.out.println(n1 + ", " + n2 + ", " + n3);
		
		
		
		
		
		
		
	}

}
