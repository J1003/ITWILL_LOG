package com.mystudy.reader_writer_filecopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyCharacterExam {

	public static void main(String[] args) {
		// FileReader, FileWriter 사용해서 파일 복사
		// 원본파일 : file/test_char.txt
		// 대상파일 : file/test_char_copy.txt
		// 처리 : 원본파일에서 읽고, 대상파일에 쓰기/저장(문자단위 처리)
		// --------------------------------------------
		
		// 0. 사용할 파일(File) 객체 생성
		
		// 1. FileReader, FileWriter 객체를 생성
			  
		// 2. 원본파일에서 읽고, 대상파일에 쓰기 작업 반복
		//    FileReader로 읽고, FileWriter로 쓴다.
		
		// 3. 사용객체 닫기(close) 처리
		//-----------------------------------------------------
		
		//0. 사용할 파일(File) 객체 생성
		File fileIn = new File("file/test_char.txt");
		File fileOut = new File("file/test_char_copy.txt");
		
		//1-1. FileReader, FileWriter 객체를 저장할 변수 선언
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			//1-2. FileReader, FileWriter 객체를 생성
			//fr = new FileReader("file/test_char.txt");
			fr = new FileReader(fileIn);
			fw = new FileWriter(fileOut);
			
			//2. 반복작업(원본파일에서 읽고, 대상파일에 쓰기 반복)
			int readValue = fr.read();
			while (readValue != -1) {
				fw.write(readValue);
				System.out.print((char)readValue);
				readValue = fr.read();
			}
			
			fw.flush(); //버퍼에 있는 데이터를 강제 출력 처리
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 사용객체 닫기(close)
//			try {
//				if (fw != null) fw.close();
//			} catch (IOException e) {}
			try {
				if (fr != null) fr.close();
			} catch (IOException e) {}
		}
		
	}

}
