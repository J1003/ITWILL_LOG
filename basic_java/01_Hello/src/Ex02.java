
public class Ex02 {

	//메소드/메서드(method)
	public static void main(String[] args) {
		// 한 줄 주석문 : 주석부호(//)부터 문장의 끝까지를 주석(설명문) 처리
		/*
		여러줄 주석 처리시 사용
		*/
		System.out.println("Hello World!!"); //문장의 끝 세미콜른 필수!
		
		//문자열(String) 문자열 좌우측의 + 연산자는 문자열 붙이기 처리가 된다.
		System.out.println("1234567" + 1); 
		System.out.println(1 + "1234567");
		System.out.println(2 + 2);
		
		System.out.println("=======");
		
		/*
		화면(콘솔창)에 삼각형 모양을 출력
		*
		**
		***
		****
		*****
		==============
		    *
		   **
		  ***
		 ****
		*****
		============== */
		
		System.out.println("*");
		System.out.println("**"); //ctrl + alt + 화살표(위/아래)=(위/아래)에 복붙!
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		System.out.println("===========");
		System.out.println("    *");
		System.out.println("   **");
		System.out.println("  ***");
		System.out.println(" ****");
		System.out.println("*****");
		System.out.println("=========== *");
		
		/* 화면에 구구단 출력 2당
		2 * 1 = 2 // 2*1 결과값
		2 * 2 = 4
		2 * 3 = 6
		...
		2 * 9 = 18
		*/
		System.out.println("구구단 2단");
		System.out.println("2 * 1 = 2");
		System.out.println("2 * 2 = 4");
		System.out.println("2 * 3 = " + 2 * 3); //소괄호 없으면 구분 좀 어려움!
		System.out.println("2 * 4 = " + (2 * 4)); //(2*4) 소괄호 있어도 그만 없어도 그만!
		System.out.println("...");
		System.out.println("2 * 9 = " + 2 * 9);
		
		
		
		// 97단 출력
		/*
		97 * 1 = 97
		97 * 2 = ??
		97 * 3 = ??
		..
		97 * 9 = ??
		*/
		
		System.out.println("97 * 1 = 97");
		System.out.println("97 * 2 = " + (97 * 2));
		System.out.println("97 * 3 = " + (97 * 3));
		System.out.println("97 * 4 = " + (97 * 4));
		System.out.println("...");
		System.out.println("97 * 9 = " + (97 * 9));
		
		
	}

}
