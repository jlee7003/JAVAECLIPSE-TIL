	//매개변수 
//	1. 변수-> 변수 자체가 아니라 값만 전달된다. => 값만 전달, 동일X
//	2. 배열
//	3.클래스 -> 주소를 전달한다. -> 동일한 메모리를 작업한다.
public class para1 {
	int kor=100;
	public void imsi()
	{
		test3.cal(kor);// cal이 static이 아니라면 객체 생성없이 가지고 올수 없는데 static이라 가능한것
		//test3.ppp(); //함수가 static이 아니므로 객체 생성을 해야지만 사용이 가능하다.
		test3 t3=new test3(); //인스턴스화 객체 생성;
		t3.ppp();
		System.out.println("kor: "+kor);//변수는 값만 전달됨
	}
	
}


class test3
{  //static이 붙으면 객체 생성 없이 호출이 가능함,정적인
	public static void cal(int kor) //콜서비스 없이 찾아오는 사람
	{
		kor++;
		System.out.println(kor);
	}
	public void ppp()
	{
		System.out.println("테스트");
	}
	
}