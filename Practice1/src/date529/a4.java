package date529;
import java.util.Scanner;
public class a4 
{
	Scanner sc= new Scanner(System.in);
	
	public void chul()
	{
		  
		  int tot=0;
		  for(int i=1;i<=100;i++)
		  {
			  tot=tot+i;
		  }
		  
		  System.out.println("гу : "+ tot);
	}
	public void chul(int b)
	{
		  
		  
		  
		  int tot=0;
		  for(int i=1;i<=b;i++)
		  {
			  tot=tot+i;
		  }
		  
		  System.out.println("гу : "+ tot);
	}
	public void chul(int a,int b)
	{
		  

		  int tot=0;
		  for(int i=a;i<=b;i++)
		  {
			  tot=tot+i;
		  }
		  
		  System.out.println("гу : "+ tot);
	}
}
