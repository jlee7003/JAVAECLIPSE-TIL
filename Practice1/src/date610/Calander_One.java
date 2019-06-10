package date610;
import java.util.Calendar;
public class Calander_One 
{

	public static void main(String[] args) 
	{
		//Date today=new Date();
		Calendar today=Calendar.getInstance();
				
		int y=today.get(Calendar.YEAR);
		int m=today.get(Calendar.MONTH);
		int d=today.get(Calendar.DAY_OF_MONTH);
	System.out.println(y+"년"+m+"월"+d+"일");
	
		int dd=today.get(Calendar.DAY_OF_WEEK); //1~7 일월화수목금토
		System.out.println(dd+"요일");
		
		int aa=today.get(Calendar.HOUR);
		int as=today.get(Calendar.MINUTE);
		int qd=today.get(Calendar.SECOND);
		System.out.println(aa+"시"+as+"분"+qd+"초");
		
		
		
		/* class calender
		 * {
		 *  private calender() //생성자가 private
		 *  {
		 *  
		 *  }
		 * public static Calendar getInstance()
		 *  {
		 *   Calender today=new Calendar();
		 *   return today;
		 *  }
		 *  
		 * }
		 * 
		 *  싱글톤 객체 생성방법
		 *  public class ddd
		 * {
	     *    public static void main()
		 *   {
		 *    Calendar today = Calendar.getInstance();
		 *   }
		 *  
		 * }
		 * 
		 * 
		 * 
		 * */		
		
	}

}
