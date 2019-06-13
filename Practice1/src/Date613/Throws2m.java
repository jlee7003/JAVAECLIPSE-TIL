package Date613;

public class Throws2m 
{

	public void chul() throws ArithmeticException //멤버메소드 클래스 안에 있는 것들을 멤버라고 부름
	{
	     int result=100/0; //예외처리하기 싫어요		
	}
		
	public static void main(String[] args) //가족이 아님
	{
		// chul();//스태틱 안에는 스태틱만 사용가능하므로 오류
		          //static메소드 안에서는 static만 접근 가능 
		          //static ->객체 생성하지 앟아도 사용가능
		Throws2m th=new Throws2m();
		
		try
		{
			th.chul();
		}
		catch(ArithmeticException e)
		{
			System.out.println("예외발생");
		}
		
		System.out.println("함수 호출뒤 실행문장");
	}

}
