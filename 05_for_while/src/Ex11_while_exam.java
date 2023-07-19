
public class Ex11_while_exam {

	public static void main(String[] args) {
		// while 문 사용해서 처리
		// (실습) 문제1 : 1~10 까지의 합을 구하고 화면에 출력
		System.out.println("//////선생님 답변/////");
		/////////////선생님 답변//////////////////////
		
		int sum = 0;
		for ( int i = 1; i <= 10; i++) {
			 sum += i; //sum = sum + i;
		}
		System.out.println("1~10 합계 : " + sum);
		System.out.println("----------");
		 
		//while문으로
		sum = 0;
		int i = 1;
		while (i <= 10) {
			sum = sum + i;
			i++;
			//System.out.println("i: " + i + ", sum: " + sum);
		}
		System.out.println("1~10 합계 : " + sum);
		
		
		System.out.println();
		System.out.println("----------");
		/////////////////////////////////////
		int i1 = 1;
		int sum1 = 0;
		while (i1 <= 10) {
			sum1 = i1 + sum1;
			i1++;
		}
		System.out.println(sum1);
		System.out.println("------------");
		
		/* (실습) 문제2
		 *****   
		 *****   
		 *****   
		 ------------- */
		System.out.println("//////선생님 답변/////");
		/////////////선생님 답변//////////////////////
		int line = 1;
		while (line <= 3) {
			i = 1;
			while (i <= 5) {
				System.out.print("*");
				i++;
			}
			System.out.println();
			line++;
		}
		System.out.println();
		System.out.println("----------");
		/////////////2차시도///////////////
		//int b1 = 1;
		int line3 = 1;
		while (line3 <=3) {
			int b1 = 1;
			while (b1 <= 5) {
				System.out.print("*");
				b1++;
			}
			System.out.println();
			line3++;
		}
		
		
		
		System.out.println("----------");
		////////////1차시도////////////////
		int b = 1;
		while (b <= 5) {
			System.out.print("*");
			b++;
		}
		System.out.println();
		b = 1;
		while (b <= 5) {
			System.out.print("*");
			b++;
		}
		System.out.println();
		b = 1;
		while (b <= 5) {
			System.out.print("*");
			b++;
		}
		
		System.out.println();
		System.out.println("------------");
		
		/* (실습) 문제3
		 * 
		 **
		 ***
		 **** 
		 ------------- */
		
		////////////////////////////////////////////
		int line6 = 1;
		while (line6 <= 4) {
			int d = 1;
			while (d <= line6) {
				System.out.print("*");
				d++;
			}
			System.out.println();
			line6++;
		}
		
		System.out.println("------------");
		/////////////////////////////////////
		int c = 1;
		while (c <= 1) {
			System.out.print("*");
			c++;
		}
		System.out.println();
		c = 1;
		while (c <= 2) {
			System.out.print("*");
			c++;
		}
		System.out.println();
		c = 1;
		while (c <= 3) {
			System.out.print("*");
			c++;
		}
		System.out.println();
		c = 1;
		while (c <= 4) {
			System.out.print("*");
			c++;
		}
	}

}
