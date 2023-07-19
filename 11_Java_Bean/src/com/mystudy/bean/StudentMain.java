package com.mystudy.bean;

public class StudentMain {

	public static void main(String[] args) {
		Student stu = new Student();
		System.out.println("stu : " + stu.toString());
		
		//System.out.println("stu.name : " + stu.name); -> Not visible.
		stu.setName("홍길동");
		String name = stu.getName(); //두번세번이고 써야한다 하면 name = stu.getName();앞에 String해주면 돼.
		System.out.println("name : " + name);
		
		// stu.kor = 999;
		// System.out.println("kor : " + stu.kor);
		System.out.println("입력전 kor : " + stu.getKor());
		
		stu.setKor(100);
		System.out.println("입력 후 kor : " + stu.getKor());
		
		stu.setEng(90);
		System.out.println("eng : " + stu.getEng());
		
		stu.setMath(81);
		System.out.println("math : " + stu.getMath());
		
		int tot = stu.getKor() + stu.getEng() + stu.getMath();
		System.out.println("tot : " + tot);
		
		stu.setTot(tot); // 계산된 합계 데이터를 Student 타입의 객체의 필드에 저장.
		
		double avg = tot * 100 / 3 / 100.0; 
		stu.setAvg(avg);
		
		stu.printData();
		
		System.out.println("=== 생성자 사용해서 데이터를 입력할 수 있다 =====");
		Student stu2 = new Student("김유신", 100, 90, 82);
		
		
		stu2.printData();
	}

}
