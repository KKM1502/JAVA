package COM.TEST.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Ex01 {
	public static void main(String[] args) {

		/*
		 JDBC, Java Database Connectivity
		 - 응용 프로그램과 데이터베이스를 연결하는 기술
		 - 영속성 계층(Persistance Layer)
		 1. JDBC
		 2. Spring
		 3, MyBatis
		 4. JPA 
		  
		  JDBC 준비 과정
		  - 각 데이터베이스 제조사별로 관련 클래스 제공 > *.jar
		  - ojdbc6.jar
		  
		  
		 */		
		// Java + JDBC > Connection 클래스 
		Connection conn = null;
		
		try {
			//연결 문자열 , Connection String > 오라클 접속 정보
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pw ="java1234";
			
			//JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println(conn.isClosed());// 접속 상태 확인 boolean 값
		
			
			//SQL 실행
			
			
			conn.close();
					
			//DB 접속
			//- Connection 객체 생성
			//- DB 접속 완료
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}