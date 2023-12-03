package com.mystudy.wrapper;

public class Ex01_wrapper_class {

	public static void main(String[] args) {
		// wrapper class : 기본 데이터 타입의 기능확장한 클래스(들) 총칭.
		// 기본 데이터 타입 : 전체소문자
		// boolean, char, byte, short, int, long, float, double
		// wrapper class : 기본 데이터 타입의 첫 글자를 대문자로!
		// 예외) char -> Character / int -> Integer (클래스를 만들 때는 풀네임으로!)
		// Boolean, Character, Byte, Short, Integer, Long, Float, Double
		//--------------------------------------------------------------
		
		int num = 100; 			//int 타입은 데이터를 저장하고 불러오는 기능만 한다.
		System.out.println("num : " + num);
		
		//Integer intNum = new Integer(100);
		Integer intNum = new Integer("100"); // 문자열을 형변환 해서 숫자열로~
		System.out.println("Integer intNum : " + intNum);
		
		
		String strNum = intNum.toString(); // 저장되어 있는 숫자 타입의 데이터를 문자열로 바꿔준다.
		System.out.println("String strNum : " + strNum);
		
		
		intNum = 900; // Integer 타입의 int 값 -> 자동형변환
		num = intNum; // int <--- Integer : 자동형변환
		
		
		// parseInt <-- 기본데이터타입으로 바꾸는!
		num = Integer.parseInt("999"); // 우측에 있던 문자열 "999"가 좌측의 숫자값으로 바뀐다.
		intNum = Integer.valueOf("999"); // String 타입을 --> Integer로 바꿈
		// valueOf = 해당데이터 타입으로 바꿔주는 역할
		
		
		String str = String.valueOf(9999); // int를 ---> String 타입으로 바꿈
										// 전달받은 데이터를 해당 데이터타입으로 바꾼다.
		
		// "9999" + 1 ---> "99991" string 문자열에 숫자가 붙는!
		// 9999 + 1 --> 10000
		
		
		System.out.println("int 최대값 : " + Integer.MAX_VALUE); 
		System.out.println("int 최소값 : " + Integer.MIN_VALUE);
		
		// Boolean
		System.out.println("--- Boolean ---");
		Boolean bool = true; 		// Boolean 타입의 bool 변수의 true.
		bool = new Boolean(true);
		bool = new Boolean("true");
		bool = new Boolean("TRUE");
		bool = new Boolean("TRue");  // 대소문자 섞여있어도 철자만 맞으면 true!
		
		System.out.println("Boolean true : " + bool);
		
		bool = new Boolean("false");
		bool = new Boolean("FALSE");
		bool = new Boolean("FALse");
		bool = new Boolean("true1"); // 숫자1이 없으면 true. 숫자1이 있으면 false!
									 // 결론적으로 철자만 맞으면 true/false 나온다!
		bool = new Boolean ("abcd"); // true가 아닌 문자열. 
		System.out.println("Boolean flase : " + bool);
		
		//  String --> Boolean으로 형변환
		System.out.println("--- String --> Boolean으로 형변환 ---");
		Boolean bool2 = Boolean.valueOf("true"); // String 타입을 -> Boolean 타입으로 형변환
		boolean bool3 = Boolean.parseBoolean("true"); // parseBoolean = 문자열을 기본데이터 타입으로 변환
		
		
		// Float, Double
		System.out.println("=== Float, Double ===");
		Float f = 10.5f; // float ---> Float
		f = new Float(12.5);
		f = new Float("12.5f");
		f = new Float("12.5"); // 문자열도 float 타입으로 처리가 된다.
		 
		System.out.println("Float f : " + f);
		
		
		//f = "12.5f"; // Type mismatch : cannot convert from String to float
		String str2 = String.valueOf(f); // Float 타입을 --> String으로 형변환
		System.out.println("String str2 : " + str2);
		
		f = Float.valueOf("12.5f"); // valueOf는 {String타입을 ---> Float 타입으로 바꿀 때.}
		System.out.println("Float f : " + f);
		System.out.println("------------");
		
		
		Double d = 10.5d; // Double <--- double 
		d = new Double(12.5d);
		d = new Double("12.5d");
		
		System.out.println("Double d : " + d);
		
		d = Double.valueOf(12.5d); // 문자열을 -> Double 타입으로 형변환
		d = Double.valueOf("12.5d");
		System.out.println("Double d : " + d);
		
	}

}
