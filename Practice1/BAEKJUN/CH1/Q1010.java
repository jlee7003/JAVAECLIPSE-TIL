package CH1;
import java.util.Scanner;
public class Q1010 {

	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		String bbb=sc.next();
		String b[] =bbb.split("");
		int b0 = Integer.parseInt(b[0]);
		int b1 = Integer.parseInt(b[1]);
		int b2 = Integer.parseInt(b[2]);
		System.out.println(a*b2);
		System.out.println(a*b1);
		System.out.println(a*b0);
		System.out.println((a*b2)+((a*b1)*10)+(a*b0*100));
	}

}
