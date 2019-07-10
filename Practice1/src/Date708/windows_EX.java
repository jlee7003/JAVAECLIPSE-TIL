package Date708;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class windows_EX extends Frame implements WindowListener
{
	windows_EX()
	{
		setVisible(true);
		this.setSize(300,200);
		this.addWindowListener(this);
	}
	public void windowActivated(WindowEvent arg0) {}
	public void windowClosed(WindowEvent arg0) {}
	public void windowClosing(WindowEvent arg0) 
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent arg0) {}
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("다시생김");
	}
	public void windowIconified(WindowEvent arg0) {
		System.out.println("아이콘화");
	}
	public void windowOpened(WindowEvent arg0) {}
		
	}
	

	


