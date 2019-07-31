package CH6;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int f=1;
		
		for(int i=1; i<=N; i++) {
			f=f*i;
		}
		
		
		System.out.println(f);
	}

}
