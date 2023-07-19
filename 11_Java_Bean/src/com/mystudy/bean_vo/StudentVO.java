package com.mystudy.bean_vo;

// 자바빈(Java Bean) 형태의 클래스 작성
// VO(Value Object) : 값(데이터)을 저장하기 위한 클래스(객체) - Oxxxx, OxxxVO, OxxxVo
// DTO(Data Transfer Object) : 값(데이터)을 저장해서 전달하기 위한 클래스(객체).
// 		Oxxxx, OxxxDTO, OxxxxDto
public class StudentVO {    	// 뒤에 extends Object 생략되어 있음
	// 필드(변수)선언 ----
	// 성명 - name : String
	// 국어 - kor : int
	// 영어 - eng : int
	// 수학 - math : int
	// 총점 - tot : int
	// 평균 - avg : double
	
	// 생성자 작성 ------ (자동생성 가능)
	// 생성자 - 성명, 국어, 영어, 수학 점수를 입력받는 생성자
	
	// 메소드 작성 ------ (자동생성 가능)
	// setter, getters 모두 작성.
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	// === 생성자 =========
	
	public StudentVO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeTotAvg();
	}
//	public StudentVO() {
//		super(); 
//	}
//	public StudentVO(String name) {
//		super(); 
//		this.name = name;
//	}
//	public StudentVO(String name, int kor, int eng, int math) {
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//		computeTotAvg();
//	}
//	public StudentVO(String name, int kor, int eng, int math, int tot, int avg) {
//		this(name, kor, eng, math);
//		this.tot = tot;
//		this.avg = avg;
//	}

	
	// setters, getters 작성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; // this를 써서 name에다가 전달받은 값인 name을 저장하겠다.
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public void printData() {
		System.out.println(name + "\t " + kor + "\t" + eng + "\t" 
					+ math + "\t" + tot + "\t" + avg);
	}

	private void computeTotAvg() {
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
	}
	
	
	
}
