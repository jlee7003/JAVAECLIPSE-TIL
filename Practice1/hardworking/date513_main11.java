import java.util.Scanner;
public class date513_main11
{

	public static void main(String[] args) 
	{
		//배열의 크기가 5인 test라는 배열을 만든다.
        //배열의 저장공간에 1부터 5까지의 값을 입력한다.
		//배열에 들어있는 값을 순서대로 출력한다.
		Scanner sc=new Scanner(System.in);
		
		int test[]=new int[5];
		
		for(int i=0;i<test.length;i++)
		{
			test[i]=sc.nextInt();
		}
		
		for(int i=0;i<test.length;i++)
		{
			System.out.print(test[i]);
		}
	}

}
