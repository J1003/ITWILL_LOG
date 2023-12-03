
public class Ex01_if {

	public static void main(String[] args) {
		/* 제어문 - 분기문(비교문) : if 문
		if () {
			실행할 문장들(조건이 참일 때);
		}
		*/
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1 < num2 : " + (num1 < num2));
		// num1의 값이 num2보다 작으면 출력된다
		if (num1 < num2) {
			System.out.println("num1이 num2보다 작다");	
		}
		System.out.println(">> 비교작업 끝");
		System.out.println("--------------");
		
		boolean result = num1 < num2;
		if (result) {
			System.out.println("num1이 num2보다 작다");
		}
		System.out.println(">> 비교작업 끝2");
		System.out.println("=====================");
		
		// 점수 평가 결과 출력 : 수, 우, 미, 양, 가
		/*
		90~100 :수
		80~89 : 우
		70~79 : 미
		60~69 : 양
		0~59 : 가
		*/
		System.out.println("----- 성적처리 -----");
		String name = "홍길동";
		int score = 200;
		String result2 = "평가안됨";
		
		System.out.println("이름 : " + name);
		System.out.println("스코어 : " + score);
		
		// 평가작업 (달라지는 값은 변수처리 한다.)
		if (score >= 90 && score <= 100) {  // (90 <= score >= 100 (X)
			//System.out.println(" 평가결과 : 수");
			result2 = "수";
		}
		
		if (score >= 80 && score <= 89) {  //뒤에 <90 이렇게 써도 되지만 보기에 불편!
			//System.out.println(":: 평가결과 : 우");
			result2 = "우";
		}
		
		if (score >= 70 && score <= 79) {
			//System.out.println(":: 평가결과 : 미");
			result2 = "미";
		}
		
		if (score >= 60 && score <= 69) {
			//System.out.println(":: 평가결과 : 양");
			result2 = "양";
		}
		
		if (score >= 0 && score <= 59) {
			//System.out.println(":: 평가결과 : 가");
			result2 = "가";
		}
		System.out.println(":: 평가결과 : " + result2);
		
		System.out.println(">> 성적처리 끝 ---------");
	}

}
