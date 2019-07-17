package CH4;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = N;
		int q = 0;
		int hap = 0;
		do {
			hap = (N / 10) + (N % 10);
			N = (N % 10 * 10) + hap % 10;
			q++;
		} while (N != X);

		System.out.println(q);

	}
}
