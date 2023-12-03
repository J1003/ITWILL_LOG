
public class Ex04_plusEqual {

	public static void main(String[] args) {
		// 대입연산자 : =, +=, -=, *=, /=, %=
		// 예) num += 2; ----> num = num + 2;
		int result = 0;
		System.out.println("result : " + result);
		
		result += 15; // result = result + 15; ( = 는 같다가 아니라 우측에 있는 값을 좌측에 저장)
		System.out.println("result += 15 : " + result);
		
		result += 15; // result = result + 15; ( = 는 같다가 아니라 우측에 있는 값을 좌측에 저장)
		System.out.println("result += 15 : " + result);
		
		System.out.println("---- -= 연산 -----");
		System.out.println("result : " + result);
		result -= 10; // result = result - 10;
		System.out.println("result -= 10 : " + result);
		System.out.println(); // <-- 이렇게 하면줄바꿈 처리만 된다
		
		System.out.println("------ *= 연산 ------");
		result *= 10; //result = result * 10;
		System.out.println("result *= 10 : " + result);
		System.out.println(); // <-- 이렇게 하면줄바꿈 처리만 된다
		
		System.out.println("----- /= 연산 -----");
		result /= 10; // result = reuslt / 10;
		System.out.println("result /= 10 : " + result);
		System.out.println(); // <-- 이렇게 하면줄바꿈 처리만 된다
		
		System.out.println("---- %/= 연산 (나머지) -----");
		result %= 3; // result = result % 3; // %는 나눈 나머지 값 구하기
		System.out.println("result %= 3 : " + result);
		
	}

}
