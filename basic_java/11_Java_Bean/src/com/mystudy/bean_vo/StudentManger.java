package com.mystudy.bean_vo;

import java.util.Arrays;

public class StudentManger {

	public static void main(String[] args) {
		/* 3명의 성적 처리 StudentVo 사용해서 데이터 처리
		 * 3개의  ValueObject를 만들어서~~
		 "김유신", 100, 90, 81
		 "이순신", 95, 88, 92
		 "홍길동", 90, 87, 77
		 ==== 데이터 출력 ==
		 김유신	100 90 81 271 90.33
		 이순신 	95  88 92 ??? ??.??
		 홍길동 	90  87 77 ??? ??.??
		 ---------------------------------- */
		StudentVO stu = new StudentVO("김유신", 100, 90, 81);
		System.out.println("name : " + stu.getName());
		
		stu.setName("김유신");
		String name = stu.getName();
		System.out.println(name);
		
		/////////////////// 선생님 답변
		System.out.println("==== 쌤 답변 =====");
		
		StudentVO stu1 = new StudentVO("김유신", 100, 90, 81);
		System.out.println("name : " + stu.getName());
		StudentVO stu2 = new StudentVO("이순신", 95, 88, 92);
		StudentVO stu3 = new StudentVO("홍길동", 90, 87, 77);
		
		
		System.out.println("성명\t국어\t영어\t수학\t총점\t평균");
		printdata(stu1);
		printdata(stu2);
		printdata(stu3);
		
		StudentVO[] students = new StudentVO[3];
		students[0] = stu1;
		students[1] = stu2;
		students[2] = stu3;
		
		students = new StudentVO[] {stu, stu2, stu3};
		System.out.println(Arrays.toString(students));
		for (int i = 0; i < students.length; i++) {
			printdata(students[i]);
			}
		}
		static void printdata(StudentVO stu) {
			System.out.println(stu.getName() + "\t" + stu.getKor() + "\t" + stu.getEng() + "\t" 
					+ stu.getMath() + "\t" + stu.getTot() + "\t" + stu.getAvg());
		}
		static void printData(StudentVO[] students) {
			System.out.println(Arrays.toString(students));
			printData(students);
			
		/////////////////// 내 답변 /////////////////////////////	
			
		System.out.println("======내 답변======");
		
		StudentVO stu = new StudentVO("김유신", 100, 90, 81);
		System.out.println("name : " + stu.getName());
		
		stu.setName("김유신");
		String name = stu.getName();
		System.out.println(name);
		
		
		stu.setKor(100);
		System.out.print(stu.getKor() + " ");
		stu.setEng(90);
		System.out.print(stu.getEng() + " ");
		stu.setMath(81);
		System.out.println(stu.getMath() + " ");
	
		
		int tot = stu.getKor() + stu.getEng() + stu.getMath();
		System.out.println("tot : " + tot);
		stu.setTot(tot);
		
		double avg = tot * 100 / 3 / 100.0;
		System.out.println("avg : " + avg);
		stu.setAvg(avg);
		
		stu.printData();
		
		StudentVO stu2 = new StudentVO("이순신", 95, 88, 92);
		stu2.printData();
		
		StudentVO stu3 = new StudentVO("홍길동", 90, 87, 77);
		stu3.printData();
		
	}
	
}
