public class Return_Test
{
	public void aaa(int a, int b) // return X
	{
		if(a>b)
			System.out.println("ù��° ���� ũ��");
		else
		    System.out.println("�ι�° ���� ũ��");
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
	    // 90,100�߿� ����� ū�� �˼��ֳ���?
	    System.out.println(rt.bbb(88, 99)); 
	    // ���ϰ��� �ִ� �Լ��� �ٷ� ����ؼ� ����Ҽ� �մ�.
	    int m=rt.bbb(88, 99);
	    // ���ϰ��� �ִ� �Լ��� ������ �����Ҽ� �ִ�..
	}
}
