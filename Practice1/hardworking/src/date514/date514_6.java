package src.date514;

public class date514_6 
{

	public static void main(String[] args) 
	{
		int arr[]=new int[6];
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*6)+1;
            sum=sum+arr[i];
            
		}

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			
		}
		System.out.print("  гу : "+sum);
	}

}
