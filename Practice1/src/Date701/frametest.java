package Date701;

import java.awt.Frame;
import javax.swing.JFrame;

public class frametest // awt, swing은 윈도우 프로그램
{
	public static void main(String[] args) 
	{
		Frame f = new Frame();
		f.setVisible(true);
		f.setSize(200, 200);

		JFrame f1 = new JFrame();
		f1.setVisible(true);
		f1.setSize(200, 200);
	}
}
