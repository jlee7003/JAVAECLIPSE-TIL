package date612;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Localclass
{
	
	public static void main(String[] args)
	{
      LocalDateTime today=LocalDateTime.now();
      
      int y=today.getYear();//��¥�Լ�
      int m=today.getMonthValue();
      int d=today.getDayOfMonth(); //�����
      
      String yo=today.getDayOfWeek().toString();//toString ���ڷ� ǥ���ض�
      int yo2=today.getDayOfWeek().getValue(); //���ڷ�
      
      int hh=today.getHour();
      int mm=today.getMinute();
      int ss=today.getSecond();//�ú���
      
      //���� ���� isLeapYear() //LocalDateŬ������ ����޼ҵ�
      LocalDate toto=today.toLocalDate();
      System.out.println(toto.isLeapYear()); //������ �ؿ��� true �ƴ϶�� false // today.toLocalDate();
      
      /*time ��Ű��
       * 
       * LocalDate ->�����
       * ��ü����: LocalDate today=LocalDate.now();
       * LocalTime  �ú���
       * ��ü����: LocalDate today=LocalTime.now();
       * LocalDateTime ����Ͻú���
       * ��ü����: LocalDate today=LocalDateTime.now();
       * 
       * 
       * 
       * */
      
      String chul=y+"��"+m+"��"+d+"��"+yo+" "+hh+"�� "+mm+"��"+ss+"��";
      System.out.println(chul);
	}

}
