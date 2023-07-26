package com.mystudy.string;

public class Ex03_StringExam {

	public static void main(String[] args) {
		//String str = "901012-1234567"; //주민번호
		//1. 전체자리수 14개 여부확인, '-'위치: 7번째 여부 확인
		//2. 생년월일 출력(1-2:년도, 3-4:월, 5-6:일)
		//   예) 90년 10월 12일 또는 1990년 10월 12일
		//3. 성별 확인하고 출력(1,3: 남성, 2,4: 여성)
		
		// Integer.parseInt
		// - String을 int로 변환하는 정적 메서드
		// - Integer 클래스에 속해 있으며, 문자열을 정수로 변환하는데 사용된다.
		//문자열을 숫자열로 바꾸는 게 키포인트다
		//4. 데이터 값 검증(월: 1~12, 일: 1~31)
		//참고) int num = Integer.parseInt("10"); //"10" -> 10
		//---------------------------------------------------
		
		// '-' = -가 위치한 인덱스 번호.
		
		System.out.println("=== 문제1번 ===");
		//			  012345678910123
		String str = "901012-1234567";
		System.out.println(str);
								  // == 두번 쓰는 거 진짜 주의해라!
		if (str.length() == 14) { // str.length()는 변수가 아닌 메소드를 호출해서 나오는 리턴값이다.
			System.out.println(str.charAt(6));
		}
		

		System.out.println("=== 문제2번 ===");
//		String str1 = "901012";
//		str = str.replace("90", "90년").replace("10", "10월").replace("12", "12일");
//		System.out.println(str);
		
		String str1 = "901012";
		System.out.println(str.charAt(0) + "" + str.charAt(1) + "년"
						   + str.charAt(2) + "" + str.charAt(3) + "월"
						   + str.charAt(4) + "" + str.charAt(5) + "일");
		
		
		System.out.println();
		System.out.println("==== 문제3번 =====");
		
		if (str.charAt(7)==1 && str.charAt(9)==3) {
			System.out.println("남성");
		} else {
			System.out.println("여성");
		}
		
		System.out.println();
		System.out.println("==== 문제4번 =====");
		//int num = Integer.parseInt("10"); //"10" -> 10 이걸 써라 바보야/.
		
		int wall = Integer.parseInt(str.substring(2,4)); //4번 전까지 출력!!!!
		System.out.println(wall);
		System.out.println(wall <= 12 && wall >= 1);
		
		int ill = Integer.parseInt(str.substring(4,6)); //
		System.out.println(ill);
		System.out.println(ill <= 31 && ill >= 1);
		
		
		
		
		//// [선생님 답변] ////
		System.out.println();
		System.out.println("//// [선생님 답변] ////");
		
		
//		1. 전체자리수 14개 여부확인, '-'위치 : 7번째 여부 확인
		System.out.println();
		  if (str.length() == 14){
				System.out.println("[정상] 전체길이 14자리");
		} else {
			System.out.println("[비정상] 전체길이 " + str.length());
		}
		
//		1-1. '-'위치 : 7번째 위치
		System.out.println(str.substring(6, 7)); //substring - 부분 문자열
												//--> substring보다 charAt이 훨 편함.
//		if(str.substring(6,7).equals('-'){
//			System.out.println("[정상] 7번째 문자 '-'");
//		} else {
//			System.out.println("[비정상] 7번째 문자 " + str.substring(6, 7));
//		}
		
//		1-1. ==== 다른 방법 [7번째 문자가 '-'가 아닌 경우] ===== 
		
		if ("-".equals(str.substring(6,7))) {
		System.out.println("[정상] 7번째 문자 '-'");
		} else {
		System.out.println("[비정상] 7번째 문자 " + str.substring(6, 7));
		}
		
//		1-1. === 다른 방법 [7번째 문자가 '-' 문자가 아니냐?] ===
		if (!"-".equals(str.substring(6,7))) {
			System.out.println("[비정상2] 7번째 문자 " + str.substring(6,7));
		}
		
		System.out.println("str.indexOf('-') : " + str.indexOf('-')); // indexOf 최종적인 위치값을 찾을 때 쓴다.
		if (str.indexOf('-') != 6) { 		// 6이 아니냐? 같지 않냐?
			System.out.println("[비정상3] '-' 문장 위치가 7번째가 아님");  
		}
		
//		1-1. === 다른 방법 [charAt으로 출력하기]!!!!
		 System.out.println("str.charAt(6) : " + str.charAt(6));
		 if(str.charAt(6) != '-') {
			 System.out.println("[비정상5] 7번째 문자 '-' 아님 : " + str.charAt(6));
		 }
		
		
		/// 2. 생년월일 출력 ========== ///
		String yymmdd = str.substring(0, 6);
		System.out.println("yymmdd : " + yymmdd);
		
		String yy = str.substring(0, 2);
		String mm = str.substring(2, 4);
		String dd = str.substring(4, 6);
		System.out.println(yy + "년" + mm + "월" + dd + "일");
		
		
		char charFlag = str.charAt(7); 
		String yyyy = "";
		if (charFlag == '1' || charFlag == '2') { //  || <-- 또는
			//System.out.println("19" + yy + "년" + mm + "월" + dd + "일");
			yyyy = "19" + yy;
		} else if (charFlag == '3' || charFlag == '4') {
			//System.out.println("20" + yy + "년" + mm + "월" + dd + "일");
			yyyy = "20" + yy;
		}
		
		 //문자열 비교는 == 이퀄 부호 쓰지 말자!!
		String flag = str.substring(7, 8);
		System.out.println("flag : " + flag);
		yyyy = "설정없음";
		if("1" == flag || "2" == flag) {    // flag는 2가 저장되어 있는 객체랑 substring(7,8)여기서 만들어지는 거랑 다름! String에 저장되어 있는 객체임. 똑같은 String이지만 새로 만들어지는 객체이기 때문에 서로 다른 객체다!! 주소값이 다름. 저장되어 있는 값만 같음!!
			yyyy = "19" + yy;
		} else if ("3".equals(flag) || "4".equals(flag)) {
			yyyy = "20" + yy;
		}
		System.out.println(yyyy + "년" + mm + "월" + dd + "일");
		
		///////////////////////////////////////
		
		System.out.println("3. 성별확인 ======");
		// 3. 성별 확인하고 출력 (1,3: 남성, 2,4: 여성)
		//char 타입이라 == 이퀄부호 써도 돼.
		char gender = str.charAt(7);
		if (gender =='1' || gender == '3') {
			System.out.println("주민번호 뒷자리(첫글자) : " + gender + "(남성)");
		} else if (gender == '2' || gender == '4') {
			System.out.println("주민번호 뒷자리(첫글자) : " + gender + "(여성)");
		} else {
			System.out.println("주민번호 뒷자리(첫글자) : " + gender + "(외국인)");
		}
		
		//// switch case 문
		
		switch (gender) {
		case '1' :  
		case '3' : 
			System.out.println("주민번호 뒷자리(첫글자) : " + gender + "(남성)");
			break;
		case '2' : case '4' :  // case문 옆으로 나열도 가능
			System.out.println("주민번호 뒷자리(첫글자) : " + gender + "(여성)");
			break;
		default :
			System.out.println("주민번호 뒷자리(첫글자) : " + gender + "(외국인)");
		}
		
		
		// 4. 데이터값 검증
		System.out.println("4. 데이터 값 검증 ======");
		//int num = Integer.parseInt("10"); //"10" -> 10
		
		
		str = "951012=1234567";
		String sMonth = str.substring(2, 4); // sMonth --> string타입의 month
		int month = Integer.parseInt(sMonth);
		// int month = Integer.parseInt("ABC") -> ABC는 숫자 형식이 아니라서 안 된다.
		// 부등호는 string과 string 비교처리가 안 된다. 그래서 숫자 타입으로 형변환 해야함.
		//if (sMonth >= 1 && sMonth <= 12) 이거는 안 되지만 위에 처리해줘서 아래 처럼 가능!
		if (month >= 1 && month <= 12) { 
			System.out.println("[정상] 월 데이터 정상(1~12)");	
		} else {
			System.out.println("[비정상] 월 데이터 : " + sMonth);
		}
		if (month < 1 || month > 12) {
			System.out.println("[비정상2] 월 데이터 1~12가 아님");
		}
		
		// 일자 데이터 확인(1~31 범위 내에 있는지만 확인)
		int date = Integer.parseInt(str.substring(4, 6));
		if (date >= 1 && date <= 31) {
			System.out.println("[정상] 일자 데이터 정상 (1~31)");
		} else {
			System.out.println("[비정상] 일자 데이터가 1~31 아님 - " + date);
		}
		
	}

}
