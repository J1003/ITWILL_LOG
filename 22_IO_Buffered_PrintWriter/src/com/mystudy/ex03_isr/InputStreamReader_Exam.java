package com.mystudy.ex03_isr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_Exam {

	public static void main(String[] args) {
		// InputStream ----> Reader
		// byte 처리 계열 ----> 문자(Character) 단위로 처리 계열 전환
		// InputStreamReader : InputStream ----> Reader 전환
		// OutputStreamWriter : OutputStream ----> Writer 전환 
		// --> (이거 잘 안 쓰임 printWriter 쓰면 돼)
		// ----------------------------------
		
		File file = new File("file/test_isr.txt");
		
		
		FileInputStream fis = null;
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		
		
		
		try {
			fis = new FileInputStream(file);
			
			
//			int readValue = fis.read();
//			System.out.println((char) readValue);
//			
//			readValue = fis.read(); // 1byte 읽기
//			System.out.println((char) readValue);
			
			// byte 단위 처리방식에서 문자단위 처리방식으로 전환(변경0
			isr = new InputStreamReader(fis);
			int readValue = isr.read(); 
			// 1문자 읽기! fis -> isr = inpuStreamReader로 바꾸면 문자단위처리가 가능.
			System.out.println((char) readValue);
			
			readValue = isr.read(); // 1문자 읽기
			System.out.println((char) readValue);
			
			//---------------
			// 버퍼기능 사용해서 문자기준으로 라인단위 읽기 처리할 수 있음!
			br = new BufferedReader(isr);
			String str = br.readLine();
			System.out.println("br.readLine() : " + str); // 읽은 값은 출력
			
			while (true) {
				str = br.readLine(); // EOF 만나면 null을 리턴!
				if (str == null) break; // str이 null이면 그만해라.
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
