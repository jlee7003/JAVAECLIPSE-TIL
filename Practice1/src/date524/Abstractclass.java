package date524;

public abstract class Abstractclass 
{
 //클래스 안의 값을 정확히 정해놓지 않아 상황을 보고 정하는 것-> abstract를 사용
	// 단독 객체 생성 불가 기능이 없는 메소드가 있다는 것을 알림
	int kor;
	
	public abstract void input(); //추상클래스 안에는 추상 메소드가 들어와야함 
	//  내가 필요할때 만들어서 사용 상속을 하게 되면 오버라이딩이 가능함 그래서 내가 정의해 사용하는 것
	// 상속-> 후 정의
	
	public void chul()
	{
		System.out.println(kor);
	}
}
