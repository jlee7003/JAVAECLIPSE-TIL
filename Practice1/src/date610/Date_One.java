package date610;

import java.util.Date;

public class Date_One
{
	public static void main(String[] args) 
	{
	    // Date()
		Date today=new Date();
		
		int y=today.getYear()+1900;  // ��
		int m=today.getMonth(); // ��
		int d=today.getDate();   // ��
		int dd=today.getDay(); // ����
		int hh=today.getHours();  // �ð�
		int mm=today.getMinutes(); // ��
		int ss=today.getSeconds(); // ��
		
		String tt=y+"�� "+m+"�� "+d+"�� ";
		String tt2=dd+"����";
		String tt3=hh+"�� "+mm+"�� "+ss+"��";
		
		System.out.println(tt);
		System.out.println(tt2);
		System.out.println(tt3);
		
		
		//System.out.println(today.toString());
		// toString() => ��ü������ ���������� ����ϴ� �Լ�
	}
}
