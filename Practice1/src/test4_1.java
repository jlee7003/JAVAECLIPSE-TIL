
public class test4_1
{
	public static void main(String[] args) 
	{
		int sum=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0) //else가 없는 if 조건문 조건을 충족시키지 못했을경우에는 실행이 안됨
 			{
				sum= sum+i;
			}
		}
		System.out.println(sum);
	}
	
}
