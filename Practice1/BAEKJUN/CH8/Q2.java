package CH8;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = 0;// N을 입력 받고
		int M = 0;// N을 입력 받고
		boolean[] suger = new boolean[5050];
		int array3[] = new int[5000];
	
		
		
	
		for(int j=1;M<5000;j++) {
			M=j*5;
			N=j*3;
			for (int i = 1; i < 5000; ++i) {
				suger[N%3+M%5]=true;
				suger[N]=true;
				suger[M]=true;
				if(suger[i]) {
					System.out.println(i);
				}
		}
	
		}
	}
	
}
