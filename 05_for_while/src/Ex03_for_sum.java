
public class Ex03_for_sum {

	public static void main(String[] args) {
		// 문제 : 1~10 까지의 합계를 구하시오.(for를 사용해서 화면출력)
		// 1~10 까지의 합계 :55
		//int sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
		//System.out.println("1~10 까지의 합계 : " + sum);
		
		
		System.out.println("------------------");
		
		int sum = 0; // [sum이라는 위치에 0을 저장하겠다!] 합계 저장할 변수(공간)
		
		/*  sum = sum + 1; 
			sum = sum + 2;
			sum = sum + 3;
			sum = sum + 4;
			sum = sum + 5;
			sum = sum + 6;
			sum = sum + 7;
			sum = sum + 8;
			sum = sum + 9;
			sum = sum + 10;
			System.out.println("sum : " + sum);
			System.out.println("-------------");
		*/
		
		sum = 0;
		for (int i = 1; i <=10; i++) {
			sum = sum + i; // sum += i;
			//System.out.println("i : " + i + ", sum : " + sum); //단계별로 보고 싶으면 이렇게 추가!
		}	
		System.out.println("1~10 까지의 합계 : " + sum);
		System.out.println("----------------");
		
		//(실습) 1~10까지의 숫자 중에 짝수를 찾아서 출력하시오.(2,4,6,8,10)
		/* for (int i = 1; i <= 10; i++){
		   if (i값이 짝수냐?){
		   System.out.println(i);
		  } 
		*/
		
		System.out.println("----------------");
		for (int i = 1; i <= 10; i++) {
			if( i % 2 == 0 ) { // = 짝수냐?의 의미.
				System.out.println(i);
			}
		}
		System.out.println("----------------");
		for (int i = 1; i <= 10; i++) {
			if( i / 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("----------------");
		//(실습) 1~10까지의 숫자 중에 홀수를 찾아서 출력하시오.(1,3,5,7,9)
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) { // 홀수냐? 짝수가 아니냐?
				System.out.println(i);
			
			}
		}
	}
}
		
		
		
