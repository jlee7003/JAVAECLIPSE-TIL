package date527;

public class date527_1 
{
 int kor=90;
 
  public void chul()
  {
	  System.out.println(kor);
  }
  public void aaa() // 같은 함수에 있는 메소드나 속성은 부를 수 있지만
                    // 다름 함수의 메소드나 속성은 부를 수 없다.
  {
	  kor=88;
	  chul();
  }
  public static void main(String[] args) //같은 클래스에 있지만 main 함수는 내 놓은 자식임
  {
	  date527_1  f=new date527_1();
	  f.kor=99;
	  f.chul();
  }
}
