
public class Ex07_for_star_exam {

	public static void main(String[] args) {
		/* 문제1 --------------------------
		***** : * 5번 + 줄바꿈
		****  : * 4번
		***   : * 3번
		**    : * 2번
		*     : * 1번
		-----------------------------------*/
		int starCnt = 5; 
		for (int line = 1; line <= 5; line++) {
			for (int star = 1; star <= starCnt; star++) {
				System.out.print("*");
			}
			System.out.println();
			starCnt--;
		}
		
		System.out.println("===== 문제2 ======");
		
		/* 문제2 (별이 없는 공간과 있는 공간 두 개로 구분해서 처리해봐라)
		   * : 빈칸4 + * 1개 + 줄바꿈
		  ** : 빈칸3 + * 2개 + 줄바꿈
		 *** :
		**** :
	   ***** :
		-------------------------------------*/
		int cnt1 = 1; 
		for (int line = 1; line <= 5; line++) {
			for (int space = 1; space <= 5-cnt1; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= cnt1; star++) {
			System.out.print("*");
			}
			System.out.println();
			cnt1++;
		} 
			
		System.out.println("(((((( 선생님 풀이 ))))))");
		
		int spaceCnt = 4; 
		starCnt = 1;
		for (int line1 = 1; line1 <= 5; line1++) {
			for (int space = 1; space <= spaceCnt; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= starCnt; star++) {
				System.out.print("*");
			}
			System.out.println();
			spaceCnt--;
			starCnt++;
			
		}
		
		/* 문제3 (빈칸이 있는 공간과 없는 공간 분리해서 생각해봐)
		***** : 빈칸0, *5개, 줄바꿈
		 **** : 빈칸1, *4개, 줄바꿈
		  *** : 빈칸2, *3개, 줄바꿈
		   ** 
		    *
		------------------------------------*/
		System.out.println("===== 문제3 ======");
		
		int cnt2 = 5; 
		for (int line = 1; line <= 5; line++) {
			for (int space = 1; space <= 5-cnt2; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= cnt2; star++) {
			System.out.print("*");
			}
			System.out.println();
			cnt2--;
		} 
		
		System.out.println("===== 문제4 ======");
		/* 문제4 (스페이스 넣고 하자)
		1			: (1 + 빈칸1)
		1 2
		1 2 3
		1 2 3 4 
		1 2 3 4 5
		--------------------------------- */
		int i = 1;
		for (int line = 1; line <= 5; line++) {
			for (int num = 1 ; num <= i; num++) {
				System.out.print(num);
				System.out.print(" ");
			}
			System.out.println();
			i++;
		}
		
		System.out.println("(((( 선생님 풀이 ))))");
		int cnt = 1;
		for (int line = 1; line <= 4; line++) {
			int num = 1;
			for (int i1 = 1; i1 <= cnt; i1++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
			cnt++;
		}
		
		
		
		
		System.out.println("===== 문제5 ======");
		/* 문제 5
		1
		2 3 
		4 5 6 
		7 8 9 10
		--------------------------------- */
		//int i1 = 1;
		//for (int line = 1; line <= 4; line++) {
		//i1++;
		int i2 = 1;
		int num1 = 1;
		for (int line = 1; line <= 4; line++) {
			for (int d = 1; d <= i2; d++) {
				System.out.print(num1++);
				System.out.print(" ");
			}
			System.out.println();
			i2++;
			}
	
		
		/*for (int num = 1; num <= 1 ; num++) {
			System.out.print(num);
			System.out.print(" ");
			}
			System.out.println();
		
		for (int num = 2; num <= 3 ; num++) {
			System.out.print(num);
			System.out.print(" ");
			}
			System.out.println();
			
		for (int num = 4; num <= 6 ; num++) {
			System.out.print(num);
			System.out.print(" ");
			}
			System.out.println();
		for (int num = 7; num <= 10 ; num++) {
			System.out.print(num);
			System.out.print(" ");
			}
			System.out.println();
			
			*/
		System.out.println("(((( 선생님 풀이 ))))");
		int cnt4 = 1;
		int num4 = 1;
		for (int line = 1; line <= 4; line++) {
			for (int i3 = 1; i3 <= cnt4; i3++) {
				System.out.print(num4++);
				System.out.print(" ");
			}
			System.out.println();
			cnt4++;
		}
	}
}
