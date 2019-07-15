package Date712;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Input_class extends JFrame implements ActionListener// 버튼클릭 이벤트의 구현을 위해
{
 JLabel Lname=new JLabel("이름");
 JTextField name =new JTextField(10);
 JLabel Lphone=new JLabel("전화번호");
 JTextField phone =new JTextField(10);
 JButton btn=new JButton("저장");
 Connection conn;
 Statement stmt;
 
 public void actionPerformed(ActionEvent e) 
 {//이름과 전화번호를 가져와서 DB에 저장을 한다. 
 // 하나의 함수에 전부다 적어도 문제 되지는 않는다.
     String dbname=name.getText();
     String dbphone=phone.getText();
 	//쿼리작성
     String sql="insert into member (name,phone) values('"+dbname+"','"+dbphone+"')";
     try {
		stmt.executeUpdate(sql);
	} 
     catch (SQLException e1) 
     {
		e1.printStackTrace();
	}
     name.setText("");
     phone.setText("");
  }
 public void close_db() throws SQLException
 {
	 stmt.close();
	 conn.close();
 }
 
 
 Input_class() throws SQLException //생성자에서 실행되는 것은 onload와 똑같다
	{//저장버튼 클릭 -> DB에 저장
	 /* 1.클릭하면
	  * 2.이름과 전화번호 입력창에 값을 가져온다.
	  * 3.입력쿼리 작성후 실행
	  * */
//		이벤트 리스너에 있는 추상메소드는 throw 불가 
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false","root","1234");
		stmt =conn.createStatement();
		
	   	this.setVisible(true);
		this.setSize(400, 300);
        //this.setLayout(new FlowLayout());
    	this.setLayout(new BorderLayout());
   
        Panel p1=new Panel();
        Panel p2=new Panel();
        p1.add(Lname);
        p1.add(name);
        p2.add(Lphone);
        p2.add(phone);
     	btn.addActionListener(this); //버튼에다가 이벤트를 장착
        add("North",p1);
        add("Center",p2);
        add("South",btn);
        
        
        
        /*
        add("North",Lname);
        add("North",name);
        add("Center",Lphone);
        add("Center",phone);
        add("South",btn);
        */
        
        
	}



	
}
