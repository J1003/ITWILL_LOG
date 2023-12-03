package com.mystudy.jdbc1_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student_Select {

	public static void main(String[] args) {
		//--------------------------------------------
		//JDBC 이용한 DB 연동 프로그래밍 작성 절차
		//0. JDBC 라이브러리 개발환경 설정(빌드경로에 등록)
		//1. JDBC 드라이버 로딩
		//2. DB연결 - Connection 객체 생성 <- DriverManager
		//3. Statement 문 실행(SQL 문 실행)
		//4. SQL 실행 결과에 대한 처리
		//   - SELECT : 조회(검색) 데이터 결과 값에 대한 처리
		//   - INSERT, UPDATE, DELETE : int 값(건수) 처리
		//5. 클로징 처리에 의한 자원 반납
		
		// !!자바는 디폴트가 AUTO COMMIT 이다!!!
		//--------------------------------------------
		
		
		
		//1. JDBC 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println(">> 드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("!! [예외발생] 드라이버 로딩 실패 !!");
			e.printStackTrace();
		}
		
		
		//2. DB연결 - Connection 객체 생성 <- DriverManager
		Connection conn = null; // 선언부만 외부로 빼줌
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", 
					"mystudy", "mystudypw");
			System.out.println(">> DB연결 성공 : " + conn);
		} catch (SQLException e) {
			System.out.println("[예외발생] DB연결 실패!! - " + conn);
			e.printStackTrace();
		}
		
		Statement stmt = null; // 초기값을 안 넣어주면 넣어주라는 메세지 뜸
		ResultSet rs = null; 
		//3. Statement 문 실행(SQL 문 실행)
		try {
			// Connection 객체로부터 Statement 객체 생성
			stmt = conn.createStatement();
			String sql = ""
					+ "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG "
				    + "FROM STUDENT " // 습관적으로 뒤에 스페이스바 눌러서 띄어주기!
//					+ "WHERE NAME LIKE '홍길동' "
				    + "ORDER BY ID";
			System.out.println("sql : " + sql);
			rs = stmt.executeQuery(sql);
		
			//4. SQL 실행 결과에 대한 처리
			//   - SELECT : 조회(검색) 데이터 결과 값에 대한 처리
			//   - INSERT, UPDATE, DELETE : int 값(건수) 처리
			// 항상 COMMIT & ROLLBACK 처리 해줘야 프로그램이 완전히 변경된다!
			while (rs.next()) {
				//stringbuilder 사용하는 게 불필요한 문자 안 만들어서 더 효율적!
				System.out.print(rs.getString("ID") + "\t");
				System.out.print(rs.getString("NAME") + "\t");
				System.out.print(rs.getInt("KOR") + "\t");
				System.out.print(rs.getInt("ENG") + "\t");
				System.out.print(rs.getInt("MATH") + "\t");
				System.out.print(rs.getInt("TOT") + "\t");
				System.out.println(rs.getDouble("AVG") + "\t");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//5. 클로징 처리에 의한 자원 반납
		try {
			if(rs != null) rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if(stmt != null) stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if(conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
