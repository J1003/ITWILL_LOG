/* package 선언문 : java 파일의 맨 첫번째에 위치하며 한번만 작성. 
   자바(class) 파일의 위치를 나타냄.
   일반적으로 회사의 도메인명을 반대로 적용해서 사용한다.
   작성 예) com.naver.project, com.itwill.mystudy
 */
package edu.class1.basic;

// import 선언문 : 선택항목이지만 무조건 쓴다!
// (java.lang 패키지 이외의 패키지에 있는 타입 사용시 사용)
import java.util.Scanner;
//import java.util.*;// *의 의미 : java.util패키지에 있는 모든 것!

// class 선언문 : 필수 항목
public class Ex01_package_import_class {

	public static void main(String[] args) {
		//java.util.Scanner scan = new java.util.Scanner(System.in);
		// Scanner는 뭔가를 읽어줄 때 쓴다.(?)
		Scanner scan = new Scanner(System.in);
		System.out.print(">> 인사말 : ");
		
		//scan 객체에 있는 nextLine 메소드~
		
		String hello = scan.nextLine();
		System.out.println("인사말출력 : " + hello);
		
		
	}

}
