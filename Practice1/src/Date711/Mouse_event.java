package Date711;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Mouse_event extends JFrame implements MouseListener{

	JButton btn=new JButton("확인");
	Mouse_event()
	{
		setVisible(true);
		setSize(300,200);
		//this.addMouseListener(this); <- 윈도우 창에 마우스 리스너 추가
		this.setLayout(new FlowLayout());
		btn.addMouseListener(this);
		add(btn);
	}
	

	public void mouseClicked(MouseEvent e) {
		
		
	}

	
	public void mouseEntered(MouseEvent e) {
		//마우스오버와 똑같음
		
		
	}


	public void mouseExited(MouseEvent e) {

	}


	public void mousePressed(MouseEvent e) 
	{//마우스클릭할떄
		
	}

	
	public void mouseReleased(MouseEvent e)
	{ //마우스를 눌렀다가 땔때
		System.out.println("마우스를 클릭");
	}

}
