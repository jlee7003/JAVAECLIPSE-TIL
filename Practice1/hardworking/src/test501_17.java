import java.util.Scanner;
public class test501_17
{

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		
	    int aa;
	    aa=sc.nextInt();
	    int ss;
	    ss=sc.nextInt();
    
		int num=0;
		
		for(int i=aa;i<=ss;i++)
		{
		num= num+i;
		}
		
		System.out.println(num);
    
   
	}

}
