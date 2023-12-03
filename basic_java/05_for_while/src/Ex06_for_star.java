
public class Ex06_for_star {

	public static void main(String[] args) {
		// ***** 화면출력
		System.out.println("*****");
		System.out.println("-----------");
		
		System.out.print("*****"); // print문은 데이터 출력 필수! (println은 안 해도 가능)
		System.out.println(); // 줄바꿈 역할
		System.out.println("------");
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*"); 
		System.out.print("*");
		System.out.print("*");
		System.out.println(); // *만 찍는 게 아니라 줄바꿈까지!!(항상 생각해라)
		
		// 많은 데이터를 사용할 때 반복문을 사용해라!
		
		System.out.println("----- 반복문 print *(별) 찍기 반복");
		for (int i = 1; i <= 5; i++) { // 뜻 --> i는 1부터 5까지 1씩 증가하면서 
			System.out.print("*");
		}
		System.out.println();
		
		System.out.println("=================");
		/* 문제 : 3개 행 출력처리 (각 행별로 *(별) 5개 출력)
		 *****
		 *****
		 *****
		 *****
		 이렇게 나와야 함. 
		 */
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("*****");
		}
		System.out.println();
		System.out.println("=================");
		
		
		///////////
		for (int i = 1; i <= 3; i++) {
			for (int star = 1; star <= 5; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		
		//1번째 줄
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		//2번째 줄
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		//3번째 줄
		for (int line = 1; line <= 3; line++) {
			for (int i = 1; i <= 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=================");
		
		/* (실습) '반복문'을 사용해서 삼각형 형태의 * 찍기
				 화면(콘솔창)에 삼각형 모양을 출력
		*		//*(별) 하나 찍고 줄바꿈	
		**
		***
		****
		*****
		---------------------------------*/
		//// 가장 기본적인 방법으로 풀어봤을 때
		System.out.print("*");
		System.out.println();
		
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.println("=================");
		
		////////////////////////////////변수를 사용한 방법
		
		//System.out.print("*");
		for (int i = 1; i <= 1; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 1; i <=2; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 1; i <=3; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 1; i <=4; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 1; i <=5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.println("===== ******** ======");
		
		///////////////////////////////////////////////
		//이중 반복문은 안쪽에서부터 바깥쪽으로(아래서 위로) 해석!
		int cnt = 1; //(cnt=count)
		for (int line = 1; line <= 5; line++) {
			for (int star = 1; star <= cnt; star++) {
				System.out.print("*");
			}
			System.out.println();
			cnt++;
		}	
		System.out.println("=====");
		/* (실습) '반복문'을 사용해서 삼각형 형태의 * 찍기
		 	화면(콘솔창)에 삼각형 모양을 출력
				//*(별) 하나 찍고 줄바꿈	
		*		1라인 : * 1개 + 줄바꿈		
		**		2라인 : * 2개 	
		***		3라인 : * 3개 
		****	4라인 : * 4개 	
		*****	5라인 : * 5개 
		---------------------------------*/
		int starCnt  = 1;
		for (int line1 = 1; line1 <= 5; line1++) {
			for(int star = 1; star <= starCnt; star++) {
				System.out.print("*");
			}
			System.out.println();
			starCnt++;
		}
		System.out.println("===== 끝");
		
	}
}








