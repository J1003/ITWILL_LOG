package com.mystudy.ex01_buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterExam {

	public static void main(String[] args) {
		// 버퍼(buffer) 기능이 구현되어 있는 클래스
		// 버퍼 : 데이터를 저장하는 공간(메모리상에)
		// 문자단위를 처리하는 BufferedReader, BufferedWriter
		// File -> FileReader -> BufferedReader 파일리더를 버퍼드리더에 주입시킴
		// ---------------------------------
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		
		
		try {
			// 파일로부터 읽기 위한 객체(인스턴스) 생성
			File inFile = new File("file/test_buf_rw_in.txt");
			fr = new FileReader(inFile);
			bufferedReader = new BufferedReader(fr); //버퍼기능 + 파일읽기 기능을 가지고 있음.
			
			// 파일에 쓰기 위한 객체 생성
			File outFile = new File("file/test_buf_rw_out.txt");
			fw = new FileWriter(outFile);
			bufferedWriter = new BufferedWriter(fw); //버퍼기능 + 파일쓰기 기능
			
			// 파일에 먼저 쓰기
			bufferedWriter.write("안녕하세요. 자바공부중입니다.");
			bufferedWriter.write("Hello Java!");
			bufferedWriter.newLine(); // 줄바꿈 처리
			bufferedWriter.write("재미있나요???");
			bufferedWriter.newLine();
			bufferedWriter.write("-------");
			bufferedWriter.newLine();
			
			bufferedWriter.flush();
			
			// 파일로부터 읽고, 파일에 쓰기(버퍼기능 이용해서)
			// 파일에서 읽기(한 번 읽기)
			String str = bufferedReader.readLine(); // 한 줄(라인) 읽기
			System.out.println("readLine() 읽은 값 : " + str);
			
			// 파일에 쓰기 (한 번 쓰기)
			bufferedWriter.write(str); // 문자열 출력
			bufferedWriter.newLine(); // 줄바꿈처리
			
			// 남은 데이터 모두 읽고 쓰기
			str = bufferedReader.readLine();// -> EOF(EndOfFile) : null 리턴
			while (str != null) {
				bufferedWriter.write(str); //문자열 출력
				str = bufferedReader.readLine();
				if (str != null) {
					bufferedWriter.newLine(); // 줄바꿈처리
				}
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null) bufferedReader.close();
			} catch (IOException e) {}
			try {
				if (bufferedWriter != null) bufferedWriter.close();
			} catch (IOException e) {}
		}
		
		System.out.println("---- main() 끝 ------");
		
	}

}
