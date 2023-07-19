package com.mystudy.array;

import java.util.Arrays;

public class Ex02_array_exam {

	public static void main(String[] args) {
		//(실습)문제 : 배열에 저장된 숫자의 합계 구하기(변수명 nums)
		// 저장할 숫자 : 3, 5, 7, 1, 2, 4, 6, 8, 9, 10
		//0. 위의 숫자가 저장된 배열을 만드세요.
		//1. 배열에 저장된 데이터를 화면 출력(반복문사용)
		//2. 배열에 저장된 데이터의 합계 구하기
		//3. 합계결과 출력 
		//-------------------------------
		
		//int a;
		//String str; ---> 3개 다 같은 모양
		//int[] nums;
		
		//(실습) 배열값 중 홀수합, 짝수합 구하기
				//배열에 있는 값 중 짝수는 짝수끼리 합산(evenSum)
				//배열에 있는 값 중 홀수는 홀수끼지 합산(oddSum)
				//짝수합계, 홀수합계 출력
		
		System.out.println("===== 선생님 풀이 =====");
		
		// int[] nums = new int[10];
//		int[] nums1 = new int[] {3, 5, 7, 1, 2, 4, 6, 8, 9, 10}; //--> 중괄호를 쓰는 이유 데이터를 넣기 위해
//		System.out.println(Arrays.toString(nums1));
		
//		int[] nums = {3, 5, 7, 1, 2, 4, 6, 8, 9, 10};
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
		
//	    ---> 반복문 사용
		int[] nums2 = {3, 5, 7, 1, 2, 4, 6, 8, 9, 10};
//		System.out.println("nums2.length : " + nums2.length); //<--데이터 갯수 출력
		
		for (int i = 0; i < nums2.length; i++) { // 인덱스 번호가 9니까 "< 10"이다.	
			System.out.print(nums2[i] + " ");
		}
		
		System.out.println();
		/////////////////////////////////////////////
		int sum1 = 0;
		for (int i = 0; i < nums2.length; i++) {
			sum1 = sum1 + nums2[i];
//			sum1 = sum1 + nums2[idx++];
		}
		System.out.println("배열데이터 합계 : " + sum1);
		
//		sum1 = sum1 + nums2[0];
//		sum1 = sum1 + nums2[1];
//		sum1 = sum1 + nums2[2];
		
		
		// 응용 //
		System.out.println();
		for (int i = 5; i < (5+5); i++)	{	  // (!!응용!!!)5부터 5개만 출력
			System.out.print(nums2[i] + " ");
		}

		System.out.println();
		System.out.println("---------");
		
		/////////// 짝수합 / 홀수합 /////////////////
//		System.out.println(6 % 2 == 0);
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i = 0; i < nums2.length; i++) {
			if (nums2[i] % 2 == 0) { //짝수냐?
				evenSum += nums2[i];
			} 
			else {
				oddSum = oddSum + nums2[i];
			}
		}	
		System.out.println("짝수합 : " + evenSum);
		System.out.println(" 홀수합 : " + oddSum);
		
		
		
		
		
		
		System.out.println();
		System.out.println("======== 나의 풀이 ========");
		
		
		///////////////// 나의 풀이 ////////////////
		int[] arr = new int[10];
		System.out.println("arr : " + arr);
		System.out.println(arr[0]);
		
		for (int b = 0; b < 10; b++) {
			System.out.print(arr[b]);
		}
		System.out.println();
		System.out.println("---------");
		
		int[] nums = new int[] {3, 5, 7, 1, 2, 4, 6, 8, 9, 10};
			for(int b = 0; b < 10; b++) {
				System.out.print(nums[b] + " ");
			}
		System.out.println();
		System.out.println("---------");
		
		int sum = 0;
		for (int b = 0; b < nums.length; b++) {
			sum = sum + nums[b];
		} 
		System.out.println(sum);
	
		System.out.println("---------");
		
		int evenSum1 = 0;
		for (int b = 0; b < nums.length; b++) {
			evenSum = evenSum + nums[b];
			System.out.print(evenSum + " ");
		}
		
		
		System.out.println();
		System.out.println("---------");
		
		int oddSum1 = 0;
		for (int b = 0; b < nums.length; b++) {
			evenSum = evenSum + nums[b];
			System.out.print(evenSum + " ");
		
		}
		
	}

}
