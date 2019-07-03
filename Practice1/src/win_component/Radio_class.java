package win_component;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Radio_class extends JFrame
{ CheckboxGroup chg=new CheckboxGroup();
  Checkbox aa=new Checkbox("남자",false,chg);
  Checkbox bb=new Checkbox("여자",false,chg);
  
  JRadioButton btn1=new JRadioButton("남자");
  JRadioButton btn2=new JRadioButton("여자");
  ButtonGroup bg=new ButtonGroup();


Radio_class()
{
	this.setVisible(true);
	this.setBounds(300,200,400,300);
	this.setLayout(new FlowLayout());
	bg.add(btn1);
	bg.add(btn2);//버튼을 그룹에 넣는 작업 그래야 둘중 하나만 선택이 되어짐
	
	add(btn1); add(btn2); add(aa); add(bb);
}

}