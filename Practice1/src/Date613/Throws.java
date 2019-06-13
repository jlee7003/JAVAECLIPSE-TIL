package Date613;

public class Throws
{
	public void chul() // 멤버메소드
	{
	   try
	   {
		int result=100/0;
	   }
	   catch(ArithmeticException e)
	   {
		   System.out.println("예외발생");
	   }
	}

	public static void main(String[] args)
	{
		// chul(); // static메소드 내에서는 static만 접근가능
		Throws th=new Throws();
		th.chul();
		System.out.println("함수호출뒤에 실행될 문장");
	}

}
