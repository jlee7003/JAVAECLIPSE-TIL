package Date701;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Component1 extends JFrame
{// 창 만들고 component 넣기
	Component1() //생성자 실행전에 부모 생성자가 먼저 실행됨
	{
		this.setVisible(true);
		this.setSize(400,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프로세스를 지워줌
		JButton btn=new JButton("클릭하세요");//버튼 생성
		JButton btn2=new JButton("클릭하세요2");//버튼 생성
		this.add(btn);//버튼 넣기
		this.add(btn2);//버튼 넣기
	}

}
