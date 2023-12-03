package com.mystudy.generic;

class Box {
	Object obj; // 필드(멤버) 변수의 타입
				//모든데이터를 저장할 수 있는 Object 타입

	Object getObj() { // 리턴타입
		return obj;
	}
	void setObj(Object obj) { // 파라미터 타입(매개변수)
		this.obj = obj;
	}
	
}

// 제네릭 적용된 박스
class BoxG<T> {
	T obj;
	T getObj() {
		return obj;
	}
	void setObj(T obj) { // 전달받는 파라미터 값 T
		this.obj = obj;
	}
}

public class GenericExam {

	public static void main(String[] args) {
	/*
	  ■ 제네릭(Generic) : 컬렉션이 어떤 객체들로 이루어졌는지 표시하는 객체타입을 의미
	  	제네릭 형태 : <객체자료형>, <>
	     API -> <T> : 객체자료형, <E> : 하나의 요소(즉 객체 하나를 의미)
	           Map형식 : <K, V> K는 key(키), V는 value(값)
	  	-----------------
	  	제네릭(Generic)의 대표문자(wildcard)
	     1. <?> : 모든 타입(객체) 자료형에 대한 대표문자를 의미
	     2. <? extends 자료형> : 자료형을 상속받은 자녀(sub) 클래스 타입 사용
	     3. <? super 자료형> : 자료형의 부모(super) 타입 사용           
		-------------------------------------------- */
		// 제네릭 사용 안 한 Box를 사용하는 경우
		Box box = new Box();
		box.setObj("문자열 String");
		box.setObj(100);
		box.setObj(new Box()); // 박스 객체도 담을 수 있음
		box.setObj(new Integer(10000));
		System.out.println(box.getObj());
	
		Integer integer = (Integer) box.getObj(); // 타입체크 하기 전에 형변환 해서 인티저에 저장하는 작업은 꼭 필요.
		System.out.println("integer : " + integer);
		System.out.println(integer.MAX_VALUE);
		
		String str = "Hello Java";
		String str2 = "100000"; // 숫자이지만 "100000" 이렇게 쌍따옴표로 묶어서 스트링 타입이다!
		int str3 = 333; 
		
		System.out.println("=== 제네릭이 적용된 클래스 사용 ===");
		// Box인데 Generic에 적용된 Box
		BoxG<String> boxg = new BoxG<String>(); 
		boxg.setObj("문자열 String");
		boxg.setObj(str);  // ()<-여기 안에 타입이 string 타입이면 오류가 안 남. 근데 숫자 들어가면 오류 발생.
		boxg.setObj(str2); // <- 타입이 일치하지 않으면 컴파일 오류 발생!
		// boxg.setObj(str3); <- 타입 미스매치! 위에 int str3 = 333; 값이 String 타입이 아니니까!
		// 만약 위에 BoxG<Integer> boxg = new BoxG<Integer>(); 이렇게 바꾸면
		// boxg.setObj(str3); 값은 정상출력! Generic은 이런 의미이다.
		
		String strValue = boxg.getObj();
		System.out.println("strValue : " + strValue);
		System.out.println(boxg.getObj());
	}

}
