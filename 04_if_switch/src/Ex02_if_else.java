
public class Ex02_if_else {

	public static void main(String[] args) {
		// if 문 3종류
		// if (조건) {}
		// if (조건) else {}
		// if (조건) else if () {} else if () {} .... else {}
		//-------------------------------------
		int num1 = 1000;
		int num2 = 50;
		System.out.println("num1 : " + num1 +", num2 : " + num2);
		
		//1. if (조건) {}        false일 경우 그 문장은 실행 안 된다.
		if (num1 > num2) {
			System.out.println("num1 > num2 : " + (num1 > num2));
			System.out.println("num1이 num2 보다 크다");
		}
		if (num1 <= num2) {
			System.out.println("num1이 num2보다 작거나 같다");
		}
		System.out.println(">> if () 끝");
		System.out.println("----------------");
		
		//2. if (조건) {} else {}
		if (num1 > num2) {
			System.out.println("num1이 num2보다 크다");
		} else {
			System.out.println("num1이 nun2보다 작거나 같다");
		}
		System.out.println(">> if ~ else 끝");
		System.out.println("--------------");
		
		//3. if (조건) {} else if () else if () {} .... else {}
		num1 = 100;
		num2 = 50;
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		
		if (num1 > num2) {
			System.out.println("num1이 num2보다 크다");
		} else if (num1 == num2) {
			System.out.println("num1은 num2와 동일하다(같다)");
		} else { //작은경우
			System.out.println("num1이 num2보다 작다");
		}
		
		System.out.println(">> if ~ else if ~ else 끝");
		System.out.println("====================");
		
		// 점수 평가 결과 출력 : 수, 우, 미, 양, 가
				/*
				90~100 :수
				80~89 : 우
				70~79 : 미
				60~69 : 양
				0~59 : 가
		------------*/
		// [실습2] if(조건) {} else if () {} else if () {} ... else {}
		System.out.println("----- 성적처리 -----");
		// 데이터 입력 -----------
		String name = "홍길동";
		int score = 5;
		String result2 = "평가안됨";
		
		// 데이터 처리 -----------
		if (score >= 90 && score <= 100 ) {
			result2 = "수";
			System.out.println(name + " : 수 " );
		} else if (score >= 80 && score <= 89) {
			System.out.println(name + ": 우 ");
		} else if (score >= 70 && score <= 79) {
			System.out.println(name + ": 미 ");
		} else if (score >= 60 && score <= 69) {
			System.out.println(name + ": 양 ");
		} else if (score >= 0 && score <= 59) {
			System.out.println(name + ": 가 ");
		}
		
		// 데이터 출력 ---------------
		System.out.println("이름 : " + name);
		System.out.println("점수 : " + score);
		System.out.println("평가결과 : " + result2);
		System.out.println("------- 성적처리 끝 -------");
		//
		//
		// [실습2] if(조건) {} else if () {} else if () {} ... else {}
				System.out.println("----- 성적처리 -----");
				// 데이터 입력 -----------
				String name1 = "홍길동";
				int score1 = 59;
				String result3 = "평가안됨";
				
				// 데이터 처리 -----------
				if (score < 0 || score > 100 ) {
					result3 = "잘못된 점수";
				} else if (score >= 90) {
					result3 = "수";
				} else if (score >= 80) {
					result3 = "우";
				} else if (score >= 70) {
					result3 = "미";
				} else if (score >= 60) {
					result3 = "양";
				} else {
					result3 = "가";
				}
				System.out.println("이름 : " + name1);
				System.out.println("점수 : " + score1);
				System.out.println("평가결과 : " + result3);
				System.out.println("------- 성적처리 끝 -------");
				
				//=======================
				// if문 내에 중첩해서 if문 얼마든지 여러번 사용 가능!
				/*
				if () {
					if () {
						if (){
						} else {
						}
					}
				}else {
					if() {
					} else if () {
					} else if () {
					} else {					
					}
				}
				*/
				
				
				// 데이터 출력 ---------------
				
	}

}
