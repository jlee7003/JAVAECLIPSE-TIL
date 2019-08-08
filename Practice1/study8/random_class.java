import java.util.Scanner;


// 메소드 오버로딩
public class random_class {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		random_class ac=new random_class();
		ac.hap();
		ac.hap(b);
		ac.hap(a,b);
	}
	public void hap()
	{
		
	int lotto=(int)(Math.random()*45)+1;
		System.out.println(lotto);
	}
	
	random_class()
	{
		
	int lotto=(int)(Math.random()*45)+1;
		System.out.println(lotto);
	}
	
	public void hap(int n) //매계변수는 하나 이상도 적을 수 있다. 1~b 까지의 랜덤수
	{
		
	int lotto=(int)(Math.random()*n)+1;
		System.out.println(lotto);
	}
	
	random_class(int n) //매계변수는 하나 이상도 적을 수 있다. 1~b 까지의 랜덤수
	{
		
	int lotto=(int)(Math.random()*n)+1;
		System.out.println(lotto);
	}

	public void hap(int m,int n) //매계변수는 하나 이상도 적을 수 있다. a~b 까지의 랜덤수
	{
		int cap=n-m+1;
	int lotto=(int)(Math.random()*cap)+m;
		System.out.println(lotto);
	}

}
