package Date708;
import java.awt.*;
import javax.swing.*;
public class Radio_Class extends JFrame
{
  CheckboxGroup chg=new CheckboxGroup();
  Checkbox aa=new Checkbox("����",false,chg);
  Checkbox bb=new Checkbox("����",false,chg);
  
  JRadioButton btn1=new JRadioButton("����");
  JRadioButton btn2=new JRadioButton("����");
  ButtonGroup bg=new ButtonGroup();
  Radio_Class()
  {
	this.setVisible(true);
	this.setBounds(300,200,300,300);
	this.setLayout(new FlowLayout());
    bg.add(btn1);
    bg.add(btn2); // ������ư�� �׷쿡 �־��ش�..
    
    add(btn1); add(btn2);
    add(aa); add(bb);
  }
}
