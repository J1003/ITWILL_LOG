package com.mystudy.array;

public class Ex03_array_star {

	public static void main(String[] args) {
		/*--- 별찍기 (반복문을 사용해서!!)
		 * 
		 ** 
		 *** 
		 ****
		 *****
		 ----------------*/
		//  char 타입의 데이터를 5개 저장할 수 있는 배열을 만들고 별(*) 입력
		// char[] ch = new char[5];
		char[] ch = {'*', '*', '*', '*', '*'};
		// char[] ch = {'!', '@', '#', '$', '%'};
		
		////////////////// 선생님 풀이 ////////////////////
		//char[] ch = {'0','1','2','3','4'}
		
		System.out.println("/// 선생님 풀이 ///");
		
		
		int starCnt  = 1;
		for (int line1 = 1; line1 <= 5; line1++) {
			for(int star = 0; star < starCnt; star++) {
				System.out.print(ch[star]);
			}
			System.out.println();
			starCnt++;
		}
		////////////////////////////////////////////
		System.out.println("=============");
		//{'0','1','2','3','4'}
		
		System.out.println(ch[0]);
		System.out.println();
		
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println();

		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println();
		
		System.out.println("=============");
		//////////////////////////////////////////////
		for (int i = 0; i <= 1; i++) {
			System.out.print(ch[i]);
		}
		for (int i = 0; i <= 2; i++) {
			System.out.print(ch[i]);
		}
		for (int i = 0; i <= 3; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		////////////////////////////////
		System.out.println();
		System.out.println("=======이중(중첩) 반복처리=======");
		
		for (int m = 0; m <= 5; m++) {
			for(int i = 0; i < m; i++) {
				System.out.print(ch[i]);
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println("=============");
		
		
		
		////////////////// 나의 풀이 //////////////////////
		
		
		int[] arr = new int[5];
		System.out.println("arr : " + arr);
		System.out.println(arr[0]);
		
		for (int i = 0; i < 4; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("---------");
		
		int cnt = 1;
		int[] nums = new int[4];
		for (int line = 0; line < 4; line++) {	
			for (int i = 0; i < cnt; i++) {
				System.out.print("*");
			}
			cnt++;
		
		System.out.println();
	
		}
		System.out.println();
		System.out.println("=======");
		
		//////////////하다 만 것//////////////////////
		char[] ch1 = new char[5];
		
//		ch1[0] = 'A' + 0; //A
//		ch1[1] = 'A' + 1; //B
//		ch1[2] = 'A' + 2; //C
//		ch1[3] = 'A' + 3;
		
		
		
		
		
		
	//		for (int i = 0; i < ch.length; i++) {
	//			ch[i] = char("*" + [])
	//			System.out.print(ch[i]);
	
			
	//	}
	}
}
