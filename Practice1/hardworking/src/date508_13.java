
public class date508_13
{
	//13. 1부터 100까지의 짝수의 합을 출력하시오.
	
	int num=0;
	public void sum()
	{
		for(int i=0;i<=100;i++)
		{
		   if(i%2==0)
		   {
			  num=num+i;
		   }
		}
		
		System.out.print(num);
	}

}
