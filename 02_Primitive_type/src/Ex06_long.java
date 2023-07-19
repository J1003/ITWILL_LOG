
public class Ex06_long {

	public static void main(String[] args) {
		// 정수형 long : 8byte(64bit)
		// 범위 : -9223372036854775808 ~ 9223372036854775807
		// long 타임값 명시적 표현 : 숫자 + L 또는 1(영문 대소문자 엘)
		long num1 = 20000000000L; //long을 의미하는 접미어 L을 사용
		long num2 = 30000000000L;
		long sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println("======================");
		
		byte numByte = 10;
		short numShort = 3000;
		int numInt = 3000000;
		long numLong = 500000000000000L;
		
		numByte = (byte)numShort; // 오류발생이유 - 손실발생 가능성이 있어서!
		System.out.println("numByte : " + numByte); //큰데이터 타입을 작은데이터 타입으로 넣을 때 조심해야 한다.
		
		numLong = numInt; // 자동형변환 long타입에 int 타입을 넣는다 = 손실발생 X
		System.out.println("numLong : " + numLong);
		
		System.out.println("long 최소값 : " + Long.MIN_VALUE);
		System.out.println("long 최대값 : " + Long.MAX_VALUE);
	}

}
