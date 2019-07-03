package Date701;

import java.awt.*;
import javax.swing.JFrame;

public class frame2 // awt, swing은 윈도우 프로그램
{
	public static void main(String[] args) 
	{
	
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setSize(200, 200);
		Button btn=new Button("클릭123");
		Label aa=new Label("하하하");
		f.add(btn);//윈도우가 f btn을 window에 넣어라
		f.add(aa);//버튼은 어디로 감??compenent 개념이 하나만 들어감 레이아웃을 사용하지 않으면
		//class로 만들고 메인에서 호출하는 식으로 사용하는 것이 바람직하다.
		JFrame f2 = new JFrame();

		JFrame f3 = new JFrame();
	}
}

