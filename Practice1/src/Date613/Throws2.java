package Date613;

public class Throws2
{
	public void chul() throws ArithmeticException// 멤버메소드
	{
		int result=100/0; // 예외처리하기 싫어요!!
	}

	public static void main(String[] args)
	{
		// chul(); // static메소드 내에서는 static만 접근가능
		Throws2 th=new Throws2();
		try
		{
		  th.chul();
		}
		catch(ArithmeticException e)
		{
			System.out.println("호출한곳에서 예외처리");
		}
		System.out.println("함수호출뒤에 실행될 문장");
	}
}
