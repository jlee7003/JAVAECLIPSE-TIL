package Date708;
import java.awt.*;
import javax.swing.JFrame;
public class TextField_Class extends JFrame
{
  // �����Է�,����ǥ��
	Label aa=new Label("�ȳ��ϼ���");
	TextField tf=new TextField(10);
  // ������
	TextField_Class()
	{
		this.setVisible(true);
		this.setBounds(300,200,400,200);
		// setSize(300,200) + setLocation(400,200)
		this.setLayout(new FlowLayout());
		add(aa);
		add(tf);
	}
 
	
}











