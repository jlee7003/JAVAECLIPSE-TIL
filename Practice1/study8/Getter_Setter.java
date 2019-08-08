
public class Getter_Setter 
{
	private int kor;
	
	public void aaa(int kor)//<- 매게변수 kor , Setter - 보내는 것
	{
		this.setKor(kor); //멤버변수인 kor에다가 매개변수로 값을 가져오겠다.
	}
	 //객체의 접근은 같은 패키지내에서만 가능하다.
	public int bbb()//<- 매게변수 kor , Getter - 가지고 오는것
	{
		return this.getKor();
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}
}
