package com.mystudy.array;

public class SungjukManagerExam {

	public static void main(String[] args) {
		// 클래스를 사용하지 못 할 때의 성적처리
		// 2차원 배열을 사용한 성적 처리
		// 국어, 영어, 수학, 점수 3개를 저장한 2차원 배열(sungjuk)을 만들고
		// 3명의 성적을 입력하고 개인별 총점과 평균을 계산 후 화면에 출력
		// --------------
		/*
		 출력형식 : 국어\t영어 수학 총점 평균
		 ----------------
		 이름 굳이 화면 출력 안 해도 돼(할 거면 String 써야 함)
		 여기서 국어, 영어, 수학이 입력값이다.
		 배열은 평균값을 같이 가질 수 없다.
		 100  90  80  270  90.0
		 100  90  81  271  90.33
		 100  90  82  272  90.66
		 --------------*/
		
		int[][] sungjuk = {{100, 90, 80}, 
						   {100, 90, 81}, 	
						   {100, 90, 82}};
		
		System.out.println("-- 쌤 답변 ---");
		
		// 1번째 사람 데이터 처리 ----
//		int kor = sungjuk[0][0];
//		int eng = sungjuk[0][1];
//		int math = sungjuk[0][2];
		
//		// 2번째 사람
//		int kor = sungjuk[1][0];
//		int eng = sungjuk[1][1];
//		int math = sungjuk[1][2];
		
		String[] names = {"김유신", "이순신", "홍길동"};
		int[] tots = new int[sungjuk.length];
		double[] avgs = new double[sungjuk.length];
		
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------");
		for (int i = 0; i < sungjuk.length; i++) {
			int kor = sungjuk[i][0];
			int eng = sungjuk[i][1];
			int math = sungjuk[i][2];
			
			// 계산처리
			int tot = kor + eng + math;
			double avg = tot * 100 / 3 / 100.0;
			
			// 화면출력
			System.out.println(kor + "\t" + eng + "\t" + math + "\t" + tot +"\t" + avg);
			
		}
		System.out.println("=== 김유신 성적 화면출력 ====");
		
		
		////////////////////////////////////////////
		System.out.println("-- 내 답변 ----");
		
		int tot1 = 0;
		for (int i = 0; i < sungjuk.length; i++) {
			System.out.print("sungjuk" + i + " : ");
			for (int i1 = 0; i1 < sungjuk[i].length; i1++) {
				System.out.print(sungjuk[i][i1] + " ");
				tot1 = tot1 + sungjuk[i][i1];
			}
			System.out.print(tot1 + " ");
			double avg1 = tot1 * 100/ 3/ 100.0;
			System.out.println(avg1);
			tot1 = 0;
		}
		System.out.println();
		
//		for (int i = 0; i < sungjuk.length; i++) {
//			double tot = sungjuk[i][0] + sungjuk[i][1] + sungjuk[i][2];
//			double avg = tot/3;
//			System.out.println(tot + " " + avg);
//		}
		
		
		
	}
}
