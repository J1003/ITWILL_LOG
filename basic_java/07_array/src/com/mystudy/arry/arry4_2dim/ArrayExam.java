package com.mystudy.arry.arry4_2dim;

import com.mystudy.arry.arry3_copy.ArrayCopy;

public class ArrayExam {

	public static void main(String[] args) {
		/* 문제 : 2차원 배열을 사용하여
		int[][] num2dim = {{10,20}, {30,40}, {50,60}}; 
		1. 2차원 배열 num2dim 값을 화면 출력해라! = (10 20 30 ... 옆으로 나열)
		2. num2dim 의 세번째 값인 30이 있는 곳의 위치를 다이렉트로 접근해서 100으로 바꿔라!
		   (30을 100으로 변경하고 화면 출력.)
		3. num2dim의 크기만큼 새로운 배열 num2Copy를 선언하고, 
		   num2dim -----> num2Copy에 데이터 복사 후
		   num2Copy 데이터 화면 출력!
		*** 데이터 복사 형태 확인해라! <얕은 복사(주소값 복사) or 깊은 복사(물리적 복사)>
		----------------------------- */
		
		// <선생님 답변>
	 	/////이중 for문 사용 데이터 출력
//	  	for (int d2 = 0; d2 < num2dim.length; d2++){
//	  		//System.out.println(num2dim[d2]);
//	  		// 2차원 배열의 요소(1차원 배열 데이터)
//		  	for (int i = 0; i < num2dim[d2].length; i++) {
//		  		System.out.print(num2dim[d2][i] + " ");
//		  	}
		
		
		// <선생님 3번 답변>
//		int[][] num2Copy = new int[num2dim.length];
//		//num2Copy[0] = new int[num2dim[0].length];
//		//num2Copy[1] = new int[num2dim[1].length]; -->  반복문 처리 가능
//		//num2Copy[2] = new int[num2dim[2].length];
//		
//		for (int i = 0; i <num2dim.length; i++) {
//			num2Copy[i] = new int[num2dim[i].length];
//		}
//		System.out.println(num2Copy);
//		
//		printData(num2Copy);
//		
//		System.out.println("--- 데이터 직접 복사 ---");
//		for (int d2 = 0; d2 < num2Copy.length; d2++) { //num2dim 써도 돼
//			for (int i= 0; i < num2dim[d2].length; i++) {
//				num2Copy[d2][i] = num2dim[d2][i]; // (!주의!)앞에도 [][] 안 해주면 int값이다! 
//			}
//		}
		
//		num2Copy = num2dim; // !!!주소값 복사!!! 위에 데이터 직접 복사 무시하고~
//		printData("num2dim", num2dim);
//		printData("num2Copy", num2Copy);
//		num2Copy[0][0] = 999;
//		System.out.println(" num2Copy[0][0] = 999 변경 후");
//		
//		printData("num2dim", num2dim);
//		printData("num2Copy", num2Copy);
//		
//		System.out.println("---확인 작업---");
//		System.out.println("num2dim == num2Copy : " + (num2dim == num2Copy));
//		System.out.println("num2dim[0] == num2Copy[0] : " + (num2dim[0] == num2Copy[0]));
//		System.out.println("num2dim[1] == num2Copy[1] : " + (num2dim[1] == num2Copy[1]));
//		
		
		// clone(), copyOf() 등 복사기능 사용은 개인별로 해봐라.
		
		
		// 기본데이터와 참조형데이터는 다르다!!
		
		
		System.out.println("==== 문제1 ===");
		
		//////////////// 내 답 /////////////////////////
		
		int[][] num2dim = {{10,20}, {30,40}, {50,60}}; 
		for (int i = 0; i < num2dim.length; i++) {
			for (int j = 0; j < num2dim[i].length; j++) {
				System.out.print(num2dim[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println("==== 문제2 ===");
		
		System.out.println(num2dim[1][0]);
		num2dim[1][0] = 100;
		
		System.out.println(">>> num2dim[1][0] = 100 실행 후");
		printData(num2dim); //확인용
		
		
		System.out.println();
		System.out.println("=== 문제3 ====");
		
		
		////// 데이터 복사 /////
		int[][] num2Copy = new int[num2dim.length][];
		for (int i = 0; i < num2dim.length; i++) {
			num2Copy[i] = new int[num2dim[i].length];
			for (int j = 0; j < num2dim[i].length; j++) {
			num2Copy[i][j] = num2dim[i][j];
		}
		}
		printData(num2Copy);
		
		//clone 처리/////
//		int[][] num2Copy = num2dim.clone();
//		printData(num2Copy);
	
		}
		
		static void printData(int[][] num2dim) {
			for (int i = 0; i < num2dim.length; i++) {
				for (int j = 0; j < num2dim[i].length; j++) {
					System.out.print(num2dim[i][j] + " ");
				}
			}System.out.println();
		}
}