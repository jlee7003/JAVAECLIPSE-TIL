import java.util.Arrays;

public class Arrays_Sort
{
	public static void main(String[] args) 
	{
        int[] lotto=new int[6];
		
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
		}
		
		Arrays.sort(lotto); //배열 정렬 메소드
		
		for(int i=0;i<lotto.length;i++)
		{
			System.out.println(lotto[i]);
		}
	}
}










