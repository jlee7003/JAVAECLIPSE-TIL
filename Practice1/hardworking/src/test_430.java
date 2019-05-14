
public class test_430 
{

	public static void main(String[] args)
	{
		int lot[]=new int[6];
		
		System.out.println("추첨된 6개의 번호는");
		for(int i=0;i<=5;i++) // arr.length = arr 배열의 크기
		{
			lot[i]=(int)(Math.random()*45)+1;
			System.out.print(lot[i] + " ");
		}
		System.out.println("입니다.");
	}

}
