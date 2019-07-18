package CH5;
import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int a[] =new int[num];
		for(int i=0;i<a.length;i++)
		{
			int v=sc.nextInt();
			a[i]=v;
		}
		int max=a[0];
		int min=a[0];
		for(int j:a) {
			if(min > j)
			{
			  min=j;
			}if(max < j) {
			   max=j;
			}
		}
	System.out.print(min+" "+max);
	}
}
