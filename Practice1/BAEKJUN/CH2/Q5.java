package CH2;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>=b && a>=c && b>=c) {
			System.out.println(b);
		}
		else if(a>=b && a>=c && c>=b) {
			System.out.println(c);
		}
		else if(b>=a && b>=c && a<=c) {
			System.out.println(c);
		}
		else if(b>=a && b>=c && a>=c) {
			System.out.println(a);
		}
		else if(c>=b && c>=a && b<=a) {
			System.out.println(a);
		}
		else if(c>=b && c>=a && b>=a) {
			System.out.println(b);
		}
	
		
		
	}

}
