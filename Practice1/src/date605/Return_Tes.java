package date605;
public class Return_Tes
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
	    Return_Tes rt=new Return_Tes();
	    rt.aaa(90, 100);
	    System.out.print(rt.bbb(88, 99));
	}
}
