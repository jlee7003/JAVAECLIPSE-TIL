package datr516;

public class date516_1
{
   int start;
   int end;
   int sum;
	
	date516_1(int a,int b)//������
	{
		int sum=0;
		for(int i=a;i<=b;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
	
	
	
	public void output(int a,int b) //�޼ҵ�
	{
		for(int i=a;i<=b;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	
    }
	
}
