
public class lot�ߺ�������
{

	int lot[]=new int[6];
	
	public void lotto()
	{
		for(int i=0;i<lot.length;i++)// for�� �ȿ��� ���� ������ ��� �� �� ����.
		{
			lot[i]=(int)(Math.random()*45)+1;
			
			for(int j=0;j<=i-1;j++)
			{
				if(lot[j]==lot[i])
				{
					i=i-1;
				}
				
			}
			
			
		}
		
		for(int i=0;i<lot.length;i++)
		{
			System.out.print(lot[i]+" ");
		}
	}
	
}
