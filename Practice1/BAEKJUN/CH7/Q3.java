package CH7;

import java.util.Scanner;

public class Q3 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		String ABC="abcdefghijklmnopqrstuvwxyz";
		String[] alphabet=ABC.split("");
		String S=sc.next();
		String s_array[]=S.split("");
		int d=s_array.length;
		for(int j=0;j<s_array.length;j++){
			System.out.println("");
		for(int i=0;i<alphabet.length;i++)
		{
			
				if(alphabet[i].equals(s_array[j])) {
					System.out.print("0"+" ");
					
				}
			
					
				if(!(alphabet.equals(s_array[j])))
				{
				System.out.print("-1");
				}
			
					
			}
			
		}
			
	}

}
