
public class date509_21 
{
	//21. lotto��� �������̰� ũ�Ⱑ 6�� �迭�� ����� 
   // Math.random()�� �̿��Ͽ� 1~45������ ������ ���� �����ÿ�.
	
	int lotto[]=new int[6];
	
	public void input()
	{
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1; //Math.random�� 0���� 1������ �� * 45 
			                                     // =0~44
			                                     // (int)(0~44)-> �Ǽ��� �� ����
		}
		
	}
	public void output()
	{
	
		for(int i=0;i<lotto.length;i++)
		{
		System.out.print(lotto[i]+" ");
		}
	}
}