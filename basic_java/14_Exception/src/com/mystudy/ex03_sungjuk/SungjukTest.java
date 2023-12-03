package com.mystudy.ex03_sungjuk;

// 메소드 내부에 메소드는 (X)
// 메소드/클래스 내부에 클래스 만드는 거 허용
public class SungjukTest {

	public static void main(String[] args) {
		System.out.println("--- main() 시작 ---");
		// tot, avg 모르면 0으로 설정!
		SungjukVO stu = new SungjukVO("홍길동", 100, 90, 80, 0, 0); 
		stu.setKor(999);
		
		System.out.println("--- setEng() 처리 ---");
		try {
			stu.setEng(955);
		} catch (JumsuOutOfValueException e) {
			e.printStackTrace();
			System.out.println(e.getMessage()
					+ " : 0~100 범위의 값으로 다시 입력하세요.");
		} catch (SungjukProcessException e) {
			System.out.println("[예외발생] 성적처리 중 예외발생");
		}
		
		
		System.out.println("stu : " + stu); 
		// to.String() =>내가 안 가지고 있으니까 object꺼 호출!
		// BUT 구현 되어 있으면 안 써도 OK. (SungjukVO에 override로 처리되어 있어서 안 써도 무방)
		
		
		System.out.println("--- main() 끝 ---");
		
	}

}
