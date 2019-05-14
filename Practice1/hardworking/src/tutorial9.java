
public class tutorial9 
{
	public static int function(int a,int b,int c) { //반환형, 함수 이름, 매게변수=함수가 어떠한 값을 처리 할때  고정적으로 주어지는 값 
		int min;
		if(a > b)
		{
			if(b > c)
			{
				min=c;
			}
			else
			{
				min=b;
			}
		}
		else
		{
			if(a > c)
			{
				min=c;
			}
			else
			{
				min=a;
			}
		for(int i=min;i > 0; i--)
		{
			if(a % i==0 && b % i==0 && c % i==0)
			{
				return i;
			}
		}
		}
		
		return 1; //함수 = 메소드
	}

	public static void main(String[] args)
	{
     
		System.out.print("400, 300, 750의 최대 공약수 :" + function(400, 300, 750));

	}

}
