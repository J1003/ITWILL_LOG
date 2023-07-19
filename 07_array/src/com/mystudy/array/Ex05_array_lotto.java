package com.mystudy.array;

import java.util.Arrays;

public class Ex05_array_lotto {

	public static void main(String[] args) {
		// 로또 번호 생성기
		// 1. int 타입의 숫자 45개를 저장할 수 있는 배열을 선언하자.(변수명 balls로)
		// 2. 초기화 : 1 ~ 45까지의 숫자(번호)를 입력하는 작업을 하자.
		// 3. 충분히 많이 섞고 
		// 3-1. 0~44 랜덤한 숫자를 만든다(Math.random() 사용)
		// 3-2. 첫번째 데이터와 랜덤숫자 인덱스 번호와 교환
		// 3-3. 위의 3-1, 3-2 작업을 계속 반복(충분히 많이)
		// 4. 6개 번호를 추출(앞에서부터 6개 사용)
		// 5. 6개 번호 별도 저장
		// --------------------------------------------------
		////////////////////////////
		// 난수 = 랜덤한 숫자
		//  랜덤한 값(숫자) 만들기 - Math.random() : 0 <= double < 1
		// (int)(Math.random() * 45) : 0~44 까지의 랜덤한 값 생성
		//----------------------------------
		/*for (int i = 0; i < 100; i++) {
		System.out.print((int)(Math.random() * 45));	 
		}
		System.out.println();
		System.out.println("==== 1~2 =====");
		*/
		///////////////[1~2]///////////////////////////////
		
		int[] balls = new int[45];

//		balls[0] = 1;
//		balls[1] = 2;
//		balls[2] = 3;
//		balls[3] = 4;
		
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
			System.out.print(balls[i] + " ");
		}
		System.out.println();
		System.out.println("=====설정된 초기값 확인====");
		
		for (int i = 0; i < balls.length; i++) {
			System.out.print(balls[i] + " ");
		}
		System.out.println();
		System.out.println("=====3 ~ 3-1====");
		///////////////[3~3-1]////////////////////
		int random = (int)(Math.random() * 45);
		random = 5;
		System.out.println( "랜덤값(0~44) : " + random);
		System.out.println();
		
		
		for (int i = 0; i < 44; i++) {
			System.out.print((int)(Math.random() * 45) + " ");
		}
		System.out.println();
		System.out.println("=====3-2====");
		///////////////[3-2]////////////////////////
		
		/*
		int jj2 = (int)(Math.random() * 45);
		
		/// balls[0] <--> balls[random]
		
		
		//첫번째 교환
		int temp;
		
		temp = balls[0];
		balls[0] = balls[random];
		balls[random] = temp;

		/// 두번째 교환
		int random = (int)(Math.random() * 45);
		System.out.println( "랜덤값(0~44) : " + random);
		temp = balls[0];
		balls[0] = balls[random];
		balls[random] = temp;
		
		
		//변경 후
		for (int i = 0; i < balls.length; i++) {
			System.out.print(balls[i] + " ");
		
		System.out.println();
		
		//  반복문으로 교환 처리
		for (i = 0; i < 1_000_000; i++) {
			int random = (int)(Math.random() * 45);// 난수(랜덤값 생성)
			temp = balls[0];
			balls[0] = balls[random];
			balls[random] = temp;
		}
		
		// 6개 번호 추출
		for (int i = 0; i < 6; i++){
		System.out.print(balls[i] + " ");
		}
		
		// =======당첨번호 별도 저장하기==========
		int[] lottoNums = new int[6];
		for (int i = 0; i < 6; i++){
			System.out.print(balls[i] + " ");
		}
		
		
		
		*/
		// 랜덤 중복을 막기 위해 랜덤값을 배열에 적용해라.
		
		
	
		// 랜덤한 숫자 만드는 건 반복문 안에 들어가 있어야 해
		for (int i = 0; i < 100; i++) {
			int jj = (int)(Math.random() * 45);
			int temp = balls[0];
			balls[0] = balls[jj];
			balls[jj] = temp;
			//System.out.print((int)(Math.random() * 45) + " ");
		}
		for (int i = 0; i < 6; i++){
			System.out.print(balls[i] + " ");
		}
//		System.out.println(Arrays.toString(balls)); // 확인하는 용도
		System.out.println();
		
		
		
		System.out.println("==== 당첨번호 별도 저장 ====");
		int[] lottoNums = new int[6];
		for (int i = 0; i < 6; i++){
			lottoNums[i] = balls[i];
		}
		System.out.println("balls : " + Arrays.toString(balls));
		System.out.println("lottoNums : " + Arrays.toString(lottoNums));
		
		
		System.out.println("===Arrays.sort() 정렬처리===");
		//로또번호 오름차순 정렬
		Arrays.sort(lottoNums); 
		System.out.println("lottoNums : " + Arrays.toString(lottoNums));
	}
}
