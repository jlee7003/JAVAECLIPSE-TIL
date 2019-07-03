package win_component;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login_Class2 extends JFrame
{
	//속성 라벨 2개 , textfield 2개
	JLabel id =new JLabel("아이디");
	JLabel pwd =new JLabel("비밀번호");
	JTextField tid=new JTextField(10);
	JPasswordField tpwd=new JPasswordField(10);
	
	
	
	
	Login_Class2()
	{
		this.setVisible(true);
		this.setBounds(300,200,400,300);
		this.setLayout(new FlowLayout());
		add(id);
		add(tid);
		add(pwd);
		add(tpwd);
		
		

	}
}
