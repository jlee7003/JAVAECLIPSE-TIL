package date605;

public class Return_test 
{

	public void aaa(int a,int b)
	{
		if(a>b)
			System.out.println("ù��° ���� ũ��.");
		else
			System.out.println("�ι�° ���� ũ��.");
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
		 //90,100�߿� � ���� ū�� �˼� ����?
		 System.out.println(rt.bbb(88, 99));
		 //���� ���� �ִ� �Լ��� �ٷ� ��� ����
		 rt.bbb(88, 99);
         //���� ���� �ִ� �Լ��� ������ ������ �� �ִ�.
		 //���� ���� ������ ������ ���� �� ���� ��µ� �Ұ��ϴ�.
	}

}
