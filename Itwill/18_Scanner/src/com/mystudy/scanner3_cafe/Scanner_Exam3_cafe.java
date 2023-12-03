package com.mystudy.scanner3_cafe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Scanner_Exam3_cafe {
	
	public static void main(String[] args) {
		// (실습) 카페 음료 주문 처리
		// 음료의 종류 : 
		// 1.아메리카노(3000)  2.카페라떼(3500)  3.카페모카(4000)  4.과일주스(5000)
		//-------------------------------------
		// 입력값 : 메뉴번호, 주문수량, 입금액(고객이 낸 돈)
		// 출력값 : 입금액, 판매액(단가 * 수량), 잔돈(입금액 - 판매액)
		//----------------------------------------
		
		/* 처음부터 while문 만들지 말고 안에꺼 먼저 만들어 보기!
		 
		while (true) { // 메뉴선택 0 선택시 종료
			 1. 아메리카노(3000) 2. 카페라떼(3500) 3. 카페모카(4000) 4.과일주스(5000)
			 > 메뉴를 선택하세요(1~4) : 1
			 > 주문수량 : 3
			 > 입금액 : 10000
			 ==================
			 입금액 : 10000원
			 판매액(단가*수량) : 9000원
			 잔액(잔돈) : 1000원 
		}	 
		 ================================================*/
	
		Scanner scan = new Scanner(System.in);	
		System.out.println("1. 아메리카노 2. 카페라떼 3. 카페모카 4. 과일주스");
			 // 문자열(String) 값 읽기.	
		System.out.print("menu : ");
//		String menu = scan.nextLine();
		String coffee = scan.nextLine();
		
		int ame = 3000;
		int latte = 3500;
		int mocca = 4000;
		int fruit = 5000;
		
		int coffeePrice = 0;
		
		if (coffee.equals("1")) {
		    coffeePrice = ame;
		   
		} else if (coffee.equals("2")) {
		    coffeePrice = latte;
		} else if (coffee.equals("3")) {
		    coffeePrice = mocca;
		} else if (coffee.equals("4")) {
		    coffeePrice = fruit;
		} else {
		    System.exit(0);
		} 
		
		System.out.print("주문수량 : ");
		int cnt = scan.nextInt();
		scan.nextLine();
		
		// 입금 판매 잔액
		System.out.print("입금액 : ");
		int pay = Integer.parseInt(scan.nextLine());
		System.out.println("입금액 : " + pay);
		
		// 판매액
		int sales = coffeePrice * cnt;
		System.out.println("판매액 : " + sales);

		// 잔돈
		int chg = pay - sales;
		System.out.println("잔돈 : " + chg);
		
		
		
		// ChatGPT 답변 <<< ------------------------------------
				System.out.println(" ㅡㅡㅡㅡㅡ> ChatGPT 답변 <ㅡㅡㅡㅡㅡㅡ");
		
		Scanner scanner = new Scanner(System.in);
        String[] menuNames = {"아메리카노", "카페라떼", "카페모카", "과일주스"};
        int[] prices = {3000, 3500, 4000, 5000};

        while (true) {
	        System.out.println("1. 아메리카노(3000원) 2. 카페라떼(3500원) 3. 카페모카(4000원) 4. 과일주스(5000원)");
	        System.out.print("> 메뉴를 선택하세요(1~4, 0 to exit): ");
	        int menuNumber = scanner.nextInt();
	
	        if (menuNumber == 0) {
	            System.out.println("주문 프로그램을 종료합니다.");
	            break;
	        } else if (menuNumber < 1 || menuNumber > 4) {
	            System.out.println("잘못된 메뉴 번호입니다. 다시 선택해주세요.");
	            continue;
	        }
	
	        System.out.print("> 주문수량: ");
	        int quantity = scanner.nextInt();
	
	        if (quantity <= 0) {
	            System.out.println("잘못된 수량입니다. 다시 입력해주세요.");
	            continue;
	        }
	
	        int price = prices[menuNumber - 1];
	        System.out.print("> 입금액: ");
	        int deposit = scanner.nextInt();
	
	        if (deposit < price * quantity) {
	            System.out.println("입금액이 부족합니다. 다시 입력해주세요.");
	            continue;
	        }
	
	        int total = price * quantity;
	        int change = deposit - total;
	
	        System.out.println("==================");
	        System.out.println("입금액: " + deposit + "원");
	        System.out.println("판매액(단가*수량): " + total + "원");
	        System.out.println("잔액(잔돈): " + change + "원");
        }

        scanner.close();
		System.out.println("-----------------"); 
		
		
	
		// 쌤 답변 <<< ------------------------------------
		System.out.println(" ㅡㅡㅡㅡㅡ> 쌤 답변 <ㅡㅡㅡㅡㅡㅡ");
		Scanner scan2 = new Scanner(System.in);
		final int AMERICANO = 3000;
		final int CAFE_LATTE = 3500;
		final int CAFE_MOCA = 4000;
		final int JUICE = 5000;
		int income = 0; // 오늘 판매한 합계 금액
		
		while (true) {
			System.out.println("1.아메리카노  2.카페라떼  3.카페모카  4.과일주스   0.종료");
			System.out.print("메뉴선택(1~4) : ");
			int select = scan2.nextInt();
			
			if (select == 0) {
				System.out.println(">>>> 영업을 종료합니다~~~");
				break;
			}
			
			System.out.print("> 수량입력 : ");
			int count = scan2.nextInt();
			
			
			System.out.print("> 입금액 : ");
			int inMoney = scan2.nextInt();
			
			// 계산처리 - if else 문 ==========
			int totMoney = 0;  //판매액 = 메뉴단가 * 수량
			/* 	
			if (select == 1) {
				totMoney = AMERICANO * count;
			} else if (select == 2) {
				totMoney = CAFE_LATTE * count;
			}
			*/
			// 계산처리 - switch() case 문 =========
			switch (select) {
				case 1 : totMoney = AMERICANO * count; break;
				case 2 : totMoney = CAFE_LATTE * count; break;
				case 3 : totMoney = CAFE_MOCA * count; break;
				case 4 : totMoney = JUICE * count; break;
			}
			System.out.println("판매액 : " + totMoney);
			
			// 잔액 계산
			int change = inMoney - totMoney;
			income += totMoney; // 총 매출액 구하기
			
			// 출력
			System.out.println("=========");
			System.out.println("입금액 : " + inMoney);
			System.out.println("판매액 : " + totMoney);
			System.out.println("잔액 : " + change);
			System.out.println("잔액(거스름돈) : " + change);
			System.out.println();
			
		// -------------------------------------------------
			
		// 친구 답변
			
/*			
		HashMap<String, Integer> menu = new HashMap<>();
		
		menu.put("1.아메리카노", 3000);
		menu.put("2.카페라떼", 3500);
		menu.put("3.카페모카", 4000);
		menu.put("4.과일주스", 5000);

	 	while (true) {
		 	Scanner sc = new Scanner(System.in);
		 	System.out.print("메뉴를 선택하세요(1~4) : ");
		 	int menu = Integer.parseInt(sc.nextLine());
		 	if(menu == 0) {
			 	System.out.println("주문을 종료합니다.")
			 	break;
		 	} else {
		 	cafe.get(menu);
		 		System.out.print("주문수량 : ");
		 	int num = sc.nextInt();
		 		System.out.print("입금액 : ");
	 		int pay = sc.nextInt();
	 		sc.nextLine();
	 		if (pay <cafe.get(menu) * num) {
	 			System.out.print("금액이 부족합니다.");
	 			break;
	 			} else {
	 				System.out.print(
	 						"입금액 : " + pay + "\n판매액 : " + cafe.get(menu) * num + "\n잔돈 : " + (pay - cafe.get(menu) * num));
	 	
 	
 	
 */
	
		}
	}
}
