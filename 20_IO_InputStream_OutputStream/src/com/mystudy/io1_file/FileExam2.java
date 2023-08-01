package com.mystudy.io1_file;

import java.io.File;
import java.io.IOException;

public class FileExam2 {
	public static void main(String[] args) throws IOException {
			// File 객체 생성은 파일의 존재여부와 관계없이 객체 생성 가능
			// 파일명 : temp.txt - 파일명.확장자(명)
			File file1 = new File("temp.txt"); // ./temp.txt // 파일의 구분.확장자명
			// File 객체 생성은 파일의 존재여부와 관계없이 객체 생성이 가능!
			System.out.println("file1 : " + file1);
			
			// 상대경로 방식(. : 현재위치, .. : 상위디렉토리(폴더))
			// 현재위치에 따라서 경로가 다르게 변함
			File file2 = new File("./file/temp.txt");
			System.out.println("file2 : " + file2);
			
			// 절대주소방식 : Root 디렉토리로 부터 전체 경로를 표시(위치 불변)
			File file3 = new File("c:\\temp\\aaa\\temp.txt");
//			역슬래쉬 : 단순\(역슬래쉬)문자로 쓰려면 \\ 이렇게 하나 더 붙여준다.
//			원래는 경로명을 추출하면 c:\temp\aaa\temp.txt 이렇게 나온다.
			System.out.println("file3 : " + file3);
			
			
			System.out.println("---- getAbsolutePath() : 절대경로명 ------");
			System.out.println("절대경로 file1 : " + file1.getAbsolutePath());
			System.out.println("절대경로 file2 : " + file2.getAbsolutePath());
			System.out.println("절대경로 file3 : " + file3.getAbsolutePath());
			
			System.out.println("---- getCanonicalPath() : 정식경로명 -------");
			System.out.println("정식경로 file1 : " + file1.getCanonicalPath());
			System.out.println("정식경로 file2 : " + file2.getCanonicalPath());
			System.out.println("정식경로 file3 : " + file3.getCanonicalPath());

			System.out.println("---- exists() : 파일의 물리적 존재 여부 확인시 씀");
			System.out.println("file1.exists() : " + file1.exists());
			System.out.println("file2.exists() : " + file2.exists());
			System.out.println("file3.exists() : " + file3.exists());
			
			System.out.println("--- File 속성정보 ----");
			System.out.println("file1.length() : " + file1.length());
			System.out.println("file1.canRead() : " + file1.canRead());
			System.out.println("file1.canWrite() : " + file1.canWrite());
			System.out.println("file1.canExecute() : " + file1.canExecute());
			
			System.out.println("--- getName() : 파일명만 필요하다 하면 --------");
			System.out.println("file1.getName() : " + file1.getName()); // 파일이름을 의미
			System.out.println("file2.getName() : " + file2.getName());
			System.out.println("file2.getName() : " + file3.getName());
			
			System.out.println("--- isDirectory(), isFile() ---- ");
			System.out.println("file1.isDirectory() : " + file1.isDirectory());
			System.out.println("file1.isFile() : " + file1.isFile());
			
			System.out.println("===============");
			File file4 = new File("file/temp4.txt"); //file 디렉토리 밑에 temp4
			System.out.println("file4.delete() : " + file4.delete());
			
			file4.createNewFile(); //새로만들기
			
			System.out.println("================");
			File file5 = new File("temp1/temp2/temp3");
			System.out.println("file5.mkdirs() : " + file5.mkdirs()); //디렉토리 만들기
	
	}
}
