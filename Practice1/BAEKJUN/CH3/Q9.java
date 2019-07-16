package CH3;
import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1; i<=a; i++) 
		{
			System.out.println("*");
		
			if(i!=a)
			{
			for( int j = 1; j<=i; j++)
			{
				System.out.print("*");
				
			}
			}
			else
				System.out.print("");
	      /*
	      
	      
	      import java.util.Scanner;

public class 별찍기쉽게 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			
			System.out.println("");
		
			for (int j = 0; j <i; j++) {
				
				System.out.print("*");
				

			}
		}
	}
}
	      
	      
	      
	      */
		
		}
	}
}
