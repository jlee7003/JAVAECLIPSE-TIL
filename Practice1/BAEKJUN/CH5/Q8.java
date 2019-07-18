package CH5;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
      int n[]=new int[a];
    int b=0;
    int c=0;
      for(int i=0;i<a;i++)
      {    n[i]=sc.nextInt();//배열[a]만큼 수를 입력 받음
         if( n[i]>n[0])
         {
        	 b=n[i];
        	 
         }
         
         if( n[i]<n[0])
         {
        	 c=n[i];
        	 
         }
         
      }
      System.out.print(c+" ");
      System.out.print(b);
      
	}

}
