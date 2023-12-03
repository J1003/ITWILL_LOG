package com.mystudy.ex06_type_casting;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("=== Car 클래스 ===");
		Car car = new Car();
		car.type = "자동차";
		System.out.println("타입 : " + car.type);
		car.drive();
		car.stop();
		
		System.out.println("=== Ambulance 클래스 ===");
		Ambulance am = new Ambulance();
		am.type = "구급차";
		System.out.println("타입 : " + am.type);
		am.drive();
		am.stop();
		am.siren();
		
		System.out.println("=== FireEngine 클래스 ===");
		FireEngine fe = new FireEngine();
		fe.type = "소방차";
		System.out.println("타입 : " + fe.type);
		fe.drive();
		fe.stop();
		fe.siren();
		fe.water();
		
		System.out.println("=== 형변환 ===");
		// Car, Ambulance, FireEngine
		Car car2 = new Car(); // Car <-- Car
		car2.drive();
		System.out.println("type : " + car2.type);
		car2.drive();
		car2.stop();
		
		//car2.siren(); // undefined 컴파일 오류 : Car 타입에는 siren() 메소드가 없음.
						// ㅇㅇㅇ() 하면 ()가 있어서 ㅇㅇㅇ메소드라고 부른다.
		System.out.println("--- Car <--- Ambulance 저장 ---");
		// Car <--- Ambulance : 부모(상위)타입 <--- 자녀(하위)타입(자동형변환)
		// 부모(상위)클래스에 자녀(하위)클래스를 저장
		car2 = am; // Car <--- Ambulance : 자동형변환
		System.out.println("car2.type : " + car2.type);
		car2.drive();
		car2.stop();
		
		((Ambulance)car2).siren(); 
		// 앰뷸런스 고유기능인 siren을 울리려면 형변환 처리가 되어야 한다. 
		// 즉, car2.siren(); <-는 Ambulance타입이 되어야 한다.
		// ()괄호로 감싸주지 않으면 siren 메소드가 먼저 호출이 된다 BUT 전달되는 게 없어서 오류가 발생한다.
		
		
		// =====================
		System.out.println("--- Ambulance <--- Car <--- Ambulance ---");
		System.out.println("car2 type : " +  car2.type);
		Ambulance am2 = (Ambulance)car2; // Car 타입에 저장되었던 Ambulance
		am2.drive();
		am2.stop();
		am2.siren();
		
		
		
		// 자녀(하위)클랫스에 부모(상위)클래스를 저장
		System.out.println("--- Ambulance <---- Car ---");
		Car carTemp = new Car();
		carTemp.type = "일반자동차";
		// Ambulance am3 = (Ambulance) carTemp; // 강제적으로 형변환 해줘야 한다.
		// System.out.println("carTemp type : " + carTemp.type); 
		// (강제형변환) 상위타입 car type 자체를 하위타입 Ambulance로 넣는 게 문법적으로는 가능!
		// !!BUT!! 실제로 실행(run)해서 사용하는 시점에는 오류 발생 (ClassCastException)
		// Am <- car < Am(실제객체)
		// Am <- car <-FE // 
		// 하위타입 --> 상위타입으로 저장해서 사용할 수 있다.(형변환 해서)
	}

}
