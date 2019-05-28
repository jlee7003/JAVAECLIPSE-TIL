package date528;

public interface test1 
{ //인터페이스 메소드에서는 몸체가 없는 추상 메소드만 정의 됩니다.
	//추상메소드와 개념은 비슷하지만  인터페이스는 기능이 다양한 경우에 많이 사용됨 
	//인터페이스 안의 모든 메소드는 public을 붙이지 않아도 public으로 취급된다.
	//인터페이스는 다른 클래스에 의하여 구현될 수 있음.
	//변수는 무조건 final 
	int kor=88; //public static final이 자동부
	
	
	public static final int eng=90; //안써도 자동으로 public static final 처리가 됨
	
	public void hap();
	
	void chul(); //묵시적으로 public abstract이다 그러므로 생략가능하다
	
	

}
