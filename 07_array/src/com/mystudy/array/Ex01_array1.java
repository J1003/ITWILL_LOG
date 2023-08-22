package com.mystudy.array;

import java.util.Arrays;

public class Ex01_array1 {

	public static void main(String[] args) {
		// 배열(array) : 동일한 데이터 타입들의 연속된 저장 공간.
		// 배열의 선언 : 자료형(데이터타입)[] 변수명
		// 변수에 값을 저장 : 배열변수명[인덱스번호] = 값; <- *인덱스번호는 0부터 시작한다!!
		/* 배열 선언 및 생성
		   1. 자료형[] 변수명 = new 자료형[갯수];
		   	  자료형 변수명[] = new 자료형[갯수];
	   	  	  자료형 변수명[] = new 자료형[갯수];
	   	   2. 자료형[] 변수명 = new 자료형[]{값1, 값2, 값3, ..., 값n}
	   	   3. 자료형[] 변수명 = {값1, 값2, 값3, ..., 값n};
		 -------------------- */
		int[] arr = new int[5];
		System.out.println("arr : " + arr);
		System.out.println("arr[0] : " + arr[0]);
		
		//int index = 0;
		for (int i = 1; i < 5; i++) { // i <= 5 or i <= 4 말고! i < 5 이렇게 쓰자!
										// 위에 < 하는 이유는 데이터 개수를 확인하기 위함임!
		     //System.out.println(arr[index++]); <--이렇게 써도 되지만 더 간결하게해보자!
		     System.out.println(arr[i]); 
		     //System.out.println(i + ": " + arr[i]); 인덱스 번호랑 같이 알고 싶을 때.
		
		}
		
		arr[0] = 10; //배열의 첫번째 위치(인뎃스번호 0번)에 10 설정(저장)
		System.out.println("arr[0] : " + arr[0]);
		arr[1] = 11;
		System.out.println("arr[1] : " + arr[1]);
		arr[2] = 12;
		arr[3] = 13; //array인덱스는 양수만 쓸 수 있다. 음수는 X.
		arr[4] = 14; // 마지막 데이터(크기 - 1) /크기,길이,개수.. 
		//arr[5] = 15; // ArrayIndexOutOfBoundsException
		System.out.println("------");
		
		for (int i = 1; i < 5; i++) { 
			System.out.println(arr[i]); 
		}
		
		
		System.out.println("--- 배열의 length 속성 ---");
		// length - 배열의 크기를 확인할 수 있는 속성값
				System.out.println("arr.length : " + arr.length);
				
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}
		
		
		System.out.println("====== 배열선언 형태 2번 ========");
		//2. 자료형[] 변수명 = new 자료형[] {값1, 값2, 값3, ..., 값n};
		int[] nums1 = new int[] {100, 101, 102, 103, 104}; //자바에서는 {} 중괄호 이용해서 값을 설정.
		for (int i = 0; i < nums1.length; i++) { //index 번호는 0부터 시작!!
			System.out.println(nums1[i]);
		}
		
		
		System.out.println("====== 배열선언 형태 3번 ========");
		//3. 자료형[] 변수명 = {값1, 값2, 값3, ..., 값n}; 
		int[] arr3 = {10, 11, 12, 13, 14, 15};
		for (int i = 0; i < arr3.length; i++) { //i 대신 inx 이렇게 인데스 써도 되는데 보기 쉬우니까 i로 쓴다.
			System.out.println(arr3[i]);
		}
		
		System.out.println("================================");
		int[] nums = new int[10];
		// 초기값 설정 : 1~10 숫자를 저장. 0개 위치에는 1.
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		//배열값 확인
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + " ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(nums)); // 직접 데이터를 컨트롤 해야 하니까 이걸 사용하면 안 된다고?
		
		System.out.println("================================");
		System.out.println("=== 영어 알파벳 문자 저장/출력(A~Z) ===");
		//기본데이터타입 + 무한데이터타입	
		char[] ch = new char[26];
		System.out.println(Arrays.toString(ch));
		System.out.println("_" + ch[0] + "_");
		System.out.println("_" + '\u0000' + "_"); //\u0000 유니코드값
		ch[0] = 'A'; // A=65 / char 타입의 문자는 문자로 사용되지만 위치값을 가지고 있다. <- 위치값 = 65
		ch[0] = 'B'; // B=66 <---(65(A)+1)
		ch[0] = 'C'; //C=67 <---(65(A)+2)
		//...//
		System.out.println("------------");
		
		ch[0] = 'A' + 0; //A
		ch[1] = 'A' + 1; //B
		ch[2] = 'A' + 2; //C
		ch[3] = 'A' + 3; //D 
		
		System.out.println(Arrays.toString(ch));
		System.out.println("------------");
		
		// (실습) 데이터 A~Z 일괄입력(반복문 사용)
	
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char)('A' + i); //ch[0] = 'A' + 0; 아래로 바꾸기 전 모양.
						//{'A' + 0} <- int타입에서 char로 연산의 데이터값을 통째로 형변환. int+char=int.
			System.out.print(ch[i] + " ");
		}
		
		
		
		System.out.println();
		System.out.println("------------");
		
		
		
		
		// (실습) 배열 데이터 화면 출력(반복문 사용)
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		
	}

}
