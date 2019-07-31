import java.util.Scanner;

public class 비율구하기 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double avg=0;
		int pernum=0;
		int hap=0;
		double per=0;
		int array[]=new int[] {10,20,20,10};
		for(int i=0;i<array.length;i++)
		{
			hap+=array[i];
			
		}
		
		for(int i=0;i<array.length;i++)
		{
			
			avg=(double)hap / 4;
			if(avg>array[i])
			{
				pernum=pernum+1;
			}
			
		}
		
		per= (double) pernum / array.length * 100;
		System.out.println(per);
		
	}

}
