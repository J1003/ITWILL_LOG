
public class Ex09_for_gugudan2 {

	public static void main(String[] args) {
		/* 구구단 2~9단 출력
		2*1=2	3*1=3	...	9*1=9
		2*2=4 	3*2=6	...	9*2=18
		2*3=6	3*3=9	...	9*3=27
		...	
		2*9=18 	3*9=27	...	9*9=81
		============================*/
		System.out.println("*" + " " + "*" + " " + "*");
		System.out.println("*" + "\t"+ "*" + "\t"+ "*");
		System.out.println("2*1" + "\t"+ "3*1=3" + "\t"+ "*");
		System.out.println("----------------");
		
		
		/*System.out.println("2*" + 1 + "=" + (2*1));
		System.out.println("2*" + 2 + "=" + (2*2));
		System.out.println("2*" + 3 + "=" + (2*3));
		System.out.println("2*" + 4 + "=" + (2*4));
		System.out.println("-------------------");
		*/
		////////// 첫번째 도오오오전 //////////////
		
		
		
		System.out.print("2*1" + "=" + 2*1 + "\t");
		System.out.print("3*1" + "=" + 3*1 + "\t");
		System.out.print("4*1" + "=" + 4*1 + "\t");
		System.out.print("5*1" + "=" + 5*1 + "\t");
		
		
		System.out.println();
		System.out.println("---------");
		
		int b = 2;
		for (int i5 = 1; i5 < 9; i5++) {
			System.out.print(b + "*1" + "=" + (b*1) +"\t");
			b++;
		}
		System.out.println();
		
		b = 2;
		for (int i5 = 1; i5 < 9; i5++) {
			System.out.print(b + "*2" + "=" + (b*2) + "\t");
			b++;
		}
		System.out.println();
		System.out.println("=============3번째================");
		
		int f = 1;
		int b1 = 2;
		for (int jul = 1; jul <= 9; jul++) {
			for (int i5 = 1; i5 < 9; i5++) {
			System.out.print(b1 + "*" + f + "=" + (b1*f) +"\t");
			b1++;
		}
		System.out.println();
		f++;
		b1 =2;
		}
		
		System.out.println();
		System.out.println("---------");
		
		
		
		System.out.print("2*1" + "=" + 2*1 + "\t");
		System.out.print("3*1" + "=" + 3*1 + "\t");
		System.out.print("4*1" + "=" + 4*1 + "\t");
		System.out.print("5*1" + "=" + 5*1 + "\t");
		System.out.print("6*1" + "=" + 6*1 + "\t");
		System.out.print("7*1" + "=" + 7*1 + "\t");
		System.out.print("8*1" + "=" + 8*1 + "\t");
		System.out.print("9*1" + "=" + 9*1 + "\t");
		System.out.println();
		System.out.print("2*2" + "=" + 2*2 + "\t");
		System.out.print("3*2" + "=" + 3*2 + "\t");
		System.out.print("4*2" + "=" + 4*2 + "\t");
		System.out.print("5*2" + "=" + 5*2 + "\t");
		System.out.print("6*2" + "=" + 6*2 + "\t");
		System.out.print("7*2" + "=" + 7*2 + "\t");
		System.out.print("8*2" + "=" + 8*2 + "\t");
		System.out.print("9*2" + "=" + 9*2 + "\t");
		System.out.println();
		System.out.print("2*3" + "=" + 2*3 + "\t");
		System.out.print("3*3" + "=" + 3*3 + "\t");
		System.out.print("4*3" + "=" + 4*3 + "\t");
		System.out.print("5*3" + "=" + 5*3 + "\t");
		System.out.print("6*3" + "=" + 6*3 + "\t");
		System.out.print("7*3" + "=" + 7*3 + "\t");
		System.out.print("8*3" + "=" + 8*3 + "\t");
		System.out.print("9*3" + "=" + 9*3 + "\t");
		
		System.out.println();
		System.out.println("----------------");
		
		//////////////////두번째 도오오오전///////////////////////
		int num = 2;
		
		for (int i = 1; i < 9; i++) {
			System.out.print(num + "*1" + "=" + num*1 + "\t");
			num++;
		}
		System.out.println();
		num = 2;
		
		for (int i = 1; i < 9; i++) {
			System.out.print(num + "*2" + "=" + num*2 + "\t");
			num++;
		}
		System.out.println();
		num = 2;
		
		for (int i = 1; i < 9; i++) {
			System.out.print(num + "*3" + "=" + num*3 + "\t");
			num++;
		}
		
		System.out.println();
		System.out.println("------마지막 도오오오전------");
		///////////////////마지막 도오오오전/////////////////////////////////
		int num1 = 2;
		int cnt = 1;
		for (int line = 1; line <= 9; line++) {
			for (int i = 1; i < 9; i++) {
				System.out.print(num1 + "*" + cnt + "=" + (num1*cnt) + "\t");
				num1++;
			}
			System.out.println();
			num1 = 2;
			cnt++;
		}
		//////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("----------------");
		for (int i = 1; i <= 9; i++) {
			System.out.print("2*" + i + "=" + 2*i + "\t");
			System.out.print("3*" + i + "=" + 3*i + "\t");
		}
		System.out.println();
		///////////////////선생님 답변///////////////////////////
		System.out.println("=====선생님 답변========");
		//-----------------
		for(int i = 1; i <= 9; i++) {
			for (int dan = 2; dan <= 9; dan++) {
			System.out.print(dan + "*" + i + "=" + (dan * i) + "\t");
			}
			System.out.println();
			}
		System.out.println("=====선생님 답변2=====");
		System.out.print(2 + "*" + 1 + "=" + (2 * 1) + "\t");
		System.out.print(3 + "*" + 1 + "=" + (3 * 1) + "\t");
		System.out.print(4 + "*" + 1 + "=" + (4 * 1) + "\t");
		System.out.println();
		System.out.println("----------");
		//////////////////////////////////////////////////////
		for (int dan = 2; dan <= 9; dan++) {
			System.out.print(dan + "*" + 1 + "=" + (dan * 1) + "\t");
		}
		System.out.println();
		
		for (int dan = 2; dan <= 9; dan++) {
			System.out.print(dan + "*" + 2 + "=" + (dan * 2) + "\t");
		}
		System.out.println();
		System.out.println("----------");
		////////////////////////////////////////////
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");
			}
			System.out.println();
		
		}
	}
}
