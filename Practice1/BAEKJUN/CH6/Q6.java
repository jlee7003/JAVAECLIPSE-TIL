package CH6;

import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();//고정비용
		int B=sc.nextInt();//가변비용
		int C=sc.nextInt();//물건 단가
		int N=0;
		
				
		if(C<=B) { //물건 단가 < 가변비용
			System.out.println(-1);
		}
		else
		{
			while((C-B)*N<=A) {
				N=N+1;	
				System.out.println(N);
			}
		
		}
	}

}
