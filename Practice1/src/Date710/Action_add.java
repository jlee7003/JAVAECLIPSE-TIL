package Date710;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Action_add extends JFrame implements ActionListener
{// 입력박스 두개의 합 구하기
    TextField num1=new TextField(4); //입력칸 생성
    TextField num2=new TextField(4);
    TextField result=new TextField(4);
    Label id=new Label("="); //글자 생성
    JButton btn=new JButton("+");
    JButton btn1=new JButton("*");
    JButton btn2=new JButton("/");
    JButton btn3=new JButton("-");
    
    
    Action_add()//메소드가 실행 될때 실행
    {
    	this.setSize(400,100);    	
    	this.setVisible(true);//제일 마지막에 만드는 것이 좋음
    	this.setLayout(new FlowLayout());
    	btn.addActionListener(this);
    	btn1.addActionListener(this);
    	btn2.addActionListener(this);
    	btn3.addActionListener(this);
    	add(num1);
    	add(btn);
    	add(btn1);
    	add(btn2);
    	add(btn3);
    	add(num2);
    	add(id);
    	add(result);
    	
    }



	public void actionPerformed(ActionEvent e) 
	{  //n1과 n2의 값 읽어오기
		
		Object ob=e.getSource(); //e 이벤트로 호출한 객체의 소스를 가지고 와라
		if(ob==btn)
		{
			int n1=Integer.parseInt(num1.getText());
			int n2=Integer.parseInt(num2.getText());
		 
			Integer hap=n1+n2; 
		 
			result.setText(hap.toString()); //방법2
		}
		else if(ob==btn1)
		{
			int n1=Integer.parseInt(num1.getText());
			int n2=Integer.parseInt(num2.getText());
		   
			Integer hap=n1*n2;  
			
			result.setText(hap.toString()); 
		}
		else if(ob==btn2)
		{
			int n1=Integer.parseInt(num1.getText());
			double n2=Integer.parseInt(num2.getText());
		   //값 더하기
			//int hap=n1+n2;  //방법1
			Double hap=n1/n2;  //방법2 대문자로 하면 클래스가 되기에 여러 메소드랑 클래스가 존재함
		   //result에 전달하기
			//result.setText(hap+""); 방법1
			result.setText(hap.toString()); //방법2
		}
		else if(ob==btn3)
		{
			int n1=Integer.parseInt(num1.getText());
			int n2=Integer.parseInt(num2.getText());
		   //값 더하기
			//int hap=n1+n2;  //방법1
			Integer hap=n1-n2;  //방법2
		   //result에 전달하기
			//result.setText(hap+""); 방법1
			result.setText(hap.toString()); //방법2
		}
		
		
		
	}
}

