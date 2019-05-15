
public class date515_main
{

	public static void main(String[] args)
	{
		int[][] arr=new int[5][5];
			
			for(int i=0;i<5;i++)
			{
	           for(int j=0;j<5;j++)
	           {
	        	 
	        	   arr[i][j]=j+i+i+i+i+i+1;
	        	   
	        	 
	        
	        	 
	           }
	           
			}

			
			for(int i=0;i<5;i++)
			{
				
	           for(int j=0;j<5;j++)
	           {
			System.out.printf("%3d",arr[i][j]);
	           }
	           System.out.println();
			}
	}

}
