package Date711;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;

public class Item_Class extends JFrame implements ItemListener
{
	Choice ch=new Choice();
    Item_Class()
    {
    	this.setVisible(true);
    	this.setSize(400, 100);
    	this.setLayout(new FlowLayout());
    	
    	// ch�� �׸��߰�
    	ch.add("¥���");
    	ch.add("�쵿");
    	ch.add("������");
    	ch.add("�Ⱥ�ä");
    	ch.add("������");
    	ch.addItemListener(this);
    	add(ch);
    }
	
	@Override
	public void itemStateChanged(ItemEvent arg0) {
        System.out.println(ch.getSelectedItem());
	}

}
