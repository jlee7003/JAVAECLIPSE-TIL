package date610;
import java.util.Calendar;
import java.util.TimeZone;
public class Calander_One 
{

	public static void main(String[] args) 
	{
		//Date today=new Date();
		TimeZone tz=TimeZone.getTimeZone(""); //�� ������ �ð��� �޾ƿ�
		Calendar today=Calendar.getInstance();
		int ap=today.get(Calendar.AM_PM); // ���� 0, ���� 1
		
		
		
			
				
		int y=today.get(Calendar.YEAR);
		int m=today.get(Calendar.MONTH);
		int d=today.get(Calendar.DAY_OF_MONTH);
	System.out.print(y+"�� "+(m+1)+"�� "+d+"�� ");
	
		int day=today.get(Calendar.DAY_OF_WEEK); //1~7 �Ͽ�ȭ�������
		//String days[]= {"��","��","ȭ","��","��","��","��"};
		//System.out.println(days[day]);
		//String day;-int���� day�� String������ �ٲپ��ִ� ����ȯ
		switch(day)
		{
		case 1:System.out.print("��"+"���� "); break;
		case 2:System.out.print("��"+"���� "); break;
		case 3:System.out.print("ȭ"+"���� "); break;
		case 4:System.out.print("��"+"���� "); break;
		case 5:System.out.print("��"+"���� "); break;
		case 6:System.out.print("��"+"���� "); break;
		case 7:System.out.print("��"+"���� "); 
		}
		
		switch(ap)
		{
		case 0:System.out.println("���� �Դϴ�."); break;
		case 1:System.out.println("���� �Դϴ�.");
		}
	    
		
		
		
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
