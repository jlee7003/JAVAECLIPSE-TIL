package date528;

public interface Sungjuk
{
	String AA="매우잘함";
	String BB="잘함";
	String CC="앵간잘함";
	String DD="보통함";
	String FF="못함";     
	//인터페이스 안의 속성들은 상수가 됨 왜? public static final 처리 되기 때문 (무조건!!)
  void input(); //public abstract을 생략 가능
  
  void sung_cal();
  
  void chul();
}
