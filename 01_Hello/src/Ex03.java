
public class Ex03 {

	public static void main(String[] args) {
		// 십진수(우리가 쓰는 것), 2진수(컴퓨터가"), 8진수(거의 안 쓰임), 16진수
		// 2진수 4개가 모이면(네칸씩 자르면) 16진수로 표현 가능
		// 16진수 표현할 때 0~9까지는 그대로/ 10부터는 -> A B C...,a b c d...로 표현
		// 8bit => 1byte / bit에는 0,1만 올 수 있음
		
		//int - 정수값을 가리키는 데이터타입
		int decimal = 10; // =의 의미는? 우측에 있는 값을 좌측에 저장/치환
		int binary =1010; // 0b,0B 접두어 사용<-자바에서 2진수값으로 표현하고 싶을 때 
		int octal = 12; // 자바에서 숫자 앞에 0이 들어오면 012=12
						//0 접두어 숫자 0사용시 8진수가 된다!
		int hexaDecimal = 0Xa; //0x,0X 접두어 사용하면 -> 16진수
		
		//							 10 11 12 13 14 15
		//16진수 : 0 1 2 3 4 5 6 7 8 9 a  b  c  d  e  f 
		//16진수 : 0 1 2 3 4 5 6 7 8 9 A  B  C  D  E  F (ctrl+shift x/y 대문자/소문자 바꾸는 단축키)
		
		System.out.println("decimal : " + decimal); //dec 입력 후 ctrl+space 하면 정확한타입 나옴
		System.out.println("binary : " + binary); 
		System.out.println("octal : " + octal); 
		System.out.println("hexaDecimal : " + hexaDecimal); 
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toHexString(10));

	}

}
