
public class Ex05_max_number {

	public static void main(String[] args) {
		/* [실습] 숫자 3개 중 가장 큰 수를 구하시오
		a: 30, b: 60, c: 20
		<결과>
		가장큰수 : 60
		-----------------------*/
		int a = 30;
		int b = 60;
		int c = 20;
		
		String result = "";
		
		if(a>b && a>c) {
			result = "a";
		} else if(b>a && b>c) {
			result = "b";
		} else if (c>a && c>b) {
			result = "c";
		}
		System.out.println("가장큰수 : " + result);


		/*
		int a = 30;
		int b = 60;
		int c = 20;
		
		if(a > b) { //a가 큰 경우
			if(a > c) {
				System.out.println("가장큰수 : " + a);
			} else {
				System.out.println("가장큰수 : " + c);
			}
		} else { //b가 큰 경우
			if(b > c) {
				System.out.println("가장큰수 : " + b);
			}else {
				System.out.println("가장큰수 : " + c);
			 */



		/*if(a>b && a>c) {
			System.out.println("a");
		} else if(b>a && b>c) {
			System.out.println("b");
		} else if(c>a && c>b)
			System.out.println("c");
		*/

// ========================================================================

		/* [실습] 숫자 5개 중 가장 큰 수를 구하시오
		a: 30, b: 60, c: 20, d: 15, e: 70
		<결과>
		가장큰수 : 60
		-----------------------*/
		 //int max = 0; //가장 큰 값(데이터, 숫자)
		 int max = Integer.MIN_VALUE;
		 
		 if (a > max) {
		 	max = a;
		 } 
		 if(b > max){
		 max = b;
		 }
		 if( c > max) {
		 	max = c;
		 }
		 System.out.println("가장큰수(max) : " + max);
	}
}


		/*
		int a1 = 30;
		int b1 = 60;
		int c1 = 20;
		int d = 15;
		int e = 70;

		String result1 = "";

		if(a1>b1 && a1>c1 && a1>d && a1>e) {
				result1 = "a1";
		} else if(b1>a1 && b1>c1 && b1>d && b1>e) {
				result1 = "b1";
		} else if(c1>a1 && b1>c1 && b1>d && b1>e) {
				result1 = "c1";
		} else if(d>a1 && d>b1 && d>c1 && b>e) {
				result1 = "d";
		} else if(e>a1 && e>b1 && e>c1 && e>d) {
				result1 = "e";
		}
		System.out.println("가장큰수 : " + result1);

		 */
		
		
		
		

