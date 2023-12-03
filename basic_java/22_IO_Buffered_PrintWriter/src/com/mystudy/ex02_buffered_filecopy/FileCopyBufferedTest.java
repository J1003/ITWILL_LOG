package com.mystudy.ex02_buffered_filecopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyBufferedTest {

	public static void main(String[] args) {
		// BufferedInputStream, BufferdOutputStream 적용 (모든파일을 복사할 수 있음)
		// 파일복사(binary) : img104.jpg -> img104_copy.jpg
		// File --> FileInputStream --> BufferedInputStream
		// - 파일을 BufferedInputStream 파일리더객체에 주입하고 그걸 버퍼드리더객체에 주입
		
		File inputFile = new File("file/img104.jpg");
		File outputFile = new File("file/img104_copy.jpg");
		
		// 파일로부터 읽고, 쓰기 위한 객체(인스턴스)를 저장하기 위한 변수
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		// 버퍼(buffer) 사용을 위한 변수 선언
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			// 파일을 읽고, 쓰기 위한 객체 생성
			fis = new FileInputStream(inputFile);
			fos = new FileOutputStream(outputFile);
			
			System.out.println(">> 파일 복사 끝(버퍼없이) -----");
			long startTime = System.currentTimeMillis();
			
			// 파일복사(버퍼없이) : 바이트(byte) 단위 읽고, 쓰기
			int readValue = fis.read();
			while (readValue != -1) {
				fos.write(readValue);
				readValue = fis.read();
			}
			long endTime = System.currentTimeMillis();
			System.out.println(">> 파일 복사 끝(버퍼없이) -----");
			System.out.println("starTime : " + startTime);
			System.out.println("endTime : " + endTime);
			System.out.println("byte 복사시간 : " + (endTime - startTime + "(ms)"));
			
			// 한번 사용한 Stream은 재사용을 못 함!
			fis.close();
			fos.close();
			
			System.out.println("======================");
			// 버퍼 기능이 있는 클래스로 구현
			// File --> FileInputStream --> BufferedInputStream
			bis = new BufferedInputStream(new FileInputStream(inputFile), 100);
			// 굳이 별도로 () 안에 변수 만들어서 사용 안 해도 된다.
			
			// String --> FileOutputStream --> BufferedOuputStream
			bos = new BufferedOutputStream(
					new FileOutputStream("file/img104_copy.jpg"), 100);
			// 1바이트 쓰면 원래 값이랑 거의 비슷하게 출력된다. 
			// but 10,100바이트...이렇게 버퍼사이즈를 크게 하면 속도가 더 빨라진다.(속도개선효과)
			
			System.out.println(">> 파일 복사 시작 (버퍼사용) -----");
			startTime = System.currentTimeMillis();
			// 버퍼기능 사용 파일복사
			readValue = bis.read();
			while(readValue != -1) {
				bos.write(readValue);
				readValue = bis.read();
			}
			endTime = System.currentTimeMillis();
			System.out.println("============");
			System.out.println(">> 파일 복사 끝 (버퍼사용) -----");
			System.out.println("buffer 복사시간 : " + (endTime - startTime + "(ms)"));
			
			
			bos.close();
			bis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
				
		
	}

}
