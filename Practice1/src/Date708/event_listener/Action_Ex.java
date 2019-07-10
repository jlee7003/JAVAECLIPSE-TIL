package Date708.event_listener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class Action_Ex extends JFrame implements ActionListener
//------------------------------버튼생성----------------------------------
{
	JButton btn=new JButton("확인");//버튼 생성
	JButton btn2=new JButton("클릭");
	JButton btn3=new JButton("닫기");
	Action_Ex()
	{
		  this.setVisible(true);//창이 보이게
		  this.setSize(300,200);//크기 설정
		  this.setLayout(new FlowLayout());
		  btn.addActionListener(this); //버튼컴퍼넌트에 이벤트 장착
		  btn2.addActionListener(this);//버튼컴퍼넌트에 이벤트 장착
		  btn3.addActionListener(this); //문제는 버튼 2개가 똑같은 역할을 하기에 버튼의 역할을 구분 할 수 있어야 한다.
		  add(btn);
		  add(btn2);
		  add(btn3);
		  
	}
//----------------------------------------------------------------
	public void actionPerformed(ActionEvent e) 
	{ // ��ư�� �����Ҽ� �ִ� �̺�Ʈ�޼ҵ�
		//this.setTitle("하하"); //윈도우창의 제목
		 //System.exit(0);//닫기기능
		Object ob=e.getSource(); //e 이벤트로 호출한 객체의 소스를 가지고 와라
		if(ob==btn)
		{
			this.setTitle("확인이 클릭");
		}
		else if(ob==btn2)
			this.setTitle("클릭이 클릭");
		else if(ob==btn3)
		{
			System.exit(0);
		}
	}
}









