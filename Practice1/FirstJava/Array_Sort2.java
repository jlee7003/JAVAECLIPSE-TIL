public class Array_Sort2 {
	public static void main(String[] args) 
	{
		int[] lotto=new int[6];
		
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
		}
		//----------------배열에 무작위수 4개 생성-------------------------------
		int temp; //배열을 교체할 때 쓸 변수

		for(int i=0;i<lotto.length-1;i++) 
		{// 조건은 비교할 기준값
		//i값은 기준값 (배열의 크기-2 까지만)	
			for(int j=i+1;j<=lotto.length-1;j++)
			{
				if(lotto[i] > lotto[j])
				{
					temp=lotto[j];
					lotto[j]=lotto[i];
					lotto[i]=temp;
				}
			}
		}
		
		for(int i=0;i<lotto.length;i++)
		{
			System.out.println(lotto[i]);
		}
		
	
	}
}
