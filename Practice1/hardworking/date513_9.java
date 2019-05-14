import java.util.Scanner;

public class date513_9 
{

	
	int kor;
	int eng;
	int mat;
	int hap;
	
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
		
		
	}
	
	public int stand() //모든 함수는 상대방 함수를 부를수 있다. 
	                   //단 메인 함수 호출은 불가능
	                   //함수 안에는 함수도 호출하여 실행 가능
	{
		hap=kor+eng+mat;
		System.out.println(hap);
		
		return hap; //함수의 값을 변수에 저장 할수 있게 하는 명령어
	}
}
