public class Array_Sort
{
	public static void main(String[] args) 
	{
		int[] lotto=new int[4];
		
		for(int i=0;i<4;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
		}
		// 배열에 있는 값을 낮은순으로 정렬
		int temp; // 값을 교환하기 위한 임시 저장공간
		// 인덱스 0번기준 =>  0>1 , 0>2 , 0>3
		if(lotto[0] > lotto[1])
		{
			temp=lotto[1];
			lotto[1]=lotto[0];
			lotto[0]=temp;
		}
		if(lotto[0] > lotto[2])
		{
			temp=lotto[2];
			lotto[2]=lotto[0];
			lotto[0]=temp;
		}
		if(lotto[0] > lotto[3])
		{
			temp=lotto[3];
			lotto[3]=lotto[0];
			lotto[0]=temp;
		}
		// 인덱스 1번기준 =>  1>2 , 1>3
		if(lotto[1] > lotto[2])
		{
			temp=lotto[2];
			lotto[2]=lotto[1];
			lotto[1]=temp;
		}
		if(lotto[1] > lotto[3])
		{
			temp=lotto[3];
			lotto[3]=lotto[1];
			lotto[1]=temp;
		}
		// 인덱스 2번 기준 => 2>3
		if(lotto[2] > lotto[3])
		{
			temp=lotto[3];
			lotto[3]=lotto[2];
			lotto[2]=temp;
		}
		for(int i=0;i<4;i++)
		{
			System.out.println(lotto[i]);
		}
	}
}










