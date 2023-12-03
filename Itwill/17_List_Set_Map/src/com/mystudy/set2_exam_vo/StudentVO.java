package com.mystudy.set2_exam_vo;

public class StudentVO {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	// 생성자 마음대로 만들기
	
	public StudentVO(String name, int kor, int eng, int math, int tot, double avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = tot;
		this.avg = avg;
	}
	
	// 메소드 마음대로 만들기
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	
	// toString에 구현되어 있는 문자열을 전달받아서 Main 화면에 구현 가능
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot
				+ ", avg=" + avg + "]";
	}
	
	public void computeTotAvg() {
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
	
	
	}
	
}
