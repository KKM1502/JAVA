package COM.TEST.JDBC;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import com.test.my.DBUtil;

public class Ex05_PreparedStatement {
	
	public static void main(String[] args) {
//		m2();
		
//		m3();
		m4();
		//정적(매개변수x) SQL > statement          ex) select * from tblinsa; 
		//동적(매개변수o) SQL > statement 		  ex) select * from tblinsa where num = 사용자입력;
	}
	
	private static void m4() {
		
		String name = "hahaha";
		String age = "22";
		String gender = "m";
		String tel = "010-1234-5678";
		String address = "서울시 동대문구 이문동's 카페";
		Connection conn = null;
		PreparedStatement pstat = null;
		
		try {
			
			conn = DBUtil.open("jdbc:oracle:thin:@localhost:1521:xe","hr","java1234");
			
			//? : 오라클 문법 > 오라클 매개변수 
			// - String.format 유사 
			String sql = "insert into tblAddress (seq, name, age, gender, tel, address,regdate) values (seqAddress.nextVal,?,?,?,?,?,default)";
			
//			stat = conn.createStatement();
//			stat.executeUpdate(sql);
			pstat = conn.prepareStatement(sql);
			//pstat이 참조하는 SQL에서 첫번째 매개변수에다가 name을 대입해라
			// - 유효하지 않은 몇몇 문자를 이스케이프 처리를 자동으로 해준다.
			for(int i=0;i<10;i++) {
			pstat.setString(1,name+i );
			pstat.setString(2, age);
			pstat.setString(3, gender);
			pstat.setString(4, tel);
			pstat.setString(5, address);
			
			//10번의 쿼리를 동일한 SQL로 인식 단, 데이터만 바꿈 
			//데이터 교체 이외의 나머지 부분은 재사용이 된다.
			int result = pstat.executeUpdate();
			System.out.println(result);
			}
			pstat.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void m3() {
		//주소록 x 10명 추가(난수)
		//-SQL 동일 + 데이터 상이 > 작업 반복
		
		String name = "hahaha";
		String age = "22";
		String gender = "m";
		String tel = "010-1234-5678";
		String address = "서울시 동대문구 이문동";
		//오라클에서는 '한개가 구문 오류를 일으킴 replace문으로 ' 을 ''로 고쳐준다.
		Connection conn = null;
		Statement stat = null;
		
		try {
			
			conn = DBUtil.open("jdbc:oracle:thin:@localhost:1521:xe","hr","java1234");
			stat = conn.createStatement();
			
			//비교 포인트
			for(int i = 0 ; i <10 ; i++) {
			String sql = String.format("insert into tblAddress (seq, name, age, gender, tel, address,regdate) values (seqAddress.nextVal,'%s','%s','%s','%s','%s',default)",name+i,age,gender,tel,address);
			int result = stat.executeUpdate(sql);
			System.out.println(result);
			}
			
			stat.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void m2() {
		
		//SQL Inject
		//해킹 기술
		//Login
		//id: hong
		//pw: 1234
		//"select * from tblUser where id = '"+id+"' and pw = '"+pw+"'";
		//"select * from tblUser where id = 'hong' and pw = '1234'";
		
		//id: hong
		//pw: 1' or 1=1 or '
		//1'||1=1||'
		//"select * from tblUser where id = 'hong' and pw = '1' or 1=1 or ''";
		String name = "hahaha";
		String age = "22";
		String gender = "m";
		String tel = "010-1234-5678";
		String address = "서울시 동대문구 이문동's 카페";
		Connection conn = null;
		PreparedStatement pstat = null;
		
		try {
			
			conn = DBUtil.open("jdbc:oracle:thin:@localhost:1521:xe","hr","java1234");
			
			//? : 오라클 문법 > 오라클 매개변수 
			// - String.format 유사 
			String sql = "insert into tblAddress (seq, name, age, gender, tel, address,regdate) values (seqAddress.nextVal,?,?,?,?,?,default)";
			
//			stat = conn.createStatement();
//			stat.executeUpdate(sql);
			pstat = conn.prepareStatement(sql);
			//pstat이 참조하는 SQL에서 첫번째 매개변수에다가 name을 대입해라
			// - 유효하지 않은 몇몇 문자를 이스케이프 처리를 자동으로 해준다.
			pstat.setString(1,name);
			pstat.setString(2, age);
			pstat.setString(3, gender);
			pstat.setString(4, tel);
			pstat.setString(5, address);
			
			int result = pstat.executeUpdate();
			System.out.println(result);
			pstat.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void m1() {
		// Statement
		// 1. Statement
		// 2. PreparedStatement
		// 3. CallableStatement
		
		//Statement vs PreparedStatement
		// - 매개변수 처리 지원 유무
		// - STatement > 정적SQL
		// - PreparedStatement > 동적 SQL
		
		//주소록 > 행 추가 (+ 사용자 입력)
		String name = "hahaha";
		String age = "22";
		String gender = "m";
		String tel = "010-1234-5678";
		String address = "서울시 동대문구 이문동";
		address = address.replace("'","''");
		//오라클에서는 '한개가 구문 오류를 일으킴 replace문으로 ' 을 ''로 고쳐준다.
		Connection conn = null;
		Statement stat = null;
		
		try {
			
			conn = DBUtil.open("jdbc:oracle:thin:@localhost:1521:xe","hr","java1234");
			
			//비교 포인트

			String sql = String.format("insert into tblAddress (seq, name, age, gender, tel, address,regdate) values (seqAddress.nextVal,'%s','%s','%s','%s','%s',default)");
			
			
			stat = conn.createStatement();
			int result = stat.executeUpdate(sql);
			
			System.out.println(result);
			stat.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
