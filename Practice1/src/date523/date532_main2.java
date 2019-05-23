package date523;

public class date532_main2 
{

	public static void main(String[] args)
	{
		date523_3 aa=new date523_3 ();
		
		aa.aa();
		//상속을 받았어도 부모의 생성자가 자식의 생손자 보다 우선 실행이 됨
		
		// -생성자
		//클래스를 객체화 new 연산자를 통해 생성자 실행
		//  -> 클래스 aa=new 클래스();
		
		// 상속: 자식클래스를 객체화
		// 부모 생성자 실행후 자식 생성자를 실행 (무조건)
		//-> 그러므로 생성자의 매게변수에 이상이 생김
	}

}
