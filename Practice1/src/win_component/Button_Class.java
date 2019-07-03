package win_component;
import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.*;
public class Button_Class extends JFrame // Button
                                     //new JFrame()-> 창만들기
   //자료형 변수 -> 값 하나를 저장
   /*배열 int[] aa=new int[5]->값을 여러개 저장하는 곳
    * 
    * 클래스변수 => 속성, 메소드 사용자가 만든 클래스를 변수로 만들어 사용하는것
    * Date today=new Date();
    * 
    * */
{  //속성
	Button btn=new Button("확인");//들어가는 컴포넌트는 밖에서 만ㄷ글어 주어야함
	JButton btn2=new JButton("취소");	 //j가 붙으면 스윙 섞어 써도 아무 이상이 없음
	
	
	Button_Class() // 생성자 -> 윈도우창을 만드는 문장 실행
	{
		setVisible(true); //-> 지금 만든 창의 보이기 속성 true
		setSize(400,300); //-> 창의 크기 설정
		/*component 추가 주로 창을 만들때 많이 하므로 생성자를 만들때 많이 함
		 * 추가 전에 레이아웃을 처리해야함
		 * 
	     */
		
		
		setLayout(new FlowLayout()); //레이아웃을FlowLayout(들어온대로)
		//component 추가
		add(btn);
		add(btn2);
		
	}
	
	
	public void imsi()
	{
		
	}
}
