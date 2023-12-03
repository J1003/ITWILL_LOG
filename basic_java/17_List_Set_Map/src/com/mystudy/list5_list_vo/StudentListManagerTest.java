package com.mystudy.list5_list_vo;

import java.util.List;

public class StudentListManagerTest {

	public static void main(String[] args) {
		StudentListManager manager = new StudentListManager();
		List<StudentVO> list = manager.selectAll();
		System.out.println("list : " + list);
		
		// 목록에 데이터 입력 ------
		
		// 목록 데이터 검색 -------
		
		// 목록 데이터 수정 -------
		
		// 목록 데이터 삭제 -------
		
		
	}

}
