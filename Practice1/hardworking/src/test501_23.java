
public class test501_23
{

	public static void main(String[] args)
	{
		int pkc[]=new int[10];
		int num=0;
		System.out.println("추첨된 6개의 번호는");
		for(int i=0;i<pkc.length;i++) // arr.length = arr 배열의 크기
		{
			pkc[i]=(int)(Math.random()*110)+1;
			
			for(int j=0;j<=i;j++)
			{
				if( pkc[i] < 100)
					i=i-1;
			}
		}
		for(int i=0;i<pkc.length;i++)
		System.out.print(pkc[i]+" ");
	}

}
