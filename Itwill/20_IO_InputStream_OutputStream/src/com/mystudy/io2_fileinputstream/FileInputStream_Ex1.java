package com.mystudy.io2_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_Ex1 {

	public static void main(String[] args) throws IOException {
		System.out.println("==== main() 시작 ====");
		File file = new File("temp.txt");
		
		FileInputStream fis = null;
		try {
			// 파일로부터 읽기 위한 작업 진행
			// 1. 사용할 객체 생성
			fis = new FileInputStream(file);
			
			// 2. 객체 사용 작업 처리
			int readValue = fis.read();
			System.out.println("read() int값 : " + readValue);
			System.out.println("(char)read() : " + (char)readValue);
			//문자만 읽고 싶으면 char타입으로 변환하여 사용
			
			System.out.println("--- 전체 데이터 읽어서 화면출력 ---");
			while(true) {
				// EOF(End Of File) 를 만나면(=더이상 읽을 것이 없으면) -1 을 리턴!
				readValue = fis.read();
				if (readValue == -1) break; //파일의 끝(EOF)면 읽기 종료!
				System.out.println("read() int값 : " + readValue);
				System.out.println("(char)read() : " + (char)readValue);
			}
			
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("[예외발생]" + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 객체 사용 후 닫기(close)
			if (fis != null) {
				try {
					fis.close(); // 여기서 null point Exception이 발생함 그래서 위에 if문 fis != null 붙여줌
				} catch (IOException e) {}
				
			}
		}
		System.out.println("==== 끝 ====");
	}

}
