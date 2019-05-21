
public class date515_3 
{

	public static void main(String[] args) 
	{
		int arr[][]=new int[6][6];
		int n=1;
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				arr[i][j]=n;
				n=n+1;
			}
		}
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}

}
