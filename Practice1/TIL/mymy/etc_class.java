import java.awt.Frame;

class father11{
	public void chul() {
		System.out.println("father");
	}
}
class My11 extends father11
{
	public void chul() {
		System.out.println("My 클래스에서 재정의하기");
	}
}
class you extends Frame //다른 클래스를 상속받고 있기 때문에
{
	//상속 받지 않은 상채에서 father 클래스의 chul() 메소드를 재정의
	father11 f=new father11()//객체생성할 경우에는 세미클론을 마지막에 해주어야 함 기억해놓을것.
	{
		public void chul()
		{
			System.out.println("you 클래스에서 익명구현으로 재정의");
		}
	};
//	public void imsi() {
//		father11 f=new father11();
//		f.chul();
//	}
}
public class etc_class {

	public static void main(String[] args) {
		My11 m=new My11();
		m.chul();
		you y=new you();
		y.f.chul();
//		y.imsi();
	}

}
