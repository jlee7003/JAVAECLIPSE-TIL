import java.util.Scanner;
public class test_429 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		// 배열: 변수의 연속적인 집합
		// 대표이름으로 접근하고 인덱스번호로 구분
		
		//배열 만드는법
		//1. 배열에 들어갈 값이 정해져 있는 경우
		// 자료형[] 배열명= {값,값,값,값};
		int[] kor = {80,90,70,60,50}; //선언
		
		//2. 값이 정해져 있지 않을 경우
		int[] eng =new int[5]; // 할당
		
		//int a=30;
		//a=a+100;
		//System.out.println(a);
		

		kor[3]=kor[3]+100;
		System.out.println(kor[3]);
		
		//배열을 만들면 초기값으로 0이 자동생성
		System.out.println(kor[2]);
	
	}

}
