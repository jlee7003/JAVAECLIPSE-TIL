import java.awt.*;
import javax.swing.JFrame;
public class Panel_Class extends JFrame
{
	Label Lname=new Label("�̸�");
	TextField name=new TextField(10);
	Label Lphone=new Label("��ȭ��ȣ");
	TextField phone=new TextField(20);
	Button btn=new Button("����");
	
	Panel_Class()
	{
	   	this.setVisible(true);
	   	this.setSize(400,300);
	   	// this.setLayout(new FlowLayout());
	   	// FlowLayout���� �� ��� �߰��Ǵ� ������Ʈ ������ ����
	   	this.setLayout(new BorderLayout());
	   	// BorderLayout�� ��������,�߾� 5���� �������� ����
	   	// 5���� ������ 2���̻��� ������Ʈ�� �ֱ� ���� Panel�� �̿��Ѵ�.
	   	
	   	Panel p1=new Panel();
	   	Panel p2=new Panel();
	   	p1.add(Lname);
	   	p1.add(name);
	   	p2.add(Lphone);
	   	p2.add(phone);
	   	
	   	add("North",p1);
	   	add("Center",p2);
	   	add("South",btn);
 	}

}
