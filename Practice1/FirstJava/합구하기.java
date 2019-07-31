import java.util.Scanner;

public class 합구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int hap = 0;

		if (a < b) {
			for (int i = a; i <= b; i++) {
				hap = hap + i;
			}
			System.out.println(hap);
		} else
		{
			for (int i = b; i <= a; i++) {
				hap = hap + i;
			}
		System.out.println(hap);
		}
	}

}
