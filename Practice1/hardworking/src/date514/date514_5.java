package src.date514;

public class date514_5 
{

	public static void main(String[] args) 
	{
		int arr[]=new int[6];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*6)+1;
		}

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
