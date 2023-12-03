package com.mystudy.io1_file;

import java.io.File;

public class FileExam1 {
	

	public static void main(String[] args) {
		// File 클래스
		String seperator = File.separator; // File.separator - 파일경로 구분자, 속성 이름
		// C:\MyStudy\10_Java
		System.out.println("File.seperator : " + seperator);
		
		char separatorChar = File.separatorChar;
		System.out.println("File.seperatorChar : " + separatorChar);
		
		String pathSeparator = File.pathSeparator;
		System.out.println("File.seperatorChar : " + separatorChar);
		System.out.println("----------------");
		
		File[] listRoots = File.listRoots(); // 리턴해주는 게 File타입의 배열
		for (File file : listRoots) {
			System.out.println(file);
		}
		
	}
}
