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
    	ch.add("1");
    	ch.add("2");
    	ch.add("3");
    	ch.add("4");
    	ch.add("5");
    	ch.addItemListener(this);
    	add(ch);
    }
	
	@Override
	public void itemStateChanged(ItemEvent arg0) {
        System.out.println(ch.getSelectedItem());
	}

}
