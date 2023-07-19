package edul.class2.car;

public class CarMain {

	public static void main(String[] args) {
		// Car 클래스를 이용해서 Car 타입의 객체(인스턴스) 생성 사용.
		Car car1 = new Car(); //변수 이름 작성할 때 소문자로!
		car1.color = "검정";
		// car1.CAR_LENGTH = 400; <- (컴파일 오류) 파이널 변수값 수정 못함.
		
		System.out.println("자동차명 : " + car1.name); //Car.java에서 name 변수에 '마이카'로 지정되어 있음.
		System.out.println("모델명 : " + car1.model); //값을 설정 안 해주면??? 초기값 세팅이 되어 있다! 이렇게--> int,String etc 참조형데이터라면? - null, float/double - 0.0, boolean - false로 만들어진다. 
		System.out.println("색상명 : " + car1.color);
		System.out.println("차량길이 : " + car1.CAR_LENGTH);
		System.out.println("차량폭 : " + car1.CAR_WIDTH);
		System.out.println("에어백유무 : " + car1.hasAirbag);
		System.out.println("------------");
		
		car1.name = "처음 가져본 차";
		System.out.println("자동차명 : " + car1.name);
		car1.hasAirbag = true;
		System.out.println("에어백유무 : " + car1.hasAirbag);
		
		System.out.println("===== 기능 테스트 ===");
		car1.run(); // ctrl키 누르고 마우스 갖다 대면 그 위치로 옮겨줌.
		car1.stop();
		car1.back();
		
		System.out.println("==========");
		System.out.println("==== car2 생성 사용 =====");
		//Car car2 = new Car(); // 변수에 ctrl키 누르고 커서 갖다대면 작성했던 이전 코드 주소로 이동
								// 다시 alt 누르고 화살표 누르면 원래 위치로 이동
		Car car2 = new Car("SUV", "벤츠", "무광블랙");
		car2.dispData();
		
		car2.run();
		car2.stop();
		car2.back();
		
		
		
	}
}
