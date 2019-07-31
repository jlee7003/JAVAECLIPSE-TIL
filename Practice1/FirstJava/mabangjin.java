import java.util.Scanner;

public class mabangjin {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[][] mabang = new int[a][a]; // 5행 5열의 배열 생성
		int x=0;
		int y=(a-1)/2;
		//1.시작은 첫번째행의 중앙부터
//		2.다음 숫자는 행-1,열+1의 위치
//		3.i(행)의 값이 -1이 될 경우 행의 값을 가장 끝으로 보냄 (4행으로 보냄)
//		4.j(열)의 값이 5가 될경우 열의 값을 0으로 변경
//		5.기존의 값이 존재할 경우 i는 +2 j는 -1
//		6.행과 열이 같이 초과했을 경우 i는 +2 j는 -1 
//
		
		for(int i=1;i<=a*a;i++)
		{
			mabang[x][y]=i;
			x-=1;
			y+=1;
			
			if(x==-1 && y==a)
			{
				x=x+2;
				y=y-1;
			}
			else if(x<0)
			{
				x=a-1;
			}
			else if(y==a)
			{
				y=0;
			}
			else if(mabang[x][y] != 0)
			{
				x=x+2;
				y=y-1;
			}
		
		}
	
		for (int i = 0; i < a; i++)
		{
			for (int j = 0; j < a; j++) 
			{
				System.out.print(mabang[i][j]+" ");
			}
			System.out.println();
		}

	}
	
	
}
