package com.mystudy.reader_writer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_Exam2 {

	public static void main(String[] args) {
		// (실습) FileReader_Exam1 내용을 반복문으로 변경 처리

		File file = new File("file/test_char.txt");
		System.out.println("파일크기 : " + file.length());
		
		FileReader fr = null;
		
		try {
			//1. 객체(인스턴스) 생성
			fr = new FileReader(file);
			
			//2. 객체 사용 작업처리(1문자 읽고, 화면에 출력)
			int readChar = fr.read();
			while ((readChar = fr.read()) != -1) {
//				for (int i = 0; i < readChar; i++) {
					System.out.println("첫번째문자 : " + readChar
							+ ", char : " + (char)readChar);
			} 
			
//			// 쌤 답변
//			while (true) {
//				int readValue = fr.read();
//				if (readValue == -1) break;
//				//System.out.println(readValue + " : " + (char)readValue);
//				System.out.print((char)readValue);
//			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();	
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 사용객체 닫기(close)
			try {
				if (fr != null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
