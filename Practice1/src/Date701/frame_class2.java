package Date701;
import javax.swing.JFrame;
public class frame_class2 extends JFrame
{
  frame_class2() //객체생성자 실행
  {//frame이 없어도 실행이 됨
	  this.setVisible(true);
	  this.setSize(200, 200);
  }
  //생성자를 만들고 상속시켰을 경우에 실행을 시키면 부모의 상속자부터 실행이 됨
}
