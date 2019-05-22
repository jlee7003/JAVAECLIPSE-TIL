
public class Array 
{
  int[][] arr1=new int[5][5];
  int[][] arr2=new int[7][3];
  int[][] arr3=new int[4][8];
  
  public void input1()
  {  
	  int n=1;
	  for(int i=0;i<5;i++)
	  {
		  for(int j=0;j<5;j++)
		  {
			  arr1[i][j]=n;
		  	  n++;
		  }
	  }
		  
  }
  public void chul1()
  {
	  for(int i=0;i<5;i++)
	  {
		  for(int j=0;j<5;j++)
		  {
			 System.out.printf("%3d",arr1[i][j]);
		  }
		  System.out.println();
	  }
  }
  public void input2()
  {
	  int n=1;
	  for(int i=0;i<7;i++)
	  {
		  for(int j=0;j<3;j++)
		  {
			  arr2[i][j]=n;
		  	  n++;
		  }
	  }
  }
  public void chul2()
  {
	  for(int i=0;i<7;i++)
	  {
		  for(int j=0;j<3;j++)
		  {
			 System.out.printf("%3d",arr2[i][j]);
		  }
		  System.out.println();
	  }
  }
  public void input3()
  {
	  int n=1;
	  for(int i=0;i<4;i++)
	  {
		  for(int j=0;j<8;j++)
		  {
			  arr3[i][j]=n;
		  	  n++;
		  }
	  }
  }
  public void chul3()
  {
	  for(int i=0;i<4;i++)
	  {
		  for(int j=0;j<8;j++)
		  {
			 System.out.printf("%3d",arr3[i][j]);
		  }
		  System.out.println();
	  }
  }
}
