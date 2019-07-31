import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		//키보드로 5가 들어오면 종료
		do {
			System.out.println("안녕하세요1");
			System.out.println("안녕하세요2");
			System.out.println("안녕하세요3");
			System.out.println("안녕하세요4");
			System.out.println("안녕하세요5");
			a=sc.nextInt(); //매뉴를 보여주고 입력을 받아야함
			switch(a)
			{
			case 1: System.out.println("그래");
			}
			
			
		
		}
		while(a!=5);
		System.out.println("종료");
		
	}

}
