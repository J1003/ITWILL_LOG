package com.mystudy.array;

public class Ex04_array_swap {

	public static void main(String[] args) {
		//  변수값 서로 교환하기
		int a = 100;
		int b = 200;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("---------");

		
		System.out.println();
		System.out.println("===== 실습 ======");
		
		// (실습) a와 b의 값을 서로 교환하기
		//////////////
			/*int temp;
			  temp= a; --> 이렇게 해도 돼.
			 */
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println();
		

		
		System.out.println("=========실습2========");
		////////////////// (실습2) /////////////////////
			//				0	1	2	3	4	5
			int[] nums = {100, 200, 300, 400, 500};
			System.out.println("배열의 크기 : " + nums.length);
			System.out.println("------");
		
		// 배열 전체 데이터 화면출력
		//int[] nums = {100, 200, 300, 400, 500};
			for (int i = 0; i < nums.length; i++ ) {
				System.out.print(nums[i] + " ");
			}
			System.out.println();
			System.out.println("------");
			
		// 배열 데이터를 맞교환 해서 순서 바꾸기
		// nums : {500, 400, 300, 200, 100};	
		
		
			for (int i = 0; i < 1; i++) {
				System.out.print(nums[0]);
			}
			System.out.println();
			
			for (int i = 4; i < 5; i++) {
				System.out.print(nums[4]);
			}
			System.out.println();
			System.out.println("===============");
			
			///////////////////////////////////////////
			// 위치가 변경된 배열 전체 데이터 화면출력 
			int temp1 = nums[0];
			nums[0] = nums[4];
			nums[4] = temp1;
			
			temp1 = nums[1];
			nums[1] = nums[3];
			nums[3] = temp1;
			
			
			for (int i = 0; i < 5; i++ ) {
				System.out.print(nums[i] + " ");
			}
			
			System.out.println();
			System.out.println("===============");
			
			///////////////////////////////////////////
			
			System.out.println("====선생님 풀이====");
			///배열 전체 데이터 화면출력
			// 참조형데이터는 주소값이 전달이 된다. 전달 받기 위한 변수명은 변경 가능 But 헷갈리니까 걍 통일해라.
			/*
		  
		  	printArray(nums);
			}
		
			static void printArray(int[] nums) {
				for (int i = 0; i < nums.length; i++) {
					System.out.print(nums[i] + " ");
				}
				System.out.println();
				
				
					
			int back = nums.length; //원래 nums.length-1= 5
				for (int i = 0; i < 2; i++) {
					int temp1 = nums[i]; // 원래 i는 front인데 i랑 똑같이 증가하니까
					ums[i] = nums[nums.length - (i + 1)];
					nums[nums.length - (i + 1)] = temp1;
			
				/// or ///
			
			int lastIdx = nums.length - 1; //
				for (int i = 0; i < 2; i++) {
					int temp1 = nums[i]; // 원래 i는 front인데 i랑 똑같이 증가하니까
					ums[i] = nums[lastIdx];
					nums[lastIdx] = temp1;
			
					lastIdx--;
					
					
					//// reverse(nums); 하면 뒤집어짐.
			
			*/
			
			
			////////////////////////////////////////
			int [] j = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
			
	}

}
