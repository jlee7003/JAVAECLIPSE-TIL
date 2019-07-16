package CH3;
import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a-i; j++) {//a-1,a-2,a-3,a-4 만큼 공백 출력하기
		      	System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {//행 i의 갯수 만큼 * 출력하기
		      	System.out.print("*");
				
				
			}
			System.out.println(""); //행의 갯수 만큼 줄바꾸기
			
			
		}

	}
}
