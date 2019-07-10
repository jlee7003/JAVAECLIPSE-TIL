package Date708;
import java.awt.*;
import javax.swing.*;
public class Choice_Class extends JFrame
{
   Choice c1=new Choice();
   JComboBox cb;
   String[] food= {"짜장면","짬뽕","탕수육","우동","라조기","깐풍기"};
   Choice_Class()
   {
	   this.setLayout(new FlowLayout());
	   this.setSize(300,100);
	   c1.add("MON");
	   c1.add("TUE");
	   c1.add("WEN");
	   c1.add("THU");
	   c1.add("FRI");
	   c1.add("SAT");
	   c1.add("SUN");
	   add(c1);
	   
	   cb=new JComboBox(food);//스윙
	   add(cb);
	   this.setVisible(true);
   }
}

















