package Date710;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;

public class Item_ClassM extends JFrame implements ItemListener{

	Choice ch =new Choice();
	
	public Item_ClassM()
	{
		setVisible(true); //-> 지금 만든 창의 보이기 속성 true
		setSize(400,300);
		this.setLayout(new FlowLayout());
		
		ch.add("짜장면");
		ch.add("짬뽕");
		ch.add("우동");
		ch.add("콩국수");
		ch.add("라조기");
		
		ch.addItemListener(this);
		add(ch);
	}
	
	public void itemStateChanged(ItemEvent e) {
		  System.out.println(ch.getSelectedItem());
	}

}
