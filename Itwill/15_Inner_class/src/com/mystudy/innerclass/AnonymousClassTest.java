package com.mystudy.innerclass;

interface TestInter {
	int DATA = 100;
	void pritnData(); // 추상메소드 (구현부가 없기 때문에)
}

// 인터페이스를 구현한 클래스
class TestInterImpl implements TestInter {

	@Override
	public void pritnData() {
		System.out.println(">>> 구현한 메소드");
	}
}

public class AnonymousClassTest {

	public static void main(String[] args) {
		TestInterImpl imp = new TestInterImpl();
		imp.pritnData();
		
		TestInterImpl imp2 = new TestInterImpl();
		imp2.pritnData();
		
		
		System.out.println("--- 익명클래스 작성 ---");
		// 익명클래스 : 클래스에 이름이 없는 클래스 
		TestInter test = new TestInter() {

			@Override
			public void pritnData() {
				 System.out.println("DATA : " + DATA);
			}
		};
		test.pritnData();
		
		System.out.println("-- 1회성 객체 생성 사용 ---");
		// 단 한번만 쓰고 버려지는 객체
		(new TestInter() {
			@Override
			public void pritnData() {
				 System.out.println("DATA : " + DATA);
			}
		}).pritnData();
	}
}
