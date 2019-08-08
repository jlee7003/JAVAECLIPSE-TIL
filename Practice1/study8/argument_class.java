import java.util.Scanner;


// 메소드 오버로딩
public class argument_class {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		argument_class ac=new argument_class();
		ac.hap();
	
		ac.hap(a,b);
	}
	public void hap()
	{
		int hap=0;
		for(int i=1;i<=100;i++)
			hap=hap+i;
		System.out.println(hap);
	}
	public void hap(int m,int n) //매계변수는 하나 이상도 적을 수 있다. a~b 까지의 합
	{
		int hap=0;
		for(int i=m;i<=n;i++)
			hap=hap+i;
		System.out.println(hap);
	}

}
