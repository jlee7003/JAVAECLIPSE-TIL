package date605;

public class Math_random2 
{

	public static void main(String[] args) 
	{
			int[] arr=new int[3];
			int tmp;
			
			for(int j=0;j<arr.length;j++)
			{
				 arr[j]=(int)(Math.random()*45)+1;
			
			  
			
		
			for(int i=0;i<=j-1;i++)
			{
				if(arr[i]>arr[j])
				{
					j=j-1;
				}
				
			}
			
			
		}

	

		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+" ");
		}
	  
	}
}
