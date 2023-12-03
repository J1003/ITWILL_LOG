package com.mystudy.ex03_isr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_Exam {

	public static void main(String[] args) {
		// (실습) OutputStreamWriter 객체 생성해서 File에 텍스트 출력.
		// Hello Java! 안녕! <-- 이런 문자열 or H 이렇게 문자 하나 출력! 마음대로!
		
		File file = new File("file/test_osw.txt");
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		
		
		try {
			fos = new FileOutputStream(file);
			fos.write('A'); // 정상출력
			fos.write('대'); // 한글 정상 출력
			
			osw = new OutputStreamWriter(fos);
			osw.write("Hello~~\n");
			osw.write("안녕~~");
			
			osw.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (osw != null) osw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
