package CH3;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=0;
		for(int i=1;i<10;i++)
		{
			b++;
			System.out.println( a+" * "+b+" = "+a * b);
		}
		
	}

}
