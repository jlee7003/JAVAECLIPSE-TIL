package date520;

public class date520_1 
{
   //�Ӽ� : ����
	int n;
	int total;
	
  //������ : ���
  //Ŭ���� ���� �Ӽ��� �ʱⰪ�� �ִ� ��
	
	
  //�޼ҵ� : ���
	date520_1()
	{
		n=88;
	}
	public void input()
	{
		n=99;
	}
	
	public void cal()
	{
		for(int i=1;i<=n;i++)
		{
			total=total+i;
		}
	}
	
	public void chul()
	{
		 System.out.println(total);
	}
}
