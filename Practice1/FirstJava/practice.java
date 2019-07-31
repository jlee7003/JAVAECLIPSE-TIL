import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();

		int line = 0;
		int cnt = 0;
		while(cnt<a)
		{
			line ++; // 줄 항의 갯수
			cnt =line * (line+1)/2; //각 줄의 항(줄의 합)
		}
		
		if(line%2 != 0) //홀수 일 경우
		{
			int top = 1+(cnt-a);
			int bottom = line - (cnt-a);
			System.out.println(top+"/"+bottom);
		}
		else { //짝수의 경우
			int top = line - (cnt - a);
			int bottom = 1+ (cnt - a);
			System.out.println(top+"/"+bottom);
		}

	}
}
