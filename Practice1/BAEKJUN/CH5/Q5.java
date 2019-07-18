package CH5;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int N = 10;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt() % 42;
		}

		for(int i=1;i<a.length;i++)
		{
			for(int j=i-1;j>=0;j--)//
			{
				if(a[i]==a[j])
				{
					N--;
					break;
				}
			}
		}
		 System.out.println(N);
		
	}
			
}
