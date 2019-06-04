package date604;

public class wrapper 
{
	public static void main(String[] args) 
	{
		Integer kor=new Integer(100);// 정수형포장클래스에 100입력
		
		int k=kor.intValue();//포장클래스의 값을 기본자료형변수에 대입
		//unboxing
		
		System.out.println(kor+" "+k);
	}

}
