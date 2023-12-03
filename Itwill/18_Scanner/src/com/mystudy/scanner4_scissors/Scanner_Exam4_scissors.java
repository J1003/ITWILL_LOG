package com.mystudy.scanner4_scissors;

import java.util.Scanner;

public class Scanner_Exam4_scissors {

	public static void main(String[] args) {
		/* Scanner를 이용한 가위, 바위 , 보 게임 *******
		// scissors, rock, paper
		// draw : 무승부, person_win, computer_win
		컴퓨터와 함께하는 가위,바위,보 게임
		0. 컴퓨터가 가위(1),바위(2),보(3) 선택(Math.random())
		1. 1.가위   2.바위   3.보   0.종료   선택 메뉴 출력 
		2. 선택값 입력
		3. 결과 비교 후 승자, 패자 결정
		(반복) 게임 반복 진행 - 0 선택시 종료 처리
		=============================== */
		
		Scanner scan = new Scanner(System.in);	
		
		while (true) {
            System.out.println("1.가위   2.바위   3.보   0.종료");
            System.out.print("가위~바위~보! 선택 : ");
            int choice = scan.nextInt();
            scan.nextLine(); // 개행 문자 제거

            String[] game = {"가위", "바위", "보"};
            String myChoice = game[choice - 1];

            if (choice == 0) {
                System.out.println("게임을 종료");
                break;
            }
            System.out.println("나의 선택 : " + myChoice);

            int random = (int)(Math.random() * 3);
            System.out.println("컴퓨터 선택 : " + game[random]);

            if (myChoice.equals(game[random])) {
                System.out.println("무승부!");
            } else if (
                (myChoice.equals("가위") && game[random].equals("보")) ||
                (myChoice.equals("바위") && game[random].equals("가위")) ||
                (myChoice.equals("보") && game[random].equals("바위"))) {
                System.out.println("사용자 승리!");
            } else {
                System.out.println("컴퓨터 승리!");
            }
            System.out.println("=================");
		}
	 }
}
