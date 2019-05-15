import java.util.Scanner;

public class date515_2
{

	public static void main(String[] args)
	{
     int sung[][]=new int[5][3];
     int sum=0;
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

	
	for(int i=0;i<5;i++)
	  {
		for(int j=0;j<3;j++)
		{
	  System.out.printf("%4d",sung[i][j]);
		}
		System.out.println();
	  }
	
	
	}
}
