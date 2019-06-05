public class Return_Test
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
	    Return_Test rt=new Return_Test();
	    rt.aaa(90, 100);
	    //System.out.println(rt.aaa(90, 100));
	   // int n=rt.aaa(90, 100);
	    // 90,100중에 어떤것이 큰지 알수있나요?
	    System.out.println(rt.bbb(88, 99)); 
	    // 리턴값이 있는 함수는 바로 출력해서 사용할수 잇다.
	    int m=rt.bbb(88, 99);
	    // 리턴값이 있는 함수는 변수에 저장할수 있다..
	}
}
