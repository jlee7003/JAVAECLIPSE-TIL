
public class test4_1
{
	public static void main(String[] args) 
	{
		int sum=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0) //else�� ���� if ���ǹ� ������ ������Ű�� ��������쿡�� ������ �ȵ�
 			{
				sum= sum+i;
			}
		}
		System.out.println(sum);
	}
	
}
