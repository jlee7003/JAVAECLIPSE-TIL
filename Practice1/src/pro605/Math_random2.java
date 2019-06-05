public class Math_Random2
{
	public static void main(String[] args)
	{
		int[] arr=new int[3];
		int tmp; // 임시로 사용할 변수(교환시)

		for(int i=0;i<arr.length;i++)
			arr[i]=(int)(Math.random()*45)+1;
		
		
		if(arr[0]>arr[1])
		{
			tmp=arr[0];
			arr[0]=arr[1];
			arr[1]=tmp;
		}
		if(arr[0]>arr[2])
		{
			tmp=arr[0];
			arr[0]=arr[2];
			arr[2]=tmp;
		}
		if(arr[1]>arr[2])
		{
			tmp=arr[1];
			arr[1]=arr[2];
			arr[2]=tmp;
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}
