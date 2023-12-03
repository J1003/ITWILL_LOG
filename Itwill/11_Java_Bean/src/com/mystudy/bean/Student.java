package com.mystudy.bean;

/*
 ■ 자바빈(Java Bean)
  - 멤버변수(property)의 접근제어자는 private
  - 멤버변수(property) 마다 get/set 메소드 제공(선택적으로 get만 제공)
  
  - get/set 메소드는 public으로 제공한다.
  - get 메소드는 파라미터 없고, set 메소드는 하나 이상의 파라미터 존재
  - 멤버변수(property)가 boolean 타입이면 get 메소드 대신 is 메소드 사용가능
  - 외부에서 멤버변수(property) 접근시에는 get/set 메소드를 통해 접근 
 */

//public class Student extends Object {
class Student { //extend Object 생략하면 컴파일러가 자동 삽입해준다.
	private String name; 
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	
	// === 생성자 =========
	public Student() {
		// super : 부모클래스 객체(인스턴스)
		// super() : 부모클래스 객체에 소괄호()가 있으면 기본생성자를 호출;
		super(); // 생성자 호출. 생략시 컴파일러가 자동 삽입해서 처리함.
	}
	
	
	public Student(String name) {
		super(); // 생략시 컴파일러가 자동 삽입해서 처리함.
				// 다른 생성자를 호출하는 코드는 최상단에 와야함!!! 생성자 코드 중 맨 처음 작성되어 실행되어야 함.
		this.name = name;
	}
	
	
	public Student(String name, int kor, int eng, int math) {
		// 현재객체 (인스턴스)의 생성자 호출
		this(name); // 다른 생성자를 호출하는 코드는 최상단에 와야함!!! 생성자 코드 중 맨 처음 작성되어 실행되어야 함.
					// this(); 이렇게 쓰면 "생성자의 재사용"
		//this.name = name;
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeTotAvg();
	}
	
	public Student(String name, int kor, int eng, int math, int tot, int avg) {
		this(name, kor, eng, math);
		this.tot = tot;
		this.avg = avg;
	}
		
//	int kor; ==> private 없이 다이렉트로 필드에 접근할 수 있게 해놓으면, 
//			 	Main에 stu.kor = 999; 이렇게 해놨을 때 kor값을 컨트롤 할 수 없다.
//	 외부에서 접근할 수 없게 private으로 설정해주면 접근 제한되기 때문에 외부에서 못 쓴다.
	
	
	// == 메소드 작성 영역 ====
	// 외부에서 사용할 수 있도록 메소드를 제공한다.(public) - public으로 제공하는 게 일반적.
	// 외부에서 데이터를 전달받아 필드(멤버변수)에 데이터 저장하기 위한 set 메소드
	// 명칭(호칭) : set메소드, setter, set property(속성값 설정/쓰기)
	
	// 데이터 설정할 때 => set 메소드 		(전달할 데이터 필요)
	// 데이터를 읽어올 때 => get 메소드 	(전달 받는 데이터 필요)			

	public void setName(String name) {
		this.name = name; // this를 써서 name에다가 전달받은 값인 name을 저장하겠다.
	}
	
	// 이 클래스는 외부에 있는 데이터의 값을 설정하기 위해서
	// 외부에서 데이터를 읽어 가기 위한 get 메소드이다.
	// 명칭(호칭) : get메소드, getter, get property(속성값 읽기)
	public String getName() {
		return name;
	}
	
	// kor : setter, getter
	public void setKor(int kor) {
		// 적절한 값인지 데이터 여부 확인
		if (kor >= 0 && kor <= 100) {
			this.kor = kor;
		} else {
			System.out.print("[예외발생] 국어 0~100 값이 아님 - " + kor);
		}
	}
	public int getKor() {
		return kor;
	}
	
	// (실습) eng, math : setters, getters 작성
	public void setEng(int eng) {
		this.eng = eng; //  this. ->현재객체에 있는 필드변수를 바꿔줄 때
	}
	public int getEng() {
		return eng;
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
	
	
	
	// set get 메소드 자동으로 만들어주기! 
	// 마우스 우클릭 source -> generate getters and setters
	
	public void printData() {
		System.out.println(name + "\t " + kor + "\t" + eng + "\t" 
					+ math + "\t" + tot + "\t" + avg);
	}

	private void computeTotAvg() {
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
	}
	

}

