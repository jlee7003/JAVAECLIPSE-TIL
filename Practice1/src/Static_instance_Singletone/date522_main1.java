package Static_instance_Singletone;

public class date522_main1 
{

	public static void main(String[] args) 
	{
		//정적 멤버는 사용 방법이 클래스.이름
		// => ex) date522_1.sogae
		//정적 필드= 공용적인 데이터
		//static이 되면 밖에서 접근이 가능하게 됨 중요한 자료는 static을 사용하지 않음
		date522_1.name="이의호"; //변수를 만들지 않고 직접 static으로 넣어준 것  
		date522_1.age=24;
		
		date522_1.sogae();
		
		date522_1 aa= new date522_1();
		
		aa.input(4);
		aa.sogae(); //
	}

}
