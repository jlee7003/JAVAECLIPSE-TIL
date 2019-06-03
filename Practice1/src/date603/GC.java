package date603;
import java.util.Date;
public class GC 
{
  public static void main(String[] args)
  {
	  Date today=new Date();
	  System.out.println(today.getMonth());
//	  줄이 그여있는 의미는 너 나은 클래스가 있으므로 그것을 사용하라는 뜻임
	  today=null; // 더 이상 사용하지 않으므로 null값을 준다..
	  System.gc();
	 
  }

}
