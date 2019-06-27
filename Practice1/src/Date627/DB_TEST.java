package Date627;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DB_TEST 
{
 Connection conn;
 Statement stmt;
 String sql;
 Scanner sc=new Scanner(System.in);
 ResultSet rs;
 
 DB_TEST() throws SQLException
 {
	 conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
     stmt=conn.createStatement();

 }
 

 
 public void all_chul() throws SQLException
 {
	 System.out.println("-전체출력-");
	 sql= "select * from member";
	 chul(sql);
 }
 
 public void name_chul() throws SQLException
 {
	 System.out.println("-이름순-");
	 sql= "select * from member order by name asc";
	 chul(sql);
 }
 
 public void age_chul() throws SQLException
 {
	 System.out.println("-나이순출력-");
	 sql= "select * from member order by age desc";
	 chul(sql);
 }
 
 public void juso_chul() throws SQLException
 {
	 System.out.println("-주소별출력-");
	 sql= "select * from member order by juso desc";
	 chul(sql);
 }

 public void chul(String sql1) throws SQLException
 {
	 rs=stmt.executeQuery(sql);
	 while(rs.next()) //rs.next()는 다음레코드 이동=> 다음레코드 있으면 true 없으면 false;
     {
		 System.out.printf("%10s",rs.getString("id"));
	   System.out.printf("%10s",rs.getString("name"));
	   System.out.printf("%15s",rs.getString("phone"));
	   System.out.printf("%10s",rs.getString("age"));
	   System.out.printf("%10s",rs.getString("juso"));
	   System.out.println();
	 }
 }
 
 
}

