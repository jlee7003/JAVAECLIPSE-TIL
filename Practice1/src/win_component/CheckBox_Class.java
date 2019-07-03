package win_component;

import java.awt.Checkbox;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBox_Class extends JFrame
{
	Checkbox cb1=new Checkbox("짜장1",true); //true 되어 있으면 체크됨
	Checkbox cb2=new Checkbox("짜장2");
	Checkbox cb3=new Checkbox("짜장3");
	Checkbox cb4=new Checkbox("짜장4");
	
	JCheckBox jcb1=new JCheckBox("비빔밥1",true);
	JCheckBox jcb2=new JCheckBox("비빔밥2");
	JCheckBox jcb3=new JCheckBox("비빔밥3");
	JCheckBox jcb4=new JCheckBox("비빔밥4",true);

	CheckBox_Class()
	{
		this.setVisible(true);
		this.setBounds(300,200,400,300);
		this.setLayout(new FlowLayout());
		
		add(cb1); add(cb2); add(cb3); add(cb4);
		add(jcb1); add(jcb2); add(jcb3); add(jcb4); 
	}
}
