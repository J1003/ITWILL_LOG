package com.mystudy.ex06_object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class ObjectInputOutputStream2_List {

	public static void main(String[] args) {
		// (실습) StudentVO 객체들을 ArrayList에 담아서 파일에 저장하고
		// 파일에서 읽어들인 ArrayList 객체에 담긴 VO 데이터를 화면 출력
		// 사용할 파일명 : file/object_io_list.data
		// ------------------------------------
		// VO 데이터 생성 ---> List에 저장 --> List를 파일에 출력
		// 파일에서 List 읽기 ---> List에 있는 VO 가져다 화면 출력
		
		StudentVO stu1 = new StudentVO("홍길동", 100, 90, 81);
		StudentVO stu2 = new StudentVO("김유신", 95, 85, 75);
		
		
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		list.add(new StudentVO("홍길동", 100, 90, 81));
		list.add(new StudentVO("김유신", 95, 85, 75));
		
		System.out.println(list);
		
		File file = new File("file/object_io_list.data");

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		// 파일에 읽어서 화면 출력
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			
			ArrayList<StudentVO> list1 = (ArrayList<StudentVO>) ois.readObject();
			
			System.out.println("코딩왕이 집에 간대");
			System.out.println(list1.get(0));
			System.out.println(list1.get(1));
			System.out.println("꽤나 졸립다는구먼");
		
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) ois.close();
			} catch (IOException e) {}
		}
		
		
		
	}

}
