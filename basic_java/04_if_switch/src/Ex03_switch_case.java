
public class Ex03_switch_case {

	public static void main(String[] args) {
		// switch case문 : 동등비교구문! (크다, 작다 비교 X)
		/*
		switch (조건값) {
		case 비교값1 : 
			실행할 문장(들);
			break;
		case 비교값2 :
			실행할 문장(들);
			break;
		...
		default : 				// "이것도 저것도 아닐 때"를 의미
			실행할 문장(들);
			break;
		}
		
		 // default 구문에 break가 없으면 흘러내림 (헷갈릴 수 있으니 그냥 작성해라!)
		 ---------------------------*/
		
		int month = 7;
		
		switch (month) {
		case 1 : 
			System.out.println("31일까지 있습니다.");
			break;
		case 2 :
			System.out.println("28일 또는 29일까지 있습니다.");
			break;
		case 3 :
			System.out.println("31일까지 있습니다.");
			break;
		case 4 :
			System.out.println("30일까지 있습니다.");
			break;
		default : 
			System.out.println("일치하는 값이 없습니다.");
			break;
		}
		
		System.out.println("----------------");
		
		switch (month) {
		case 1 : 
		case 3 :
		case 5 :
		case 7 : case 8: case 10: case 12:
			System.out.println("31일까지 있습니다.");
			break;
		case 2 :
			System.out.println("28일 또는 29일까지 있습니다.");
			break;
		case 4 : case 6: case 9: case 11:
			System.out.println("30일까지 있습니다.");
			break;
		}
		System.out.println("================");
		
		
		/* [실습] 추첨 결과에 따라서 상품 지급
		1등: 냉장고, 2등: 김치냉장고, 3등: 세탁기, 4등: 청소기
		등수 안에 없으면(꽝인 경우) : 휴지
		추첨 결과 당첨상품 출력하시오
		출력예시 ) 당첨상품 : 냉장고
		----------------- */

		// 당첨여부 확인
		String result = "1등"; //추첨결과
		String resulMsg = "상품없음";
		
		switch (result) {
		case "1등" :
			System.out.println("당첨상품 : 냉장고");
			break;
		case "2등" :
			System.out.println("당첨상품 : 김치냉장고");
			break;
		case "3등" :
			System.out.println("당첨상품 : 세탁기");
			break;
		case "4등" :
			System.out.println("당첨상품 : 청소기");
			break;
		default :
			System.out.println("당첨상품 : 휴지");
		}
		
		// 당첨여부 확인
		String result1 = "1등"; //추첨결과
		String resulMsg1 = "상품없음";
		
		switch (result1) {
		case "1등" :
			resulMsg1 = "냉장고";
			break;
		case "2등" :
			resulMsg1 = "김치냉장고";
			break;
		case "3등" :
			resulMsg1 = "세탁기";
			break;
		case "4등" :
			resulMsg1 = "청소기";
			break;
		default :
			resulMsg1 = "상품없음";
			break;
		}
		
		//
		String result2 = "1등"; //추첨결과
		String resulMsg2 = "상품없음";
		
		switch (result2) {
		case "1등" :
			resulMsg2 += "냉장고";
			break;
		case "2등" :
			resulMsg2 += "김치냉장고";
			break;
		case "3등" :
			resulMsg2 += "세탁기";
			break;
		case "4등" :
			resulMsg2 += "청소기";
			break;
		default :
			resulMsg2 += "상품없음";
			break;
		}
	}	
}

	
