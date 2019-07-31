package CH5;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		int n = 0;
		
		int[] scorearray = new int[1000]; // 배열의 크기가 정해지지 않았을때?
		double avg = 0;

		for (int i = 0; i < C; i++) {// 텍스트 케이스의 갯수 입력
			n = sc.nextInt();
			int total = 0;
			int count = 0;
			for (int j = 0; j < n; j++) {
				scorearray[j] = sc.nextInt(); // 점수를 배열로 저장
				total += scorearray[j];
			}
			avg = (double) total / n; // 평균값 구함
			for (int j = 0; j < n; j++) { // 학생의 수만큼 점수 입력
				if (avg < scorearray[j]) // 평균과 성적 비교
				{
					count = count + 1;
				}

			

			}
		

			System.out.printf("%.3f", 100.0 * count / n);
			System.out.println("%");
		}

	}

}
