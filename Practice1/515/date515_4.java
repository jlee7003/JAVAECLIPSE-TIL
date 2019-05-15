
public class date515_4 
{

	public static void main(String[] args) 
	{
		int arr[][]=new int[7][3];
		int n=1;
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=n;
				n=n+1;
			}
		}
		
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}

	}

}
