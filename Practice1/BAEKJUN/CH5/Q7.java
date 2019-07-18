package CH5;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		int result[] = new int[N];

		sc.nextLine();

		for (int i = 0; i < N; i++) {
			String tmp = sc.nextLine();
			int score = 0;

			for (int j = 0; j < tmp.length(); j++) {
				if (tmp.charAt(j) == 'O') {//tmp의 값을 j에 주겠다
					score++;
					result[i] += score;

				} else {
					score = 0;

				}
			}
		}
		for (int i = 0; i < N; i++)
			System.out.println(result[i]);
		sc.close();
	}

}
