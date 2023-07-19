
public class Ex02_char {

	public static void main(String[] args) {
		// 문자형(char) : 2 byte 사용, 문자 1글자 저장(0 ~ 655355)
		// 자바 문자처리 방식 = 유니코드(Unicode)형태
		char char1 = 'A'; //char char는 (x) -> char char1/2/3..으로 나타내야 함
					      // "A"는 문자열(Stirng), 'A'는 문자(char)
		System.out.println(("char1 : " + char1));
		System.out.println("char1 다음문자 : " + (char1 + 1)); //=66, char1=65
		System.out.println("char1 다음문자 : " + (char)(char1 + 1)); // 앞에 (char)는 형변환이라고 한다.
		
		char char2 = '한';
		System.out.println("char2 : " + char2);
		
		char char3 = '\uAC00'; // 역슬래쉬u = 유니코드 값으로 설정하여 사용 가능
		System.out.println("char3 : " + char3);
		
		System.out.println("---------");
		System.out.println("char1 : " + char1); // A, 65
		
		char1 = (char)(char1 + 1); // char <- int 강제 형변환
		System.out.println("char1(다음값) : " + char1);
 
		System.out.println((int)'A');
	}

}
