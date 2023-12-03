package com.mystudy.ex06_object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStream_Exam_TWR {

	public static void main(String[] args) {
		// ObjectInputStream, ObjectOutputStream
		// Object 타입의 데이터를 사용해서 입출력(I/O)
		// -------------------
		// Object 타입의 데이터를 파일에 저장하고 읽어오기(StudentVO)
		
		// 파일에 저장할 데이터 준비 (StudentVO 타입 데이터)
		System.out.println("---- 저장할 데이터 준비 ----");
		StudentVO stu1 = new StudentVO("홍길동", 100, 90, 81);
		StudentVO stu2 = new StudentVO("김유신", 95, 85, 75);
		
		System.out.println("stu1 : " + stu1);
		System.out.println("stu2 : " + stu2);
		System.out.println("=================");
		
		File file = new File("file/object_io.data");
//		FileOutputStream fos = null;
//		ObjectOutputStream oos = null;
		
		
		// Java7 부터 제공된 try ~ with ~ resource 구문으로 작성
		// try (변수선언 및 생성구문) {} catch(){} 
		// AutoCloseable 인터페이스 구현된 클래스에서만 사용 가능
		// 자동 close 처리가 돼서 따로 close나 finally 안 해줘도 돼.
		// 코드를 심플하게 작성할 수 있음
		
		try (FileOutputStream fos = new FileOutputStream(file);
			 ObjectOutputStream oos = new ObjectOutputStream(fos);) {
				
//			fos = new FileOutputStream(file);
//			oos = new ObjectOutputStream(fos);
		
			System.out.println(">> 파일에 쓰기 - ObjectOutputStream 사용");
			// NotSerializableException : Serializable 아님 예외
			oos.writeObject(stu1); // StudentVO 데이터 하나 출력(쓰기)
			oos.writeObject(stu2); 
			
			System.out.println(">> 파일에 쓰기 완료 ------");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("==== 파일에서 읽어서 화면 출력 ====");

//		ObjectInputStream ois = null;
		
		// try (변수선언 및 생성구문) {} catch(){}
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));) {
			
//			ois = new ObjectInputStream(new FileInputStream(file));
			
			System.out.println(">> 파일로부터 StudentVO 데이터 읽기");
			StudentVO stuInput1 = (StudentVO) ois.readObject();
			StudentVO stuInput2 = (StudentVO) ois.readObject();
			
			System.out.println("stuInput1 : " + stuInput1);
			System.out.println("stuInput2 : " + stuInput2);
			System.out.println("-----------");
			System.out.println(stuInput1.getName() + ", " + stuInput1.getTot()
					+ ", " + stuInput1.getAvg());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
//		} finally {
//			try {
//				if (ois != null) ois.close();
//			} catch (IOException e) {}
		}
	}

}
