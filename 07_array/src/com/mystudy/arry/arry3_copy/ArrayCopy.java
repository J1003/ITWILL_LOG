package com.mystudy.arry.arry3_copy;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// 배열 복사
		int[] num1 = new int[5];
		int[] num2 = new int[5];
		System.out.println("num1 + " + num1);
		System.out.println("num2 + " + num2);
		printData("num1", num1);
		printData("num2", num2);
		// 참조형 데이터 할 때는 데이터(x) 대신 객체(인스턴스) 표현을 씀.	
		// 참조형데이터 비교 : == (주소값 비교, 동일객체 여부 비교)
		System.out.println("num1 == num2 : " + (num1 == num2)); // 새로운 객체를 만들어서 주소값이 서로 다 다르다.
		
		num1[0] = 10; // 10 0 0 0 0
		num1[1] = 20; 
		num1[2] = 30; 
		num1[3] = 40; 
		num1[4] = 50; 
		
		printData("num1", num1);
		printData("num2", num2);
		
		System.out.println("== 배열 복사(주소값 복사, 얕은 복사) ==");
		num2 = num1; //주소값 복사 //0 0 0 0 0
		
		System.out.print("num1 : " +num1);
		System.out.print("num2 : " +num2);
		System.out.print("num1 == num2 : " + (num1 == num2)); //주소값이 동일 객체냐? 아니냐?
		
		printData("num1", num1);
		printData("num2", num2);
		
		System.out.println("== 배열값 복사 = 물리적 복사, 깊은 복사 (deep copy) ===");
		int[] num3 = new int[num1.length]; //num1 배열과 같은 크기로 만들겠다.
		printData("num3", num3);
		
		//num3 <==== num1 배열 값 복사 (직접 컨트롤 해서 복사)
		for (int i = 0; i < num3.length; i++) {
			num3[i] = num1[i]; 
		}
		printData("num1", num1);
		printData("num3", num3);
		System.out.println("num1 == num3 : " + (num1 == num3)); //num1 & num3가 같은 주소를 사용하냐?
		
		num1[0] = 888;
		System.out.println(">> num1[0] = 888 변경 후");
		printData("num1", num1);
		printData("num3", num3);
		System.out.println("===============");
		
		System.out.println("====System.arraycopy() 복사하기 ====");
		int[] num4 = new int[num1.length];
		printData("num1", num1);
		printData("num4", num4);
		
		//arraycopy(Object src, int srcpos, Object dest, int destPos, int length)
		System.arraycopy(num3, 0, num4, 0, num1.length);
		
		System.out.println(">> System.arraycopy() 복사후");
		printData("num1", num1);
		printData("num4", num4);
		System.out.println("num1 == num4 : " + (num1 == num4));
		
		
		System.out.println("==== 배열객체.clone() 복사(복제) ====");
		int[] num5 = num4.clone();
		printData("num4", num4);
		printData("num5", num5);
		System.out.println("num4 == num5 : " + (num4 == num5));
		
		System.out.println("=== Arrays.copyOf() 사용 복사 ===");
		//Arrays.copyOf(원본데이터, 복사할갯수)
		int[] num6 = Arrays.copyOf(num4,num4.length); //arrays의 copyOf 메소드를 실행할 때 return값을 확인해라
		printData("num4", num4);
		printData("num6", num6);
		System.out.println("num4 == num6 : " + (num4 == num6));
		
		
		System.out.println("=== Arrays.copyOf(원본, from ===");
		//num6 = Arrays.copyOfRange(num4, 0, 3)
		//Arrays.copyOfRange(원본, from, to) : from부터 to 이전까지
		num6 = Arrays.copyOfRange(num4, 0, 3);
		printData("num4", num4);
		printData("num6", num6);
		System.out.println("num4 == num6 : " + (num4 == num6));
		
		
		
		}
	
		static void printData(int[] num) { 		// int배열만 전달받는 것.
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + " ");
		}
		System.out.println();
		}
		
		// 메소드 오버로딩 (method overloading)
		static void printData(String name, int[] num) {
			System.out.print(name + ": ");
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + " ");
		}
		System.out.println();
	}
}
