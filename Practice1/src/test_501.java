
public class test_501 
{

	public static void main(String[] args)
	{
		//���� �����ϴ� ����=> ����, �迭
		//���� => �ϳ��� ���� �����ϴ� ����
        //�迭=> ������ ������ ���� ���� ����
		//     for���� ���� ����=> �ڵ� �ҽ��� ����ȭ
		
		//��� if,switch, for, while
		//�б⹮ => if(���ǽ�), switch(��)
		//�ݺ��� => for(���۰�;���ǽ�;������) �������� ���� 1���� ����
		int lot[]=new int[6];
		
		for(int i=0;i<lot.length;i++)
		{
			lot[i]=(int)(Math.random()*45)+1;
			
			for(int j=0;j<=i-1;j++)
			{
				if(lot[j]==lot[i])
					i=i-1;
			}
			
		}
		
		for(int i=0;i<lot.length;i++)
		{
			System.out.print(lot[i] + " ");
		}
	}

}
