package com.mystudy.scanner5_guess;

import java.util.Scanner;

public class GuessNumberGame {
	/* 숫자 추측 게임
	컴퓨터가 1~100 사이의 숫자를 정하면 사람이 맞추는 게임
	선택 기회 5회
	---------------------
	Math.random() : 0 <= random값 < 1 범위의 실수값 
	컴숫자 : 70 인 경우 
	  사람이 선택한 숫자(80)가 크면 : 생각한 숫자보다 작다는 메시지 출력
	  사람이 선택한 숫자(50)가 작으면 : 생각한 숫자보다 크다는 메시지 출력
	5번 이내에 맞추면 : 성공!!! n번 만에 맞췄습니다.(화면출력)
	5번을 넘기면 : 실패~~ 내가 생각한 숫자는 70입니다.(화면출력)
	-----
	다시 도전하시겠습니까?(y,n) 
	---------------------------
	*/
	public void startGame() {
	Scanner scan = new Scanner(System.in);
	
	
	while (true) {
		
		int random = (int)(Math.random() * 100 + 1);
		System.out.println("컴퓨터 선택 : ");
		
		System.out.println("숫자를 입력하세요 : ");
		int my = scan.nextInt();
		
		int cycle = 4;
		for (int i = 1; i < 6; i++) {
			
			if (i == 5) {
				System.out.println("기회는 단" + i + "번 넌 탈락!ㅎㅎ"); 
				break;
			}
			if (my < random) {
				System.out.println("땡입니다. 생각한 숫자보다 크다!!! ");	
			}
			if (my > random) {
				System.out.println("땡 틀렸어! 생각한 숫자보다 작아!!!");
			}
			if (my == random) {
				System.out.println("츄카츄카츄!!! Hoxy 천재?" + i + "번만에 맞췄어!!"); 
				break;
			} 
		cycle--;
		System.out.println("정답 쓰세용 : ");
		my = scan.nextInt();
		}
		System.out.println("5번 이내에 맞추면 " );
		
		System.out.println("다시 도전하시겠습니까? (Y/N) : ");
		scan.nextLine(); 
		//.nextLine()은 입력을 하기 위해서 쓰는 게 아니라, .nextInt 다음에 쓰는 거라고 했음.
		String yOrN = scan.nextLine();
        
        
        if (yOrN.equalsIgnoreCase("Y")){
        	// The game will continue since the loop will repeat
        } else {
	        System.out.println("게임 종료 빠이ㅣㅣㅣㅣ");
	        scan.close();
	        break;
		}
        
        
	}
	}
}
