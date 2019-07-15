package Date715;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class Member_view extends JFrame 
{//라벨에다가 값을 부여해야함
	
	Connection conn;
	Statement stmt;
	ResultSet rs;
	JLabel name;
	JLabel phone;
	JLabel age;
	
	Member_view() throws SQLException
	{
		View_frame(); 		
	}
	
	public void View_frame() throws SQLException
	{  
		this.setSize(300,200);
		Db_conn(); //db연결 메소드 호출
		//Db에 있는 테이블을 가져오기
		String sql="select * from member";
		rs=stmt.executeQuery(sql);
		rs.next();
		name=new JLabel(rs.getString("name"));
		phone=new JLabel(rs.getString("phone"));
		age=new JLabel(rs.getString("age"));
		this.setLayout(new FlowLayout());
		add(name);
		add(phone);
		add(age);
		this.setVisible(true);
	}
	
	public void Db_conn() throws SQLException 
	{
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		stmt = conn.createStatement();
	}
	
}
