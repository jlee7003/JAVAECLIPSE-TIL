import java.awt.*;
import javax.swing.JFrame;
public class Panel_Class extends JFrame
{
	Label Lname=new Label("이름");
	TextField name=new TextField(10);
	Label Lphone=new Label("전화번호");
	TextField phone=new TextField(20);
	Button btn=new Button("저장");
	
	Panel_Class()
	{
	   	this.setVisible(true);
	   	this.setSize(400,300);
	   	// this.setLayout(new FlowLayout());
	   	// FlowLayout으로 할 경우 추가되는 컴포넌트 순으로 정렬
	   	this.setLayout(new BorderLayout());
	   	// BorderLayout은 동서남북,중앙 5개의 영역으로 구성
	   	// 5개의 구성에 2개이상의 컴포넌트를 넣기 위해 Panel을 이용한다.
	   	
	   	Panel p1=new Panel();
	   	Panel p2=new Panel();
	   	p1.add(Lname);
	   	p1.add(name);
	   	p2.add(Lphone);
	   	p2.add(phone);
	   	
	   	add("North",p1);
	   	add("Center",p2);
	   	add("South",btn);
 	}

}
