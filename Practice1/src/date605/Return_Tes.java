package date605;
public class Return_Tes
{
	public void aaa(int a, int b) // return X
	{
		if(a>b)
			System.out.println("첫번째 값이 크다");
		else
		    System.out.println("두번째 값이 크다");
	}
	public int bbb(int a,int b)
	{
		if(a>b)
			 return a;
		else
			 return b;
		     
	}
	public static void main(String[] args) 
	{
	    Return_Tes rt=new Return_Tes();
	    rt.aaa(90, 100);
	    System.out.print(rt.bbb(88, 99));
	}
}
