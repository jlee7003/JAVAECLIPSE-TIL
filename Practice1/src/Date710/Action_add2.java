package Date710;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Action_add2 extends JFrame implements ActionListener {// 입력박스 두개의 합 구하기
	TextField num1 = new TextField(4); // 입력칸 생성
	TextField num2 = new TextField(4);
	TextField result = new TextField(4);
	Label id = new Label("="); // 글자 생성
	JButton btn = new JButton("+");
	JButton btn1 = new JButton("*");
	JButton btn2 = new JButton("/");
	JButton btn3 = new JButton("-");
	JButton btn4 = new JButton("a~b");
	JButton btn5 = new JButton("LOTTO");
	TextField num3 = new TextField(9);

	Action_add2()// 메소드가 실행 될때 실행
	{
		this.setSize(400, 100);
		this.setVisible(true);// 제일 마지막에 만드는 것이 좋음
		this.setLayout(new FlowLayout());
		btn.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		add(num1);
		add(btn);
		add(btn1);
		add(btn2);
		add(btn3);
		add(num2);
		add(id);
		add(result);
		add(btn4);
		add(btn5);
		add(num3);

	}

	public void actionPerformed(ActionEvent e) { // n1과 n2의 값 읽어오기

		// e 이벤트로 호출한 객체의 소스를 가지고 와라

		{
			int n1 = Integer.parseInt(num1.getText());
			int n2 = Integer.parseInt(num2.getText());
			Object ob = e.getSource();
			Integer imsi = null;
			if (ob == btn)
				imsi = n1 + n2;
			else if (ob == btn1)
				imsi = n1 * n2;
			else if (ob == btn2)
				imsi = n1 / n2;
			else if (ob == btn3)
				imsi = n1 - n2;
			else if (ob == btn4)
			{
				for(int i=n1;i<n2;i++)
				{
				n1=n1+1;
			    }
				
				imsi=n1;
			}
			

			result.setText(imsi.toString());

		}
	}
}
