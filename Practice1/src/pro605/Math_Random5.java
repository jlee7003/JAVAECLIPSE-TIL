public class Math_Random5 
{
	public static void main(String[] args)
	{
		int[] arr=new int[6];
		int tmp; // 임시로 사용할 변수(교환시)

		for(int i=0;i<arr.length;i++)
			arr[i]=(int)(Math.random()*45)+1;
		
		for(int i=0;i<=4;i++)
		{
			 for(int j=i+1;j<=5;j++)
		     {
					if(arr[i]>arr[j])
					{
						tmp=arr[i];
						arr[i]=arr[j];
						arr[j]=tmp;
					}
		     }
		}
	 
		for(int k=0;k<arr.length;k++)
			System.out.print(arr[k]+" ");
	}
}
