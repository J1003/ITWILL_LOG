
public class Ex10_while {

	public static void main(String[] args) {
		// 반복문 : while, do ~ while
		/* while 반복문 사용 형태
		반복인자의 선언 및 초기값 설정;
		while (실행조건식) {
			반복인자값 증감설정(선택적);
			실행문(들);
			반복인자값 증감설정(선택적);
			프린트값이 먼저 실행
		}
		 ---------------------- */
		//  1~10까지 화면출력 
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "");
		}
		System.out.println();
		System.out.println("------------");
		
		
		// 1~10까지 화면출력 while문으로 작성
		// while문은 무한루프에 걸릴 확률이 for문 보다 높음!
		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		System.out.println("------------");
		// 실행 상태에 따라서 증감식은 앞쪽에 올 수도 있고 실행문 뒷쪽에 올 수도 있다.
		// BUT 변수를 변경해줘야 함!
		i = 0;
		while (i < 10) {
			i++;
			System.out.print(i + " ");
			
		}
		System.out.println();
		System.out.println("------------");
		
		
		System.out.println("======= break, continue ======");
		//// while문에서 break, continue를 사용할 경우, 무한루프에 빠질 경우가 높다.
		//// for문에서는 해당 사항 없음.
		// break : 현재 실행중인 반복문을 종료하고 빠져나감
		// while 무한반복
		int num = 1; 
		while (true) {
			System.out.println(num);
			if (num >= 10) break; //반복중단
			num++;
		}
		
		System.out.println("---while에서의 continue문 --------");
		// 위치 선정을 잘 하지 않으면 무한루프에 빠질 수 있다.
		num = 0;
		while (num < 10) {
			num++;
			if (num == 5) continue; // while문에서는 증감식이 continue문 앞에 위치해야 함!
			System.out.println(num); //     안 그러면 무한루프에 빠짐!!
		}
		System.out.println("---for에서의 continue문 --------");
		for (int m = 1; m <= 10; m++) {
			if (m == 5) continue;
			System.out.println(m); // 1~10까지 '5'를 빼고 출력!
		}
		
		System.out.println("---------");
		for (int m = 1; m <= 10; m++) {
			if (m % 2 == 0) continue;
			System.out.println(m); // 짝수 빼고 홀수만 출력
		}
		
		System.out.println("==== do ~ while ====");
		/* do ~ while 반복문 사용 형태
		반복인자의 선언 및 초기값 설정;
		 do	{
			반복인자값 증감설정(선택적);
			실행문(들);			
			반복인자값 증감설정(선택적);
			프린트값이 먼저 실행
		} while (실행조건식);
		 ---------------------- */
		//1~10까지 출력
		num = 1;
		do {
			System.out.println("do~while : " + num);
			num++;
		} while (num <= 10); // 어떤 경우던 상관 없이 무조건 한번은 실행된다.
		
		System.out.println("===========");
		
		System.out.println("--- 내부 반복문에서 break 처리시 ---");
		for (int out = 1; out <= 3; out++) {
			System.out.println(":: out : " + out);
			
			for (int in = 1; in <= 5; in++) { //(안에서 5번 반복. 1~5까지
				System.out.println("out: " + out + ", in: " + in);
				// 외부 반복문이 3번 실행될 때 얘는 5번 실행된다. 왜냐하면 for문 안에 있으니까!
				if (out == 2) break; // 내부 반복문만 종료 처리됨. 외부 반복이 2번이면 끝내라. 
									 // 근데 for문 안에서 out값이 3이 아니라 2니까 현재 실행 중인 반복문을 중단하고 빠져나간다.
									// 완전히 빠져나가는 게 아니라 현재 실행 중인 내부 반복문만 빠져나간다.
			}
			
			System.out.println("-------------");
		}
		System.out.println("=================="); // 반복문에서 빠져나가면 줄이 그어지는 시점.
		/////////////////////////////////////////////////////
		
		
		System.out.println("=== 중첩 반복문 한번에 모두 중단하기 ====");
		// 중첩 반복문을 모두 종료해야 하는 경우(위치지정 break문을 사용)
		// 라벨지정
		
		outFor : for (int out = 1; out <= 3; out++) {
			System.out.println(":: out : " + out);
			
			for (int in = 1; in <= 5; in++) { //(안에서 5번 반복. 1~5까지
				System.out.println("out: " + out + ", in: " + in);
				if (out == 2) break outFor; //외부반복문 중단처리.
			}
		
			System.out.println("-------------");
		}
		System.out.println(">>> 프로그램 끝");
		
		
		
		
	}
}
