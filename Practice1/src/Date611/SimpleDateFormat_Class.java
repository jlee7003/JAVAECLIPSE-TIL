package Date611;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_Class 
{
	public static void main(String[] args) 
	{
		Date today = new Date();
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //�̷��� �������� ����ϰڴ�.
		                                                           //���� ���� ������ ���� ������ ������ �����ϴٴ°�
		String ch1=sdf.format(today);
		
 		sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
 		String ch2=sdf.format(today);
 		
		sdf = new SimpleDateFormat("HH:mm:ss");
		String ch3=sdf.format(today);
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
	}
}
