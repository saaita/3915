package ch01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc_test2 {

	static void printData(ResultSet srs, String col1, String col2, String col3)
			throws SQLException {
		
		System.out.print(col1);
		System.out.print("\t|\t" + col2);
		System.out.println("\t\t|\t" + col3);
		while (srs.next()) {

			System.out.print(srs.getString("stu_name"));
			System.out.print("\t|\t" + srs.getString("stu_no"));
			System.out.println("\t|\t" + srs.getString("stu_dept"));
		}
	}

	private static void printTable(Statement stmt) throws SQLException {
		ResultSet srs = stmt.executeQuery("select * from student");
		while (srs.next()) {
			System.out.print(srs.getString("stu_name"));
			System.out.print("\t|\t" + srs.getString("stu_no"));
			System.out.println("\t|\t" + srs.getString("stu_dept"));
		}
	}

	public static void main(String[] args) {

		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // MySQL 드라이버 로드
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SYSTEM";
			String db_pw = "test123";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("DB 연결 완료");
			stmt = conn.createStatement();
			Scanner s = new Scanner(System.in);
			System.out.println("이름 입력 ");
			String stu_no = (s.next());
			System.out.println("학번 입력");
			String stu_name = (s.next());
			System.out.println("학과 입력");
			String stu_dept = (s.next());
			
//			System.out.println("insert into student(stu_no, stu_name, stu_dept) values('" + stu_no + "', '" + stu_name + "', '" + stu_dept + "')");
		//	stmt.executeUpdate("insert into student(stu_no, stu_name, stu_dept) values('" + stu_no + "', '" + stu_name + "', '" + stu_dept + "')");
		//	printTable(stmt);
	
//			stmt.executeUpdate("insert into student(stu_no, stu_name, stu_dept) values('1234678','유재석','기계')");
//			printTable(stmt);
//			stmt.executeUpdate("update student set stu_dept = '컴퓨터정보과'");
//			printTable(stmt);
//			stmt.executeUpdate("delete from student where stu_name = '5431'");
			printTable(stmt);

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
