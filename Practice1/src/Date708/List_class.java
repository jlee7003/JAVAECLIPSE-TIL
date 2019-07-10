package Date708;

import java.awt.FlowLayout;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JList;

public class List_class extends JFrame
{
	List l1=new List(5,true);//true 복수개 선택, false 하나만 선택
	   String[] food= {"짜장면","짬뽕","탕수육","우동","라조기","깐풍기"};

	JList jl1=new JList(food);
	List_class()
	{
		this.setLayout(new FlowLayout());
		//select multiple size=?
		//-이벤트가 전부 interface의 형태로 되어있음
		//interface -> implement
		setSize(300,200);
		l1.add("MON");
		l1.add("TUE");	
		l1.add("WEN");	
		l1.add("THU");	
		l1.add("FRI");	
		l1.add("SAT");	
		l1.add("SUN");
		
		add(l1);
		add(jl1);
		this.setVisible(true);		
	}
	

}
