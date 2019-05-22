import java.util.Scanner;

public class Sungjuk 
{
	public static void main(String[] args) 
	{
		int[][] sung=new int[5][3];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sung[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<3;i++)
		{
			sung[3][i]=sung[0][i]+sung[1][i]+sung[2][i];
			sung[4][i]=sung[3][i]/3;
		}
		
		/*
		sung[3][0]=sung[0][0]+sung[1][0]+sung[2][0];
		sung[4][0]=sung[3][0]/3;
		
		sung[3][1]=sung[0][1]+sung[1][1]+sung[2][1];
		sung[4][1]=sung[3][1]/3;

		sung[3][2]=sung[0][2]+sung[1][2]+sung[2][2];
		sung[4][2]=sung[3][2]/3;
		*/
		for(int i=0;i<5;i++)
	    {
	      for(int j=0;j<3;j++)
	      {
	    	 System.out.printf("%3d",sung[i][j]);
	      }
	      System.out.println();
        }
	}
}
