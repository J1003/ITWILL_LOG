package com.mystudy.arry.arry2_sort;

public class ArraySortSelection {

	public static void main(String[] args) {
		// 배열 숫자 데이터 정렬(Sort) - 오름차순(ASC)/내림차순(DESC)
		int[] num = {30, 20, 50, 40, 10};
		System.out.println("num : " + num);
	
		for (int i = 0; i <num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
		System.out.println();
		// 데이터 확인
		System.out.print("원본데이터(num) : " + " ");
		printData(num);
		
//		System.out.println("=== 정렬 시작 ====");
//		// 첫번째값(기준인덱스 0) vs 두번쨰값(인덱스 1)
//		if (num[0] > num[1]) {
//			int temp = num[0];
//			num[0] = num[1];
//			num[1] = temp;
//		}
//		printData(num); //<--데이터 확인
//		// 첫번째값(기준인덱스 0) vs 세번쨰값(인덱스 2)
//		if (num[0] > num[2]) {
//			int temp = num[0];
//			num[0] = num[2];
//			num[2] = temp;
//		}
//		printData(num);
//		// 첫번째값(기준인덱스 0) vs 네번쨰값(인덱스 3)
//		if (num[0] > num[3]) {
//			int temp = num[0];
//			num[0] = num[3];
//			num[3]= temp;
//		}
//		printData(num);
//		
//		// 첫번째값(기준인덱스 0) vs 다섯번쨰값(인덱스 4)
//		if (num[0] > num[4]) {
//			int temp = num[0];
//			num[0] = num[4];
//			num[4]= temp;
//		}
//		printData(num);
		
		
		
		
		
		//////반복문으로 만들기/////////////
//		System.out.println("---반복문으로 변경 및 적용---");
//		System.out.println("== 기준인덱스 : 0 ==");
//		System.out.print("배열데이터(num) : ");
//		//첫번째 값 기준 비교작업(인데스 0 기준)
//		for (int i = 1; i < num.length; i++)
//			if (num[0] > num[i]) {
//				int temp = num[0];
//				num[0] = num[i];
//				num[i] = temp;
//			}
//			printData(num);
//		
//		System.out.println("== 기준인덱스 : 1 ==");
//		System.out.print("배열데이터(num) : ");
//		//두번째 값 기준 비교작업(인데스 1 기준)
//		for (int i = 2; i < num.length; i++)
//				if (num[1] > num[i]) {
//					int temp = num[1];
//					num[1] = num[i];
//					num[i] = temp;
//				}
//			printData(num);
//		
//		System.out.println("== 기준인덱스 : 2 ==");
//		System.out.print("배열데이터(num) : ");
//		//두번째 값 기준 비교작업(인데스 2기준)
//		for (int i = 3; i < num.length; i++)
//				if (num[2] > num[i]) {
//					int temp = num[2];
//					num[2] = num[i];
//					num[i] = temp;
//				}
//			printData(num);
//		
//		
		System.out.println("=== 이중(중첩) for문으로 작성 ===");
		
		int lastIdx = num.length -1;
		for (int gijun = 0; gijun < lastIdx; gijun++) {
		System.out.print("배열데이터(num) : ");
		printData(num);
		
			for (int i = gijun + 1; i < num.length; i++)
				if (num[gijun] > num[i]) { //비교 후 교환
					int temp = num[gijun];
					num[gijun] = num[i];
					num[i] = temp;
				}
				//printData(num);
			}
		
		System.out.print("=== 정렬 후 데이터(num) ==== ");
		printData(num);
		}
		
		//결국은 이렇게 하면 된다................
//		int[] num = {30, 20, 50, 40, 10};
//	
//		Arrays.sort(num);
//	
//		for (int i = 0; i < num.length; i++) {
//		    System.out.print(num[i] + " ");
//		}
	
	///////////////////////////////////////////////////////
		static void printData(int[] num) {
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + " ");
			}
			System.out.println();
		

	
	}

}
