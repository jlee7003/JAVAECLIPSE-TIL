package CH5;
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int tot=a*b*c;
		String total=Integer.toString(tot);
		String svalue[]=total.split("");
		int q0=0;
		int q1=0;
		int q2=0;
		int q3=0;
		int q4=0;
		int q5=0;
		int q6=0;
		int q7=0;
		int q8=0;
		int q9=0;
		for(String i:svalue)
		{
			if(i.equals("0"))
			{
				q0++;
				
			}
			if(i.equals("1"))
			{
				q1++;
			}
			if(i.equals("2"))
			{
				q2++;
			}
			if(i.equals("3"))
			{
				q3++;
			}
			if(i.equals("4"))
			{
				q4++;
			}
			if(i.equals("5"))
			{
				q5++;
			}
			if(i.equals("6"))
			{
				q6++;
			}
			if(i.equals("7"))
			{
				q7++;
			}
			if(i.equals("8"))
			{
				q8++;
			}
			if(i.equals("9"))
			{
				q9++;
			}
			
		}
		System.out.println(q0);
		System.out.println(q1);
		System.out.println(q2);
		System.out.println(q3);
		System.out.println(q4);
		System.out.println(q5);
		System.out.println(q6);
		System.out.println(q7);
		System.out.println(q8);
		System.out.println(q9);
	}
}