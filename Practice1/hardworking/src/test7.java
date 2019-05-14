import java.util.Scanner;
public class test7
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("나이별 음식 추천 프로그램 입니다.");
		System.out.print("자신의 나이를 입력하십시오 :");
		int aa=sc.nextInt();
		
		if(aa<10)
		 {
		 System.out.print("오류");
		 }
		
		
		
		else if(aa<=20)
		 {
	     System.out.print("10대 추천 메뉴 스파게티를 추천해드립니다.");
		 }
		
		
		
		else if(aa<=30)
		 {
	     System.out.print("20대 추천 메뉴 부대찌개를 추천해드립니다.");
		 }
		
		
		
		else if(aa<=40)
		 {
	     System.out.print("30대 추천 메뉴 불닭발를 추천해드립니다.");
		 }
		
		
		
		else if(aa<=50)
		 {
	     System.out.print("40대 추천 메뉴 참치회를 추천해드립니다.");
		 }
		
		
		
		else if(aa<=60)
		 {
	     System.out.print("50대 추천 메뉴 쭈꾸미불고기를 추천해드립니다.");
		 }
		
		
		
	    else
		{
	     System.out.print("오류");
		}
		
		

	}

}
