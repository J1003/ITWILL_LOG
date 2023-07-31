package com.mystudy.scanner6_bank;

import java.util.Scanner;

// 은행의 ATM
// 1.입금 2.출금 3.통장확인 	0.종료


/*
-------------------------
1.입금 2.출금 3.통장확인 	0.종료
-------------------------
> 작업선택 : 1
> 입금액 : 10000원

-------------------------
1.입금 2.출금 3.통장확인 	0.종료
-------------------------
> 작업선택 : 3
:: 통장금액 : 10000원

-------------------------
1.입금 2.출금 3.통장확인 	0.종료
-------------------------
> 작업선택 : 2
> 출금액 : 5000원

-------------------------
1.입금 2.출금 3.통장확인 	0.종료
-------------------------
> 작업선택 : 3
:: 통장금액 : 5000원

-------------------------
1.입금 2.출금 3.통장확인 	0.종료
-------------------------
> 작업선택 : 0
>> ATM 사용을 종료합니다.
*/

public class BankATM {
	
   private int money; // 통장계좌 금액

    public BankATM() {
        money = 0; // Initialize the account balance to 0
    }

    public void startBank() {
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("-------------------------");
            System.out.println("1.입금 2.출금 3.통장확인  0.종료");
            System.out.println("-------------------------");
            System.out.print("> 작업선택 : ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("> 입금액 : ");
                    int depositAmount = scan.nextInt();
                    deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("> 출금액 : ");
                    int withdrawAmount = scan.nextInt();
                    withdraw(withdrawAmount);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 0:
                    System.out.println(">> ATM 사용을 종료합니다.");
                    break;
                default:
                    System.out.println(">> 잘못된 입력입니다. 다시 선택하세요.");
            }
        } while (choice != 0);

        scan.close();
    }

    public void deposit(int amount) {
        if (amount > 0) {
            money += amount;
            System.out.println("입금액 : " + amount + "원");
        } else { 		//예외처리
            System.out.println(">> 유효하지 않은 금액입니다. 입금액은 0보다 커야 합니다.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= money) {
            money -= amount;
            System.out.println("출금액 : " + amount + "원");
        } else {
            System.out.println(">> 유효하지 않은 금액입니다. 출금액은 0보다 크고 통장 잔액 이내여야 합니다.");
        }
    }

    public void checkBalance() {
        System.out.println(":: 통장금액 : " + money + "원");
    }
    
    
    ////////////////////////////////////////////////
    //-----------     쌤 답변      -------------//////
    
    /*
	private int money; //통장계좌 금액
	private Scanner scan = new Scanner(System.in);

	public void startBank() {
		System.out.println(">>> 어서오세요(ATM 사용)");
		while (true) {
			int select = runningATM();
			if (select == 0) {
				break;
			}
		}
		System.out.println("\n>>> ATM 사용을 종료했습니다");
	}

	private int runningATM() {
		// 1. 메뉴표시
		showMenu();
		
		// 2. 메뉴선택		// try~catch(예외처리)
		int select = -1; //초기값 넣어주면 컴파일 오류 해결할 수 있음!
		try {
			select = scan.nextInt();
		} catch (NumberFormatException e) {
			System.out.println("[예외발생] 잘못된 값이 입력되었습니다. "
					+ "메뉴(0~3) 숫자만 입력하세요.");
		} finally {
			scan.nextLine(); // 줄바꿈 문자까지의 빈문자열("") 읽어서 처리(버림)
		}
		
		if (select == 0) {
			System.out.println("종료~~");
			return select;
		}
		
		// 3. 선택작업 처리
		if (select == 1) {
			//System.out.println("입금처리~~~");
			inputMoney();
		}
		if (select == 2) {
			System.out.println("출금처리~~~");
			outputMoney();
		}
		if (select == 3) {
			//System.out.println("통장확인~~~");
			showMoney();
		}
		if (select == 0) {
			System.out.println("종료~~");
		}
		
		return select;
	}
	
	
	private void outputMoney() {
		System.out.print(">출금액 : ");
		money -= Integer.parseInt(scan.nextLine());
	}

	private void showMoney() {
		System.out.println(":: 통장잔액 : " + money + " 원");
	}

	private void inputMoney() {
		while (true) {
		try {
			System.out.print(">입금액 : ");
			money += Integer.parseInt(scan.nextLine());
			break;
		} money (Exception e) {
			System.out.println("[예외발생] 잘못된 값이 입력되었습니다. "
					+ "숫자(0~9) 숫자만 입력하세요.");
		}
		}
	}

	private void showMenu() {
		System.out.println("------------------------------");
		System.out.println("1.입금  2.출금  3.통장확인   0.종료");
		System.out.println("------------------------------");
		System.out.print(">작업선택 : ");
	}

	*/
	
	
}



