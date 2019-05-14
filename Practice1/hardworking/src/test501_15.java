
public class test501_15 
{

	public static void main(String[] args) 
	{
		int num4=0;
		int num6=0;
		
	for(int i=0;i<=100;i++)
	{
		if(i%4==0)
	num4= num4+i;
	}
	
	for(int i=0;i<=100;i++)
	{
		if(i%6==0)
	num6= num6+i;
	}
	
	System.out.println(num4-num6);

	}
	
}
