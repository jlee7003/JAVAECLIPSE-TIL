package Date617;
import java.util.Scanner;
public class while_619 
{

	public static void main(String[] args) 
	{
		int ch2=0;
		/*int ch1=0;
		int ch2=0;
	 while(ch1!=0)//조건에 따라 실행
	 {
		 System.out.println("while");
	 }
	 */
	 Scanner sc=new Scanner(System.in);
	 do //먼저 실행후 뒤에 조건을 검색함,무조건 실행후 조건을 검색
	 {
		 System.out.println("1. 회원출력하기");
		 System.out.println("2. 회원입력하기");
		 System.out.println("3. 종료하기");
		 
		 System.out.print("입력 :");
		 ch2=sc.nextInt();
		 
		 switch(ch2)
		 {
		 case 1://출력메소드 실행
		 case 2://입력 메소드 실행
		 }
	 }while(ch2!=3);//3을 누르면 종료됨 ,3이 아니라면 무한 반복

	 
	}

}
