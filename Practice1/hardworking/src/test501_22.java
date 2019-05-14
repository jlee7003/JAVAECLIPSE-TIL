
public class test501_22
{

	public static void main(String[] args)
	{
		int test[]=new int[10];
		
		System.out.println("추첨된 6개의 번호는");
		for(int i=0;i<=5;i++) // arr.length = arr 배열의 크기
		{
			test[i]=(int)(Math.random()*10)+1;
			System.out.print(test[i] + " ");
		}
		System.out.println("입니다.");
	}

}
