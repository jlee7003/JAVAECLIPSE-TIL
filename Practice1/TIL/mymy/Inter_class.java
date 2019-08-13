import java.awt.Frame;

interface Inter{//인터페이스는 -> 정의 되지 않은 클래스
	public void hap(); //너네 들이 알아서 만들어 써라
	
	default void cal()
	{
		System.out.println("하하하"); //너네들이 알아서 가져다 써라
	}
}
interface Inter2{//인터페이스는 -> 정의 되지 않은 클래스
	public void arg();
}
class sungjuk //클래스에 다른클래스에 사용할 메소드를 선언할 경우 
				// 단점: 다중상속이 금지로 인해 접근이 힘들다.
{
	public void hap() {
		// 아직 실행 내용이 정해지지 않음
		//현재클래스를 다른 사람들이 사용예정 -> 내용이 각각 틀리다.
	}
}

public class Inter_class extends Frame implements Inter, Inter2{
	
	public void hap()
	{
		int a=100;
		int b=90;
		int tot=a+b;
	}

	@Override
	public void arg() {
		
	}

}
