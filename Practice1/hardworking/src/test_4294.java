import java.util.Scanner;
public class test_4294 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		int[] lot=new int[sc.nextInt()]; //3층 짜리 아파트 => 아파트의 범위정하기
		 for(int i=0;i<=4;i++) //반복문 
		 {
	      lot[i]=(int)(Math.random()*45)+1; //i층 짜리 아파트에 넣을 값
		 
	      
	      System.out.println(lot[i]);
		 }
		
	}

}
