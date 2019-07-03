package win_component;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JFrame;

public class Login_Class extends JFrame
{
	//속성 라벨 2개 , textfield 2개
	Label id =new Label("아이디");
	Label pwd =new Label("비밀번호");
	TextField tid=new TextField(10);
	TextField tpwd=new TextField(10);
	
	
	
	
	Login_Class()
	{
		this.setVisible(true);
		this.setBounds(300,200,400,300);
		this.setLayout(new FlowLayout());
		tpwd.setEchoChar('*');//매게변수가 char 형 //tpwd의 값을 *로 바꿔줌
		add(id);
		add(tid);
		add(pwd);
		add(tpwd);
		
		

	}
}
