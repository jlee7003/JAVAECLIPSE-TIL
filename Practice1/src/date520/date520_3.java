package date520;

public class date520_3
{
	int kor;
	int eng;
	//생성자 오버로딩
	//매게변수의 갯수와 자료형에 따라
	//생성자를 여러개 만든다.
	//오버로딩? ->함수 안에서만 가능함, 똑같은 함수가 안에 2개 이상 있을 경우,
	//          매게변수에 따라서 값이 다르게 나오는 작업
    //시험을 안쳤을 경우 최저 점수 60
	// this->초기의 kor값 불러오기
	 
	
	
	
	
	date520_3()
	{
		this.kor=60;
		this.eng=60;
	}
	date520_3(int kor)
	{
		this.kor=kor;//매게변수로 가지고 온 값
		this.eng=60;
	}
	date520_3(double eng)//사람은 구분 할 수 있지만 메인함수에서의 매게변수가 하나 있을 경우 
	                     //컴퓨터는 구분할 수 없기에 메게변수의 수를 다르게 해주어야함
	                     //오버로딩의 정의-> 매게변수의 타입(자료형),순서,갯수가 다른 것
	{
		
	}
	date520_3(int kor,int eng)
	{
		this.kor=kor;
		this.eng=eng;
	}
	
	public void output()
	{
		System.out.println(kor+eng);
	}
	
}
