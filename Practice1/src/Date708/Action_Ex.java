package Date708;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Action_Ex extends JFrame implements ActionListener//<- 버튼을 클릭했을때
//                                    implements를 사용하면 구연을 해주어야 에러가 발생하지 않음
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
        btn.addActionListener(this);//메소드에 접근하기 위해서는 add를 해주어야함
                                    //버튼 리스너를 연결 시킴(컴포넌트에 이벤트를 장착이라고도 표현함)
        btn2.addActionListener(this);//버튼컴퍼넌트에 이벤트 장착
		  btn3.addActionListener(this); //문제는 버튼 2개가 똑같은 역할을 하기에 버튼의 역할을 구분 할 수 있어야 한다.
		  add(btn);
		  add(btn2);
		  add(btn3);
	}
	
	//----------------------------------------------------------------

	public void actionPerformed(ActionEvent e)//<-이벤트 결과 실행
	{//내가 사용하고자 하는 listener를 선택하고 기능을 구현해준다.
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
