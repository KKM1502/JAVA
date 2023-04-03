package COM.TEST.JDBC;

import java.sql.Connection;

import com.test.my.DBUtil;

public class Ex02 {

	public static void main(String[] args) {
		Connection conn=DBUtil.open("jdbc:oracle:thin:@localhost:1521:xe","hr","java1234");
		try {
			System.err.println(conn.isClosed());
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
}
