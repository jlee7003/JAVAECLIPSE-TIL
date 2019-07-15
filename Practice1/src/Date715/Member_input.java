package Date715;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Member_input extends JFrame implements ActionListener{// 이름,주소,나이를 입력 받아서 db에 저장
						   // 클래스는 속성(기능을 사용할때 변수를 저장할 공간)과 메소드로 구성이 됨
	Connection conn;// 전역변수,멤버변수 -> 메소드 밖에다가 생성해야함
	Statement stmt;
    JLabel Lname=new JLabel("이름");
    JLabel Lphone=new JLabel("전화번호");
    JLabel Lage=new JLabel("나이");
    JTextField name=new JTextField(20);
    JTextField phone=new JTextField(5);
    JTextField age=new JTextField(5);
    JButton submit=new JButton("저장");
    JButton cancel=new JButton("취소");


	// DB에 연결 시키기

	Member_input()
	{
		Window_create();		
	}
	
	public void Db_conn() throws SQLException 
	{
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
		stmt = conn.createStatement();
	}
	// 값을 입력 받는 것(값을 입력받는 윈도우창을 생성하여 입력)
    public void Window_create()
    { //라벨3 택스트3 버튼2
         this.setVisible(true);//this->Member_input
         this.setSize(300,200);
         //컴포넌트 추가전에 레이아웃을 생각해야함
         Panel p1=new Panel();//이름라벨,입력폼
         Panel p2=new Panel();
 	   	 Panel p3=new Panel();
 	   	 Panel p4=new Panel();
         this.setLayout(new FlowLayout());
         p1.add(Lname);
         p1.add(name);
         p2.add(Lphone);
         p2.add(phone);
         p3.add(Lage);
         p3.add(age);
         p4.add(submit);
         p4.add(cancel);
         submit.addActionListener(this);
         cancel.addActionListener(this);
         this.add(p1);
         this.add(p2);
         this.add(p3);
         this.add(p4);

    }
    // 입력된 값을 DB에 입력하는 메소드가 있어야 함

    public void Db_Input() throws SQLException
    {
    	//이름 전화번호 나이 가져오기
    
    	Db_conn();
    	String dname=name.getText();
    	String dphone=phone.getText();
    	String dage=age.getText();
    	
    	String sql="insert into member(name,phone,age) values('"+dname+"','"+dphone+"',"+dage+")";
        stmt.executeUpdate(sql);
    }
    
	public void actionPerformed(ActionEvent e) //actionPerformed는  throw를 못함
	{
		//저장,취소버튼 2개가 클릭
		Object ob=e.getSource();//객채를 불러옴
		if(ob==submit)//submit 버튼은 저장
		{
			try {
				Db_Input();
				} 
			catch (SQLException e1) 
			{
				e1.printStackTrace();
			}
		}
		else//cancel 버튼은 종료
			System.exit(0);
	}

}

	/* 
	 * 생성자,메소드
	 * 
	 * 공통점 -> 둘다 기능
	 * 
	 * 차이점 -> 호출 시점
	 * 
	 * 생성자: new 생성자(); => 객체 생성시 바로 호출
	 * 메소드: 
	 * ______________________________________________
	 * 하나의 메소드에는 여러 기능을 담으면 상속시에 문제가 생김 하지만 기능이 너무 적으면 호출시에 불편함이 있음 -> 그러므로 적절한 사용이
	 * 필요
	 * ________________________________________________
	 * JFrame f=new JFrame(); 
	 * 상속을 받으면 부모클래스의 생성자를 무조건 먼저 실행 그후 자식 클래스의 생성자가 실행
	 * ______________________________________________________
	 * Class Member_input extends JFrame
	 * {
	 *   //멤버변수,속성
	 *   
	 *   //생성자()
	 *   {
	 *    창생성-> 생성자x
	 *    Window_create();
	 *   } 
	 *   
	 * Window_create()
	 * {
	 *   창생성;
	 * }
	 * }
	 *
	 * 
	 * 
	 */

