
public class son2 extends parent_접근제한자 
{
	//상속 받은 클래스의 속성, 메소드가 
	// 여기 있는 것처럼 된다.
	int a;
	int b;
	son2(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public void total()
	{
		int hap=0;
		for(int i=a;i<=b;i++)
		{
		hap=hap+i;
		}
		System.out.println("합 :"+hap);
	}
}
