package CH5;
import java.util.Scanner;

public class Q2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] =new int[9];
		int max=num[0];
		int q=0;
		for(int i=0;i<9;i++)
		{
		 num[i] =sc.nextInt();
		
		
		
		for(int j:num) 
		{
			if(max < j)
			{
				q=i+1;
				max=j;
			}
		}
		}
		
		System.out.println(max);
	    System.out.println(q);
	}
}
