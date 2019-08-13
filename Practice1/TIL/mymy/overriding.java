
interface Manager_member2
{//메소드의 선언만 한다.
	public void chul();
	public void input();
	public void cal(int a, int b);
	public int get();
}
interface test11{
	public void imsi();
}
class team4 implements Manager_member2,test11 //다중구현도 가능함
{                                     //2개 이상 구현이 가능 => 팀별 작업시 많이 사용

	@Override //이것은 오버라이딩 한것이다.
	public void chul() {
		
	}

	@Override
	public void input() {
		
	}

	@Override
	public void cal(int a, int b) {
		
	}

	@Override
	public int get() {
		
		return 0;
	}

	@Override
	public void imsi() {
		
	}
	
}
class team5
{
	
}
class team6
{
	
}
public class overriding {

}
