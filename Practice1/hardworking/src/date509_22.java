
public class date509_22 
{

    //22. test��� �������̰� ũ�Ⱑ 10�� �迭�� �����
   // Math.random()�� �̿��Ͽ� 1~10������ ������ ���� �ְ� ����� �Ͻÿ�.

	int test[]=new int[10];
	
	public void input()
	{
		for(int i=0;i<test.length;i++)
		{
			test[i]=(int)(Math.random()*10)+1;
		}
		
	} 
	
	public void output()
	{	
		for(int i=0;i<test.length;i++)
		{
			System.out.print(test[i]+" ");
		}
	}
}
