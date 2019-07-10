package Date708;

import java.awt.FlowLayout;
import javax.swing.*;

public class Login_Class2 extends JFrame
{
	  // �Ӽ� => Label 2��, TextField 2��
		JLabel id=new JLabel("���̵�");
		JLabel pwd=new JLabel("��й�ȣ");
		JTextField tid=new JTextField(10);
		JPasswordField tpwd=new JPasswordField(10);
	  // ������
		Login_Class2()
		{
			this.setVisible(true);
			this.setBounds(300,200,400,300);
			this.setLayout(new FlowLayout());
			add(id);
			add(tid);
			add(pwd);
			add(tpwd);
		}
 

}
