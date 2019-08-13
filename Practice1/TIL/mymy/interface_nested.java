
public class interface_nested {

	interface sung
	{
		void test(); //임플리멘트를 했다면 반드시 메소드를 구현해주어야 함
	}
}

class Inter_imple implements interface_nested.sung{

	@Override
	public void test() {
		System.out.println("인터페이스 구현");
	}//인터페이스 안에 있는 메소드
	
	
}