import java.util.*;

public class practice_class {
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		String[] array=new String[a];
		int pull=0; //짝수면 5 홀수면 1
		int wait=0;
		int deadguys=0;
		String input=sc.next();
		
		array=input.split("");
	
		
		for(int i=0;i<array.length;i++)
		{
				
			if(array[i].equals("w")) {
				wait++;
			}
			else if(array[i].equals("p")) {
				pull++;
				if(pull%2==0)
				{
					deadguys=5;
				}
				else
				{
					deadguys=1;
				}
			}
			if(wait<3)
			{
				deadguys=0;
			}
			else {
				deadguys=5;
			}
			if(wait==2 && pull>0)
			{
				deadguys=6;
			}
			if(pull%2!=0)
			{
				deadguys=1;
			}
			
			
		}
	
		System.out.println(deadguys);
		
	}
	
}