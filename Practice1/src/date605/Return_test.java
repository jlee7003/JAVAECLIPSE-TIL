package date605;

public class Return_test 
{

	public void aaa(int a,int b)
	{
		if(a>b)
			System.out.println("첫번째 값이 크다.");
		else
			System.out.println("두번째 값이 크다.");
	}
	
	public int bbb(int a, int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}         
	
	public static void main(String[] args)
	{
		 Return_test rt=new Return_test();
		 rt.aaa(90,10);
		 //90,100중에 어떤 값이 큰지 알수 있음?
		 System.out.println(rt.bbb(88, 99));
		 //리턴 값이 있는 함수는 바로 출력 가능
		 rt.bbb(88, 99);
         //리턴 값이 있는 함수는 변수에 저장할 수 있다.
		 //리턴 값이 없으면 변수에 담을 수 없고 출력도 불가하다.
	}

}
