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
	System.out.println(y+"��"+m+"��"+d+"��");
	
		int dd=today.get(Calendar.DAY_OF_WEEK); //1~7 �Ͽ�ȭ�������
		System.out.println(dd+"����");
		
		int aa=today.get(Calendar.HOUR);
		int as=today.get(Calendar.MINUTE);
		int qd=today.get(Calendar.SECOND);
		System.out.println(aa+"��"+as+"��"+qd+"��");
		
		
		
		/* class calender
		 * {
		 *  private calender() //�����ڰ� private
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
		 *  �̱��� ��ü �������
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
