class User_Exception extends Exception
{
	User_Exception()
	{
		super("사용자 예외가 발생1");
		//
	}
}
class Num_check
{
	int num;
	Num_check(int num)
	{
		this.num=num;
	}
	public void check() throws User_Exception {
		if(num <0 || num>100)
		{
			throw new User_Exception();
		}
	}
}

public class throw3 
{
	public static void main(String[] args)
	{
		Num_check t2 = new Num_check(-55);

		try
		{
			t2.check();
		}
		catch (User_Exception e)
		{
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		//throw는 여러번에 걸쳐서 해도 가능하다.

	}
}

