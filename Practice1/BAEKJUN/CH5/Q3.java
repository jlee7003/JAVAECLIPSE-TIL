package CH5;
import java.util.Scanner;

public class Q3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int melody[] =new int[8];
		
		
		for(int i=0;i<melody.length;i++)
		{
			melody[i]=sc.nextInt();
		}
		sc.close();
		String aaa = "";
		for(int i=0; i< melody.length-1;i++)
		{
		if(melody[i]==melody[i+1]-1)
		{
			aaa="ascending";
		}
		else if(melody[i]==melody[i+1]+1)
		{
			aaa="descending";
		}
	    else
		{
	    	aaa="mixed";
	    	
		}
		}
		System.out.print(aaa);
	
		
	
	}
}
