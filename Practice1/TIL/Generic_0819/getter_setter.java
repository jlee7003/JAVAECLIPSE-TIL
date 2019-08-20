package Generic_0819;

class Test3
{
	int eng;
	private int kor;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor)//test 3안에 있는 클래스는 내부에 있는 private에 접근이 가능하고 public함수는 어디서든 누구나 접근이 가능함
	{                           //매개변수를 통해 값을 자유롭게
    this.kor=kor;		
	}
	public int getKor() //return 을 통해 외부에서 자유롭게
	{
		return kor;
	}
}
public class getter_setter {
 public static void main(String[] args) {
	Test3 t3=new Test3();
	t3.eng=100; //Object -> 모든 클래스에서 사용할수 있는 최상위층 메소드
				//eng는 private이 아니므로 자유롭게 접근 가능
	
//	System.out.println(t3.Kor); 이거는 불가능
	System.out.println(t3.eng);
//	t3.getKor();
	//set
  t3.setKor(88);
	//get
	int kor=t3.getKor();
	t3.setName("이의호");
	String Name=t3.getName();
	System.out.println(Name);
	
 }
}
