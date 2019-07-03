package win_component;

import java.awt.*;

import javax.swing.JFrame;

public class TextField_Class extends JFrame
{ 
	
	Label aa =new Label("안녕하세요");
	TextField tf=new TextField(10);
	Button btn=new Button("확인");
	
	TextField_Class()
	{
		this.setVisible(true);
		this.setBounds(300,200,400,200); //가로위치,세로위치,가로크기,세로크기
		//moveTo(300,200) + setSize(400,200) 
		this.setLayout(new FlowLayout());
		add(aa);
		add(tf);
		add(btn);
	}
}
