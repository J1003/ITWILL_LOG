package com.mystudy.io3_fileoutputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputSTream_Exam {

	public static void main(String[] args) {
		// FileOutputStream : byte 단위로 파일에 저장(출력, 쓰기)
		File file = new File("file/test_out_01.txt");
		
		
		//변수를 바깥쪽에 선언하는 이휴는 finally문에서 처리를 못하기 때문에 바깥쪽에 선언해줌
		FileOutputStream fos = null; 
		try {
			// 1. 사용할 객체(인스턴스) 생성
			fos = new FileOutputStream(file); // 새로 작성(내용 삭제 후 쓰기)
			//fos = new FileOutputStream(file, true); // append모드(내용추가모드)
			
			//2. 객체 사용해서 작업처리
			fos.write('H');
			fos.write('E');
			fos.write('L');
			fos.write('L');
			fos.write('O');
			
			byte[] bytes = "Hello Java!".getBytes(); //byte배열에 담아서 리턴
			System.out.println("bytes : " + Arrays.toString(bytes));
			
			fos.write(bytes);
			fos.write('\n'); // \n : 줄바꿈 제어문자
			
//          시작위치,  사용갯수
			//write(byte[] b, int off, int len) 
			fos.write(bytes, 0, bytes.length);
			fos.write('\n');
				
			fos.write(bytes, 6, 4); //6번 인덱스에서부터 4개 사용
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 사용객체 닫기(close)
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {}
			}
		}
		
		

	}

}
