package com.expleeve;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDb {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		try(Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/chargeupdb?characterEncoding=utf8", "root", "test");
		Statement stmt = con.createStatement();){
//		ResultSet rs = stmt.executeQuery("select * from cointype limit 1");
//		if(rs.next()){
//			System.out.println(rs.getString(4));
//		}
		stmt.execute("update cointype set desc_chn = '人民币'");
		}
	}

}
