
public class Array5x5
{
	public static void main(String[] args) 
	{
	    int[][] pkc=new int[5][5];
	    int n=1;
	    for(int i=0;i<5;i++)
	    {
	      for(int j=0;j<5;j++)
	      {
	    	  pkc[i][j]=n;
	    	  n=n+1;
	      }
        }
	    
	    for(int i=0;i<5;i++)
	    {
	      for(int j=0;j<5;j++)
	      {
	    	 System.out.printf("%3d",pkc[i][j]);
	      }
	      System.out.println();
        }
	}
}
