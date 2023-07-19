
public class Ex01_for {

	public static void main(String[] args) {
		// 제어문 - 반복문(for, while, do ~ while)
		// for문은 if문하고 비슷 형태는 달라짐
		// for (초기값설정 ; 실행(종결)조건 ; 증감설정) { }
		// for (;;) {} // 무한반복
		// --------------------------------------
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("------------");
		
		// for (초기값설정 ; 실행(종결)조건; 증감설정)
		for (int i = 1; i <= 3; i++) {
			System.out.println("*"); // 3번 반복
		}
		System.out.println("--------------");
		
		// 별(*) 찍기를 10번 반복해보자!
		// for문 안에서 i값은 반복적으로 사용 가능!
		//  
		for (int i = 1; i <= 10; i++) {
			System.out.println("*");
		}
		System.out.println("--------------");
		
		for (int i = 1; i <= 10; i = i += 2) {
			System.out.println("*");
		}
		//================================
		System.out.println("========= 1부터 5까지 출력 =========");
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println("=============");
		// 1,3,5,2,4 이런 패턴은 아직까지는 배운 게 없어서 못한다. 안 되는 거 억지로 NOPE!
		// 같은 문자만 출력 가능(?) 반복문은 여러번 동작시킨다.
		
		int num = 1;
		for (int i = 1; i <= 5; i++) {
			System.out.println(num);
			num++;
		}
		System.out.println("--------------");
		num = 1;
		for (int i = 1; i <= 5; i++) {
			System.out.println("i : " + i);
			System.out.println(num++);
		}
		// 반복인자 값을 사용해서 출력! 좀 더 단순하게 표현할 수 있음!!
		System.out.println("-------------");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		
		/*// 풀어쓴 기본 코드
		System.out.println("--------------");
		System.out.println(num); //System.out.println(num++); 해도 돼.
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		*/
	}
}
