package Date711;

import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Key_class extends JFrame implements KeyListener {

	TextField tf=new TextField(10);
	Key_class()
	{
		setVisible(true); //-> 지금 만든 창의 보이기 속성 true
		setSize(400,300);
		this.setLayout(new FlowLayout());
		add(tf);
		tf.addKeyListener(this);
	}
	
	public void keyPressed(KeyEvent e) {
		System.out.print("Pressed");
	}

	public void keyReleased(KeyEvent e) {
		System.out.print("Released");
	}

	public void keyTyped(KeyEvent e) {
		System.out.print("Typed");
	}

}
