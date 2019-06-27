package Date611;

import java.time.LocalDateTime;

public class Datecheck {

	public static void main(String[] args) 
	{
		LocalDateTime today=LocalDateTime.now();
		
		plus ���� minus�� �����Ѵ�.
		LocalDateTime xday=today.plusYears(10); //������ �������� �⵵�� 10�� ���ϴ°�
		LocalDateTime xday=today.plusMonths(10);  //������ �������� 10������ ���� �� 
		LocalDateTime xday=today.plusDays(1000);  //�������������� 1000���� ���Ѱ�
		LocalDateTime xday=today.plusHours(1000);  //...
		LocalDateTime xday=today.plusMinutes(1000);
		LocalDateTime xday=today.plusSeconds(1000);
  		int y=xday.getYear();
		int m=xday.getMonthValue();
		int d=xday.getDayOfMonth();
		
		System.out.println(y+"��"+m+"��"+d+"��");
		
		
		
	}

}
