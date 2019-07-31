package CH5;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int n, total, count; // n,total,count 선언
		double avg;
		int scores[] = new int[1000];// score 배열[1000] 만큼 선언

		for (int i = 0; i < c; ++i) { // c만큼의 값 만큼 반복
			n = sc.nextInt(); // n입력
			total = 0; // total 초기화
			count = 0;// count 초기화
			for (int j = 0; j < n; ++j) {// n까지 반복
				scores[j] = sc.nextInt(); // score를 n 만큼 입력
				total += scores[j]; // total=score의 합계
			}
			avg = (double) total / n; // 평균

			for (int j = 0; j < n; ++j) {
				if (scores[j] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f", 100.0 * count / n); // c 만큼 출력
			System.out.println("%");
		}
		sc.close();
	}
}