package CH5;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double n[] = new double[a];
		double max = n[0];
		double m[] = new double[a];
		double avg = 0;
		for (int i = 0; i < a; i++) {
			n[i] = sc.nextInt();// 배열[a]만큼 수를 입력 받음

		}
		for (double q : n) {
			if (max < q) {
				max = q;

			}

		}
		for (int i = 0; i < a; i++)// m=점수/최댓값*100
		{
			m[i] = ((n[i] / max) * 100) / a;

		}
		for (int i = 0; i < m.length; i++) {
			avg = avg + m[i];

		}

		System.out.println(avg);
	}

}
