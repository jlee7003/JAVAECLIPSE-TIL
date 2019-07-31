
public class Array_two {
	public static void main(String[] args) {
		// 2차원 배열의 선언과 할당
		// 2차원배열 선언, 행과 열이 존재한다.

		// new 연산자를 통한 배열의 생성

		int[][] arr = new int[5][5]; // 5행 5열의 배열 생성
		int num = 0;

		/*
		 * //선언과 생성을 같이 int[][] lot=new int[5][5];
		 * 
		 * //선언과 초기화 int[] test= {1,2,3};
		 * 
		 * int[][] test2=
		 * {{1,2,3,4,5},{5,6,7,8,9},{10,11,12,13,14},{15,16,17,18,19},{20,21,22,23,24}};
		 * 
		 * for(int i=0;i<5;i++) { for(int j=0;j<5;j++) {
		 * System.out.print(test2[i][j]+" "); } System.out.println(); }
		 */

		for (int i = 0; i < arr.length; i++) { //행
			if (i % 2 == 0) { //행이 짝수일 경우
				for (int j = 0; j < 5; j++) {
					num += 1;
					arr[i][j] = num;

				}
			}
			else {  //행이 홀수 일 경우  역순으로
				for (int j = 4; j >= 0; j--) { //열
					num += 1;
					arr[i][j] = num;

				}
			}

		}

		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++) 
			{
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}

	}
}
