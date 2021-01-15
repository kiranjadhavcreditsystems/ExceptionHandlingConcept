package com.csi.exceptionconcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConcept {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc://localhost:3306/empdb", "root", "root");
	}
}
