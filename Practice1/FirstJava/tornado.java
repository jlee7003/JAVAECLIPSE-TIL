
public class tornado {
	public static void main(String[] args) {

		int[][] arr = new int[5][5]; // 5행 5열의 배열 생성
		int num = 0;

		
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
