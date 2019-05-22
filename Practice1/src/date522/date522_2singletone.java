package date522;

public class date522_2singletone 
{
	//싱글톤: 
    //class 파일은 자바 파일이 어떻게 되있는지 볼 수 없고 그 기능만 사용이 가능함. class 파일로는 내부를 들여다 볼 수가 없음
	int num1;
	int num2;
	String name;
	
	 private date522_2singletone(String name)// 생성자에서 이름을 초기화 ,생성자가 private 임으로 객체 생성이 불가능
	 // private -> 자신의 클래스에서만 접근이 가능함, 이것이 싱글톤 방식 던져주는것 return class객체를 넘겨주는것
	{
		this.name=name; 
	}
	
	 public static date522_2singletone getInstance()// 얘를 스테틱으로 만들면 접근 가능함 static으로 자신의 복제클래스를 만든 것
	                                      // aa를 return함으로 private임에도 static aa를 main 클래스에서 받을 수 있음
	 {
		 date522_2singletone aa1=new  date522_2singletone("이의호"); //여기서 생성자를 만들어주고 return을 해줌
		                                       // 복제 출석부를 만드는 것(복제 생성자)
		                                       //return 되는 것이 class임으로 자료형에다 클래스를 적어줌(본인 클래스의 이름)
		 return aa1; //반환되는 클래스의 값의 이름은 상관 없음
	 }
	public void input(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public void cal_chul()
	{
		int hap=num1+num2;
		
		System.out.println(name+"  :  "+hap);
	}
	
	
}
