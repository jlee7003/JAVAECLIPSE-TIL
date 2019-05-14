
public class test_4302 
{

	public static void main(String[] args)
	{
		int lot[]=new int[6];
		
		for(int i=0;i<lot.length;i++)
		{
			lot[i]=(int)(Math.random()*45)+1;
			
			if(lot[0] == lot[1])
			{
				lot[1]=lot[0]-1;
			}
		}

	}

}
