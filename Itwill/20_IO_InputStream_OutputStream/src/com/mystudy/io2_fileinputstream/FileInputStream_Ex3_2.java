package com.mystudy.io2_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStream_Ex3_2 {

	public static void main(String[] args) throws IOException {
		//(실습) Ex3_1 파일을 반복문으로 변경
		
		// 0. 사용할 파일객체 생성
		
		// 1. 파일을 읽어서 작업할 객체 생성(FileInputStream)
		//	  (한바이트씩 읽어서 해보고 그 다음 배열 만들어서 해보기)
		
		// 2. 객체 사용 파일데이터 읽어서 화면 출력
		// 	  (byte[] 사용 후, 반복처리)
		
		// 3. 객체 닫기(close)
//		---------------------------------------------
		
		FileInputStream fis = null;
		try {
			//0. 사용할 파일객체 생성
			File file = new File("file/test01.txt");
			
			//1. 파일을 읽어서 작업할 객체 생성(FileInputStream)
			fis = new FileInputStream(file);
			
			//2. 객체 사용 파일데이터 읽어서 화면 출력
			//   (byte[] 사용, 반복문으로 반복처리)
			byte[] bytes = new byte[10];
			//System.out.println("bytes : " + Arrays.toString(bytes));
			
			int readCnt; 
			/*
			while (true) {
				readCnt = fis.read(bytes);
				if (readCnt == -1) break; //작업종료
				//System.out.println("readCnt : " + readCnt);
				//System.out.println("bytes : " + Arrays.toString(bytes));
				for (int i = 0; i < readCnt; i++) {
					System.out.print((char)bytes[i]);
				}
			}
			*/
			while ((readCnt = fis.read(bytes)) != -1) {
				//System.out.println("readCnt : " + readCnt);
				//System.out.println("bytes : " + Arrays.toString(bytes));
				for (int i = 0; i < readCnt; i++) {
					System.out.print((char)bytes[i]);
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 객체 닫기(close)
			try {
				if (fis != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
	
	}

}
