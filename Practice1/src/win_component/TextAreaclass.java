package win_component;

import java.awt.FlowLayout;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextAreaclass extends JFrame
{
   TextArea ta1=new TextArea("적으시오",5,30);//(세로크기,가로크기)
   JTextArea ta2=new JTextArea("적으시오",10,30);
   
   TextAreaclass()
   {
	   this.setVisible(true);
		this.setBounds(300,200,400,300);
		this.setLayout(new FlowLayout());
	    ta2.setLineWrap(true); //자동줄바뀜
	    add(ta1);
	    add(ta2);
   }
   
}
