package com.mystudy.arry.arry3_copy;

public class ArrayCopy2_exam {

	public static void main(String[] args) {
		/* 문제1 : int 타입의 데이터 4개를 저장할 수 있는 배열(num1)에
		1. 10, 20, 30, 40 숫자를 입력하고 화면 출력 (반복문 필요)
		2. 세번째 데이터를 100으로 바꾸고 화면 출력
		3. 숫자 20을 찾아서 99로 변경
		--------------------------------*/
		/*
		int[] num1 = new int[4];
		
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		num1[3] = 40;
		*/
		//int[] num1 = new int[] {10, 20, 30, 40};
		int[] num1 = {10, 20, 30, 40};
		ArrayCopy.printData(num1);
		
		//2. 세번쨰 데이터를~~~~
		num1[2] = 100;
		ArrayCopy.printData(num1);
		
		//3. 20을 찾아서 99로 변경
		for (int i = 0; i < num1.length; i++) {
			if (num1[i] == 20) {
				num1[i] = 99;
			}
		}
		ArrayCopy.printData(num1);
		
		System.out.println("=== 문제2 ====");
		/* 문제2 : num1과 크기가 같은 배열 num1Copy를 만들고
		num1Copy에 num1 데이터를 복사하고 화면 출력.
		주소값 복사인지 깊은 복사(물리적 복사) 여부 확인. (주소값 복사 여부)
		*/
		int[] num1Copy = new int[num1.length];
//		ArrayCopy.printData(num1Copy);
		for (int i = 0; i < num1Copy.length; i++) {
			num1Copy[i] = num1[i];
		}
		ArrayCopy.printData(num1Copy);
		
		// 주소값이 동일하냐? 동일객차냐?라는 의미.
		if (num1 == num1Copy) {
			System.out.println(":: num1, num1Copy : 동일주소, 동일객체");
		} 
		if (num1 != num1Copy) {
			System.out.println(":: num1, num1Copy : 서로 다른주소, 별개의 다른객체");
		} 
		
		System.out.println("== 1차원배열 clone() 처리 ==");
		num1Copy = num1.clone();
		ArrayCopy.printData(num1Copy);
		System.out.println("num1 == num1copy : " + (num1 == num1Copy));
		
		
//		System.out.println("== 1차원배열 Arrays.copyof() 처리 ==");
//		num1Copy = Arrays.copyof(num1, num1.length);
//		printData(num1Copy);
//		System.out.println();
//		

		
	
//	static void printData(int[] num1) { 		
//			for (int i = 0; i < num1.length; i++) {
//				System.out.print(num1[i] + " ");
//		}
//		System.out.println();
		
		
	}

}
