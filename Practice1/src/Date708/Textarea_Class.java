package Date708;

import java.awt.FlowLayout;
import java.awt.TextArea;

import javax.swing.*;

public class Textarea_Class extends JFrame 
{
   TextArea ta1=new TextArea("�����ÿ�",5,30);
   JTextArea ta2=new JTextArea("�����ÿ�",5,30);
   
   Textarea_Class()
   {
	   this.setVisible(true);
	   this.setBounds(400,300,300,300);
	   this.setLayout(new FlowLayout());
	   ta2.setLineWrap(true); // �ڵ��� �ٲ�
	   add(ta1);
	   add(ta2);
   }
}
