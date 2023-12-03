
public class Ex04_break_continue {

	public static void main(String[] args) {
		// 반복 제어문 : break, continue (빈번하게 사용되지는 않지만 이따금씩 쓰임)
		// break : 중단(반복을 중단하고 현재 실행중인 반복문 빠져나감)
		// continue : 이어서 다음 반복을 진행 처리한다.
		//------------------------------------
		
		// 1부터 10까지 출력하되 8은 출력하지 말고 다음 반복 처리.
		
		for(int i = 1; i <= 10; i++) {
			if(i != 8) { //조건문은 '긍정문'으로 작성하는 게 좋다! But 이런 경우 부득이하게 부정문으로 출력!
				System.out.print(i + " "); // System.out.print <- ln 빼면 옆으로 출력!!
			}
		}
		System.out.println(); //<--줄바꿈 처리(println의 동작방식)
		System.out.println("-------- continue 사용 ---------");
		// 1부터 10까지 출력하되 8은 출력하지 말고 다음 반복 처리.
		for(int i = 1; i <= 10; i++) {
			if (i == 8) continue;
			System.out.print(i + " ");
		}
		// \n : 새로운 줄바꿈의 의미. (New Line)
		System.out.println(); // 줄바꿈
		System.out.println("\n===== break문 ======"); 
		// 1~10 출력 중 8을 만나면 처리를 중단해라.
		for (int i = 1; i <= 10; i++) {
			if (i == 8) break;
			System.out.print(i + " ");
		}
		System.out.println(); 
		System.out.println(">> 반복문 종료 후 ~~"); 
		
	}
}
