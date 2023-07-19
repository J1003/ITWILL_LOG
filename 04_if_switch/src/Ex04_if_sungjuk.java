
public class Ex04_if_sungjuk {

	public static void main(String[] args) {
		/* [실습] 성적처리
		국어(kor), 영어(eng), 수학(math)
		총점(tot) = 국어 + 영어 + 수학
		평균(avg) = 총점 / 3
		-------------------
		평균점수 구간에 따라 평가
		90 ~ 100 : A
		80 ~ 89 : B
		70 ~ 79 : C
		60 ~ 69 : D
		69미만(0~59) : F 재수강하세요
		========================
		<처리결과>
		국어 : 100
		영어 : 90
		수학 : 80
		------------
		총점 : 270
		평균 : 90
		평가결과 : A
 		======================== */
		// 성적 입력 
		int kor = 100;
		int eng = 90;
		int math = 80;
		
		// 성적 처리 (총점, 평균, 평가)
		int tot = kor + eng + math;
		int avg = tot / 3;    
		// [double avg = tot / 3.0;]
		// [double avg = tot * 100 / 3 / 100.0; 소수점 이하 둘째자리까지 나타내고 싶을 때.		
		// avg = Math.round(tot * 100 / 3.0) / 100.0; 소수점 이하 셋째자리 반올림
		
		//평균값에 대한 평가 작업
		String resulMsg = "F 재수강하세요";
		//avg = 50;
		String result = "평가안됨";
		
		if (avg >= 90) {
			resulMsg = "A";
		} else if (avg >= 80) {
			resulMsg = "B";
		} else if (avg >= 70) {
			resulMsg = "C";
		} else if (avg >= 60) {
			resulMsg = "D";
		} else {
			resulMsg = "F 재수강 하세요";
		}
		// 처리 결과 출력
		System.out.println("<처리결과>");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("=====================");
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		System.out.println("점수 : " + result);
		System.out.println("평가결과 : " + resulMsg);
		System.out.println("------- 성적처리 끝 -------");
		
	}

}
