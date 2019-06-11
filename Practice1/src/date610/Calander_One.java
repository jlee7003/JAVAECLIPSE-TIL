package date610;
import java.util.Calendar;
import java.util.TimeZone;
public class Calander_One 
{

	public static void main(String[] args) 
	{
		//Date today=new Date();
		TimeZone tz=TimeZone.getTimeZone(""); //각 도시의 시간을 받아옴
		Calendar today=Calendar.getInstance();
		int ap=today.get(Calendar.AM_PM); // 오전 0, 오후 1
		
		
		
			
				
		int y=today.get(Calendar.YEAR);
		int m=today.get(Calendar.MONTH);
		int d=today.get(Calendar.DAY_OF_MONTH);
	System.out.print(y+"년 "+(m+1)+"월 "+d+"일 ");
	
		int day=today.get(Calendar.DAY_OF_WEEK); //1~7 일월화수목금토
		//String days[]= {"일","월","화","수","목","금","토"};
		//System.out.println(days[day]);
		//String day;-int형인 day를 String형으로 바꾸어주는 형변환
		switch(day)
		{
		case 1:System.out.print("일"+"요일 "); break;
		case 2:System.out.print("월"+"요일 "); break;
		case 3:System.out.print("화"+"요일 "); break;
		case 4:System.out.print("수"+"요일 "); break;
		case 5:System.out.print("목"+"요일 "); break;
		case 6:System.out.print("금"+"요일 "); break;
		case 7:System.out.print("토"+"요일 "); 
		}
		
		switch(ap)
		{
		case 0:System.out.println("오전 입니다."); break;
		case 1:System.out.println("오후 입니다.");
		}
	    
		
		
		
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
