package com.mystudy.list5_list_vo;

public class StudentVO {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	public String getName() {
		return name;
	}
	
	
	public StudentVO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
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
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(avg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + eng;
		result = prime * result + kor;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + tot;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentVO other = (StudentVO) obj;
		if (Double.doubleToLongBits(avg) != Double.doubleToLongBits(other.avg))
			return false;
		if (eng != other.eng)
			return false;
		if (kor != other.kor)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (tot != other.tot)
			return false;
		return true;
	}


	public void computeTotAvg() {
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
	
	}
	
}
