package Date708;

import java.awt.*;

import javax.swing.*;

public class Checkbox_Class extends JFrame 
{
   // �Ӽ�
	Checkbox cb1=new Checkbox("¥���",true);
	Checkbox cb2=new Checkbox("«��");
	Checkbox cb3=new Checkbox("�쵿");
	Checkbox cb4=new Checkbox("¥��");
	
	JCheckBox jb1=new JCheckBox("�����",true);
	JCheckBox jb2=new JCheckBox("�Ұ��");
	JCheckBox jb3=new JCheckBox("������");
	JCheckBox jb4=new JCheckBox("��������",true);
	
	Checkbox_Class()
	{
		this.setVisible(true);
		this.setBounds(200,100,300,300);
		this.setLayout(new FlowLayout());
		
		add(cb1); add(cb2); add(cb3); add(cb4);
		add(jb1); add(jb2); add(jb3); add(jb4);
	}
	
	
	
	
	
	
	
	
	
	
	
}
