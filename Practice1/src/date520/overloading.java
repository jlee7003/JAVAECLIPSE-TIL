package date520;

public class overloading
{
	int hap=0;
	//생성자 오버로딩
	//매게변수의 갯수와 자료형에 따라
	//생성자를 여러개 만든다.
	//오버로딩? ->함수 안에서만 가능함, 똑같은 함수가 안에 2개 이상 있을 경우,
	//          매게변수에 따라서 값이 다르게 나오는 작업
    //시험을 안쳤을 경우 최저 점수 60
	// this->초기의 kor값 불러오기
	//생성자 오버로딩을 할때에 주의할점
	//1.매개변수의 갯수와  자료형이 틀려야한다.
	//2.오버로딩을 할 경우
	//     매게변수가 없는 생성자 자동생성 x
	 
	overloading() //1부터 100까지의 합
	{
		for(int i=1;i<=100;i++)
		{
			hap=hap+i;
		}
	}
	overloading(int num2) //1부터 a까지의 합
	{
		for(int i=1;i<=num2;i++)
		{
			hap=hap+i;
		}
	}
	overloading(double eng) //사람은 구분 할 수 있지만 메인함수에서의 매게변수가 하나 있을 경우 
	                      //컴퓨터는 구분할 수 없기에 메게변수의 수를 다르게 해주어야함
	                      //오버로딩의 정의-> 매게변수의 타입(자료형),순서,갯수가 다른 것
	{
		
	}
	overloading(int num1,int num2)//a부터 b까지의 합
	{
		for(int i=num1;i<=num2;i++)
		{
			hap=hap+i;
		}
	}
	
	public void output()
	{
		System.out.println(hap);
	}
	
}
