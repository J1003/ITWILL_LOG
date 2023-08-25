package com.mystudy.member.dao;

import java.util.List;

import com.mystudy.member.vo.MemberVO;
import com.mystudy.student.dao.StudentDAO;
import com.mystudy.student.vo.StudentVO;

public class MemberDAO_Test {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.selectAll();
		
		for (MemberVO vo : list) {
			System.out.println(vo);
		}
		System.out.println("=============");
		
		MemberVO vo = new MemberVO("won", "김김김", "1234", "010-1234-1234", "서울");
		int insertCount =  dao.insert(vo);
		System.out.println("입력건수 : " + insertCount);
		list = dao.selectAll();
		
		for (MemberVO member : list) {
			System.out.println(member);
		}
		
	}

}
