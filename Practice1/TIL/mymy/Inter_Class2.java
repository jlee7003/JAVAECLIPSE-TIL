

interface Sungjuk{
	int gijun=60;
	int gijun2=70;
	public void check();

	default public void aaa()
	{
		System.out.println("실행");
	}
	public static void bbb()
	{
		System.out.println("정적메소드");
	}
	/*
	 * public void ccc() => 선언만 가능 (메소드의 기능구현) {
	 * 
	 * }
	 */
}

class pass_eng implements Sungjuk
{
	public void check() //gijun 값보다 작으면 불합격 
	{
		int kor=88;
		
		if(kor>= gijun) //70 점 기준
		{
			System.out.println("합격");
		}
		else
			System.out.println("불합격");
		
	}
}
public class Inter_Class2 implements Sungjuk
{
	public void check() //gijun 값보다 작으면 불합격 
	{
		int kor=88;
		
		if(kor>= gijun) //70 점 기준
		{
			System.out.println("합격");
		}
		else
			System.out.println("불합격");
		
	}
}
