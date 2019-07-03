package Date701;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Flow_class extends JFrame
{
 Flow_class()
 {
	 this.setVisible(true);
	 this.setSize(300,200);
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 this.setLayout(new FlowLayout());//flowLayout ->컴퍼넌트가 들어오면 들어온 순서대로 차곡차곡 쌓는것
	 JButton btn=new JButton("클릭하세요");//버튼 생성
		JButton btn2=new JButton("클릭하세요2");//버튼 생성
		this.add(btn);//버튼 넣기
		this.add(btn2);//버튼 넣기
 }
}
