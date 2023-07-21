package com.mystudy.list5_list_vo;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentManagerMain {

	public static void main(String[] args) {
		/* (실습) List를 사용한 성적 처리
		사용클래스명 : StudentVO, StudentListManager - main() 메소드
		1. StudentVO 클래스를 사용해서
		   3명의 학생데이터(성명,국어,영어,수학)를 만들고(저장하고)
		   "홍길동", 100, 90, 81
		   "이순신", 95, 88, 92
		   "김유신", 90, 87, 77
		2. ArrayList 타입의 변수(list)에 저장하고
		3. list에 있는 전체 데이터 화면출력
		   성명   국어  영어  수학  총점  평균
		   ---------------------------------
		   홍길동  100  90  81   270  90.33
		   ...
		4. 김유신 국어 점수를 95 점으로 수정 후 김유신 데이터만 출력
		5. 전체 데이터 화면 출력
		========================================== */
		
		StudentVO stu1 = new StudentVO("홍길동", 100, 90, 81);
		StudentVO stu2 = new StudentVO("이순신", 95, 88, 92);
		StudentVO stu3 = new StudentVO("김유신", 90, 87, 77);
//		System.out.println(stu1.getName());
//		System.out.println(stu1.toString());
		
		/// 문제2 --------
		System.out.println("--- 문제2 ----");
		
//		String names = "홍길동,이순신,김유신";
		ArrayList<StudentVO> list = new ArrayList<>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		
		int tot1 = stu1.getKor() + stu1.getEng() + stu1.getKor();
		int tot2 = stu2.getKor() + stu2.getEng() + stu2.getKor();
		int tot3 = stu3.getKor() + stu3.getEng() + stu3.getKor();
		
		double avg1 = tot1 / 100 / 3 / 100.0;
		double avg2 = tot2 / 100 / 3 / 100.0;
		double avg3 = tot3 / 100 / 3 / 100.0;
		
		
		
//		StudentVO student = list.get(0);
////		String name = student.getName();
//		System.out.println(student.getName() + " " + student.getKor() + " " 
//					+ student.getEng() + " " + student.getMath() + " " 
//					+ tot1);
//		StudentVO student1 = list.get(1);
//		System.out.println(student1.getName() + " " + student1.getKor() + " " 
//					+ student1.getEng() + " " + student1.getMath() + " " 
//					+ tot2);
//		StudentVO student2 = list.get(2);
//		System.out.println(student2.getName() + " " + student2.getKor() + " " 
//					+ student2.getEng() + " " + student2.getMath() + " " 
//					+ tot3);
		
		
		////// 개선된 for문
		/// 위에꺼 정리하면 --------------------------
		System.out.println("--- 문제3 ----");
		System.out.println(" >> 정리하면 <<");
		System.out.println("성명\t국어\t영어\t수학\t총점\t평균");
		for (StudentVO simple : list) {
			int tot = simple.getKor() + simple.getEng() + simple.getMath();
			double avg = tot * 100 / 3 / 100.0;
		    System.out.println(simple.getName() + " " + simple.getKor() + " " 
		            + simple.getEng() + " " + simple.getMath() + " "
		            + tot + " " + avg);
		}
		
//		System.out.println("성명\t국어\t영어\t수학\t\총점\t평균");
		
		System.out.println("--- 문제4 ----");
		
	}

}
