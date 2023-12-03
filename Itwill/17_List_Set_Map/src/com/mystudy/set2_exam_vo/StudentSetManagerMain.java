package com.mystudy.set2_exam_vo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.mystudy.list5_list_vo.StudentVO;

public class StudentSetManagerMain {

	public static void main(String[] args) {
		/* (실습) Set 중 HashSet 또는 TreeSet 사용해서 만들기!
		 사용클래스명 : StudentVO, StudentSetManagerMain - main() 메소드
		1. StudentVO 클래스를 사용해서
		   3명의 학생데이터(성명,국어,영어,수학)를 만들고(저장하고)
		   "홍길동", 100, 90, 81
		   "이순신", 95, 88, 92
		   "김유신", 90, 87, 77
		   ---------------------
		2. Set 타입의 변수(set)에 저장하고
		3. set에 있는 데이터를 사용해서 화면출력
		   성명   국어  영어  수학  총점  평균
		   ---------------------------------
		   홍길동  100  90  81   270  90.33
		   ...
		4. "김유신" 국어 점수를 95 점으로 수정
		5. 수정된 "김유신" 데이터만 출력 확인
		6. 전체 데이터 화면 출력
		======================================== */
		
		// 문제1
		StudentVO stu1 = new StudentVO("홍길동", 100, 90, 81);
		StudentVO stu2 = new StudentVO("이순신", 95, 88, 92);
		StudentVO stu3 = new StudentVO("김유신", 90, 87, 77);
		
		
		// 문제2
		// 분홍색은 인터페이스이다. 인터페이스 뒤에<>에는 클래스가 들어갈 수 있다.
		HashSet<StudentVO> set = new HashSet<>();
		
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		
		System.out.println(set);
		System.out.println("------------");
		
		
		// 문제3
		// Iterator나 개선된 for문 사용 BUT 개선된 for문이 더 심플.
		System.out.println("성명\t국어\t영어\t수학\t총점\t평균");
		for (StudentVO vo : set) {
			vo.computeTotAvg();
			System.out.println(vo.getName() + "\t" + 
			    		vo.getKor() + "\t" +
			            vo.getEng() + "\t" + 
			    		vo.getMath() + "\t" +
			            vo.getTot() + "\t" +
			    		vo.getAvg());
		}
		
		System.out.println("-----------------------------------");
		// 문제4
		// set에서는 remove와 add를 써라!!! set은 안 돼!
		
		for (StudentVO vo : set) {
			//if ("김유신".equals(vo.getName()))
		    if (vo.getName().equals("김유신")) {
		        vo.setKor(95);
		        vo.computeTotAvg();
		        System.out.println(vo.getName() + "\t" + 
			    		vo.getKor() + "\t" +
			            vo.getEng() + "\t" + 
			    		vo.getMath() + "\t" +
			            vo.getTot() + "\t" +
			    		vo.getAvg());
		        break; // No need to continue the loop once we find the data
		    }
		}
		
		// 문제5
		System.out.println("== 문제5 ====");
		System.out.println(set);
		
		// 문제6
		System.out.println("== 문제6====");
		for (StudentVO vo : set) {
			System.out.println(vo);
		}
		
		// TreeSet 개인적으로 해보기.
		
	}

}
