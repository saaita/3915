package ch01;

import java.sql.*;


public class Jdbc_test1 {
	public static void main(String[] args) {
		Connection conn;
		Statement stmt = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver"); // MySQL ����̹� �ε�
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "system";
			String db_pw = "test123";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("db ����Ϸ�");
		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (SQLException e){
			System.out.println("DB ���� ����");
		}
		
		
	}
}