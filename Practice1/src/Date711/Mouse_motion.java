package Date711;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Mouse_motion extends JFrame implements MouseMotionListener {

	Mouse_motion()
	{
		this.setVisible(true);
		this.setSize(400,400);
		this.addMouseMotionListener(this);
	}
	
	
	public void mouseDragged(MouseEvent e) {
		// 마우스 드래그할떄 실행이 됨
		this.setTitle("x좌표 :"+e.getX());
	}

	
	public void mouseMoved(MouseEvent e) {
		// 마우스가 움직일때
		this.setTitle("Y좌표 :"+e.getY());
	}

}
