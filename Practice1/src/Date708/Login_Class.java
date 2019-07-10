package Date708;
import java.awt.*;
import javax.swing.JFrame;
public class Login_Class extends JFrame
{
  // �Ӽ� => Label 2��, TextField 2��
	Label id=new Label("���̵�");
	Label pwd=new Label("��й�ȣ");
	TextField tid=new TextField(10);
	TextField tpwd=new TextField(10);
  // ������
	Login_Class()
	{
		this.setVisible(true);
		this.setBounds(300,200,400,300);
		this.setLayout(new FlowLayout());
		tpwd.setEchoChar('*'); // �Ű������� char��
		add(id);
		add(tid);
		add(pwd);
		add(tpwd);
	}
}












