
public class test501_21 
{

	public static void main(String[] args)
	{
		int lotto[]=new int[6];
		
		System.out.println("추첨된 6개의 번호는");
		for(int i=0;i<=5;i++) // arr.length = arr 배열의 크기
		{
			lotto[i]=(int)(Math.random()*45)+1;
			System.out.print(lotto[i] + " ");
		}
		System.out.println("입니다.");
	}

}
