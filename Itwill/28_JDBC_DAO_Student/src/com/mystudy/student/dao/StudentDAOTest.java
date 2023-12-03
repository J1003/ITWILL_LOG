package com.mystudy.student.dao;

import java.util.List;

import com.mystudy.student.vo.StudentVO;

public class StudentDAOTest {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		String id = "2023001";
		StudentVO stu1 = dao.selectOne(id);
		System.out.println("stu1 : " + stu1);
		
		System.out.println("---- selectOne(VO) ----");
		StudentVO stu2 = new StudentVO("2023003", "", 0, 0, 0);
		System.out.println("검색용 전달vo : " + stu2);
		
		StudentVO student = dao.selectOne(stu2);
		System.out.println("DB 검색된 student : " + student);
		
		System.out.println("---- selectAll() ----");
		List<StudentVO> list = dao.selectAll();
		for (StudentVO vo : list) {
			System.out.println(vo);
		}
		System.out.println("-------");
		for (StudentVO vo : list) {
			System.out.println(vo.getId() + ", " + vo.getName());
		}
		
		System.out.println("---- insert(vo) ----");
		student = new StudentVO("2023023", "홍경민", 50, 88, 10);
		System.out.println("입력할 학생 : " + student);
		
		int result = dao.insert(student);
		System.out.println("입력결과 : " + result);
		
		System.out.println("입력결과 : " + dao.selectOne(student));
		
		
		System.out.println("---- update(vo) ----");
		student = new StudentVO("2023033", "홍경래2upd", 95, 85, 75);
		System.out.println("수정할 학생 정보 : " + student);
		result = dao.update(student);
		System.out.println("수정건수 : " + result);
		
		System.out.println("수정결과 : " + dao.selectOne(student));
		
	
		
		System.out.println("---- delete(id) ----");
		
		id = "2023023";
		System.out.println("삭제할 학생 ID : " + id);
		result = dao.delete(id);
		System.out.println("삭제건수 : " + result);
		System.out.println("삭제결과 : " + dao.delete(id));
		
		// (쌤 VER) id값 직접 입력 안 하고 update 된 값으로 삭제하는 방법!!
		System.out.println("----- delete(id) -----");
		System.out.println("삭제할 데이터 : " + dao.selectOne(student));
		int count = dao.delete(student.getId());
		System.out.println("삭제건수 : " + count);
		
		System.out.println("삭제데이터 조회결과 : " + dao.selectOne(student));
		
	}
}

