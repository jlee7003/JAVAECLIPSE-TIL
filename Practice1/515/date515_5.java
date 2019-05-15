
public class date515_5
{

	public static void main(String[] args)
	{
		int arr[][]=new int[4][8];
		int n=1;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<8;j++)
			{
				arr[i][j]=n;
				n=n+1;
					
			}
			
		}

		for(int i=0;i<4;i++)
		{
			for(int j=0;j<8;j++)
			{
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}

}
