
public class date509_15
{
	//15. 1���� 100������ (4�� ����� ��)-(6�� �������) �� ���Ͻÿ�.

	
	int num4=0;
	int num6=0;
	public void sum()
	{
		for(int i=0;i<=100;i++)
		{
		   if(i%4==0)
		   {
			  num4=num4+i;
		   }
		   if(i%6==0)
		   {
			  num6=num6+i;
		   }
		}
		
		System.out.print(num4-num6);
	}

}
