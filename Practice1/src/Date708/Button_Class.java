package Date708;
import java.awt.*;
import javax.swing.*;
public class Button_Class extends JFrame // Button
{                                  // new JFrame() => â�����!!
   // �Ӽ� => �ڷ�������, �迭, Ŭ��������(��ü����)
	Button btn=new Button("Ȯ��");
	JButton btn2=new JButton("���");
   // ������
	Button_Class() // ������ => ������â�� ����� ���� ����
	{
		 setVisible(true); // ���̱�
		 setSize(400,300); // ũ��
         // component �߰����� ���̾ƿ��� ó��
		 setLayout(new FlowLayout()); // ���̾ƿ��� FlowLayout
		 // component �߰�
		 add(btn);
		 add(btn2);
	}
	
   // �޼ҵ�
	public void imsi()
	{
	  
	}
}
