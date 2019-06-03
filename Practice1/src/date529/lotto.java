package date529;

public class lotto
{
	public void cal() 
	{
		
	   int lot[]=new int[6];
		
		for(int i=0;i<lot.length;i++)
		{
			lot[i]=(int)(Math.random()*45)+1;
		}
		
		for(int i=0;i<lot.length;i++)
		System.out.println(lot[i]);
		
	}
}
