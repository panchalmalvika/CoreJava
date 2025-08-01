package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class UserUtil {

	public static Connection createConnection()
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_user","root","");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
