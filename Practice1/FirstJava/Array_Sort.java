public class Array_Sort
{
	public static void main(String[] args) 
	{
		int[] lotto=new int[4];
		
		for(int i=0;i<4;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
		}
		// �迭�� �ִ� ���� ���������� ����
		int temp; // ���� ��ȯ�ϱ� ���� �ӽ� �������
		// �ε��� 0������ =>  0>1 , 0>2 , 0>3
		if(lotto[0] > lotto[1])
		{
			temp=lotto[1];
			lotto[1]=lotto[0];
			lotto[0]=temp;
		}
		if(lotto[0] > lotto[2])
		{
			temp=lotto[2];
			lotto[2]=lotto[0];
			lotto[0]=temp;
		}
		if(lotto[0] > lotto[3])
		{
			temp=lotto[3];
			lotto[3]=lotto[0];
			lotto[0]=temp;
		}
		// �ε��� 1������ =>  1>2 , 1>3
		if(lotto[1] > lotto[2])
		{
			temp=lotto[2];
			lotto[2]=lotto[1];
			lotto[1]=temp;
		}
		if(lotto[1] > lotto[3])
		{
			temp=lotto[3];
			lotto[3]=lotto[1];
			lotto[1]=temp;
		}
		// �ε��� 2�� ���� => 2>3
		if(lotto[2] > lotto[3])
		{
			temp=lotto[3];
			lotto[3]=lotto[2];
			lotto[2]=temp;
		}
		for(int i=0;i<4;i++)
		{
			System.out.println(lotto[i]);
		}
	}
}










