package Date711;

import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;

public class focus_class extends JFrame implements FocusListener {
	TextField tf=new TextField();
	TextField tf2=new TextField();
	focus_class()
	{
		setVisible(true); 
		setSize(400,300);
		this.setLayout(new FlowLayout());
		add(tf);
		add(tf2);
		tf.addFocusListener(this);
	}
	
	
	public void focusGained(FocusEvent e) {
		System.out.print("들어옴");
	}

	public void focusLost(FocusEvent e) {
		System.out.print("나감");
	}

}
