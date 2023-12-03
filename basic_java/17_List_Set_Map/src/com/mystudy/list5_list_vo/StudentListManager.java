package com.mystudy.list5_list_vo;

import java.util.ArrayList;
import java.util.List;

	/* // CRUD : 생성(Create), 조회(Read), 수정(Update), 삭제(Delete)
	성적처리를 위한 관리용 클래스를 생성 CRUD 기능을 구현하고 확인하시오
	(학생 정보를 List에 저장하고 관리하되 이름은 중복되지 않는다)  
	■ 클래스명 : StudentListManager
	■ 속성(필드변수) : StudentVO 저장을 위한 List
	■ 기능(메소드)
	  - select : StudentVO 타입 데이터를 전달받아 동일한 이름 데이터를 찾아서 리턴
	  - select : 이름(String)을 전달받아 동일한 이름 데이터 찾아서 리턴
	  - selectAll : 전체 데이터 리턴
	  - insert : StudentVO 타입 데이터를 전달받아 List에 추가
	  - update : StudentVO 타입 데이터를 전달받아 List에서 동일데이터 찾아서 수정
	  - update : 이름(String)을 전달받아 동일한 이름 데이터 수정
	  - delete : StudentVO 타입 데이터를 전달받아 List에서 동일데이터 찾아서 삭제
	  - delete : 이름(String)을 전달받아 동일한 이름 데이터 삭제
	*/
	public class StudentListManager {
		private List<StudentVO> list = new ArrayList<StudentVO>();
	
		public StudentListManager() {
			//insertSample(); //샘플 데이터 입력
		}
		private void insertSample() {
			list.add(new StudentVO("홍길동", 100, 90, 81));
			list.add(new StudentVO("이순신", 95, 88, 92));
			list.add(new StudentVO("김유신", 90, 87, 77));
		}
		
		public List<StudentVO> selectAll() {
			return list;
	}

}