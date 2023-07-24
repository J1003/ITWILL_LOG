package com.mystudy.set1_hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HashSet_Lotto {

	public static void main(String[] args) {
		// Set 을 이용한 로또번호 만들기 : 1~45 랜덤숫자 6개를 Set에 저장
		// 1. 로또번호 6개를 추첨해서 Set에 저장하고 화면 출력
		//	  Math.randm() : 0.0 ~ 0.9999999.. 실수형 데이터 생성
		// 	  Math.random() 사용 : (int)(Math.random() * 45 + 1)
		// 2. 출력은 작은 숫자부터 큰 숫자 형태로 출력
		// 	  ex) 금주의 로또번호 :  5, 8, 10. 25, 33, 41
		
		//	------>> Set으로 다 해보면 List로도 해보기!<<---------
		
		//HashSet<Integer> set = new HashSet<Integer>();
		// 뒷부분 <> 안에 Integer 생략 가능
		HashSet<Integer> set = new HashSet<>();
		
//		set.add((int)(Math.random() * 45 + 1));

		while (set.size() < 6) {
	            int randomNumber = (int)(Math.random() * 45 + 1);
	            set.add(randomNumber);
	        }
		 System.out.print("로또번호: ");
		 	for (int number : set) {
		 		System.out.print(number + " ");
	 	}
		
	 	List<Integer> jungryul = new ArrayList<>(set);
	 	
	 	
	 	// 쎔 답변 ---------------------------
	 	System.out.println();
	 	System.out.println("=== 쌤 답변 ===========");

//	 	HashSet<Integer> set = new HashSet<>();
		
		for (; set.size() < 6;) { 	//--> 6개가 될 때까지
			int ranNum = (int)(Math.random() * 45 + 1);
			System.out.println("로또번호 : " + ranNum);
			set.add(ranNum);
		}
		System.out.println("로또번호 : " + set);
		System.out.println("----------------------");
		set.clear(); // <--- 로또추첨하는데 굳이 for문 쓸 필요 없다. 데이터 다 지우기.
		
		while (set.size() < 6) {   // 6개가 될 때까지
			set.add((int)(Math.random() * 45 + 1));
		}
		System.out.println("로또번호 : " + set);
		
		System.out.println("===== 오름차순 정렬 =====");
		
		//Collections.sort(set); // sort 메소드에는 list만 쓸 수 있다. set 못 써!!
		ArrayList<Integer> lottoList = new ArrayList<Integer>(set);
		System.out.println("정렬전 lottolist : " + lottoList);
		
		Collections.sort(lottoList);
		System.out.println("정렬후 lottoList : " + lottoList);
		
		System.out.println("== 금주의 로또번호 발표 ===");
		System.out.println("금주의 로또번호 : ");
		boolean isFirst = true;
		for (Integer num : lottoList) {
			if (isFirst) {
				System.out.println(num);
				isFirst = false;
			} else {
				System.out.println(", " + num);
			}
		}
		
		
		
//		System.out.println("== 오름차순 정렬 ===");
//		//로또번호 오름차순 정렬
//		Arrays.sort(lottoNums); 
//		System.out.println("lottoNums : " + Arrays.toString(lottoNums));
		
	}

}
