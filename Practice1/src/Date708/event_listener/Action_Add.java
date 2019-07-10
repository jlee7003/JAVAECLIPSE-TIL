package Date708.event_listener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Action_Add extends JFrame implements ActionListener
{ // �Է¹ڽ� �ΰ��� ���� ���ϱ�
	TextField num1=new TextField(4);
	TextField num2=new TextField(4);
	TextField result=new TextField(4);
    Button btn=new Button("���ϱ�");
    
    Action_Add()
    {
    	this.setSize(400,100);
    	this.setVisible(true);
    	this.setLayout(new FlowLayout());
    	btn.addActionListener(this);
    	add(num1);
    	add(num2);
    	add(btn);
    	add(result);
    }
   @Override
	public void actionPerformed(ActionEvent arg0) {
	    // num1���� num2�� �� �о����
		int n1=Integer.parseInt(num1.getText());
		int n2=Integer.parseInt(num2.getText());
		// �� ���ϱ�
		//int hap=n1+n2;
		Integer hap=n1+n2;
		// result�� ���� �����ϱ�
		//result.setText(hap+""); 
		result.setText(hap.toString());
	}
}














