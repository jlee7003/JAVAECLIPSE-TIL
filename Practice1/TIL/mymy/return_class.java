import java.util.Scanner;


// 메소드 오버로딩
public class return_class {
	/*
	 * public static void main(String[] args) { Scanner sc=new Scanner(System.in);
	 * return_class ac=new return_class(); String n=ac.random();
	 * System.out.println(n); } public static String random() //리턴 값의 자료형을 적어주어야 함 {
	 * String tot = "";
	 * 
	 * for(int i=1;i<=6;i++) { int lotto=(int)(Math.random()*45)+1;
	 * tot=tot+lotto+" "; } return tot; //지역변수 함수가 종료되면 사라짐 그러므로 리턴해주어야함 }
	 */
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		return_class ac=new return_class();
		int[] lot=ac.random();
		for(int i=0;i<6;i++)
		System.out.println(lot[i]);
	}
	public int[] random() //리턴 값의 자료형을 적어주어야 함
	{
		int[] lot=new int[6];
		for(int i=0;i<6;i++)
	{
		lot[i]=(int)(Math.random()*45)+1;
	
	}
	return lot; //지역변수 함수가 종료되면 사라짐 그러므로 리턴해주어야함
	}


}
