package Date708.event_listener;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Window_Ex extends Frame implements WindowListener
{
   Window_Ex()
   {
	   setVisible(true);
	   this.setSize(300,200);
	   this.addWindowListener(this); // ����â�� �̺�Ʈ�� �߰�
   }
   public void windowActivated(WindowEvent arg0) {}
   public void windowClosed(WindowEvent arg0) {}
   public void windowClosing(WindowEvent arg0) 
   {
	   System.exit(0); // ���α׷� ����
   }
   public void windowDeactivated(WindowEvent arg0) {}
   public void windowDeiconified(WindowEvent arg0) 
   {
	   System.out.println("�ٽ� ����");
   }
   public void windowIconified(WindowEvent arg0)
   {
	   System.out.println("������ȭ");
   }
   public void windowOpened(WindowEvent arg0) {}
}









