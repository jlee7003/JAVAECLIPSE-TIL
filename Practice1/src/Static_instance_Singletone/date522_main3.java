package Static_instance_Singletone;

import java.util.Calendar;

public class date522_main3 
{

	public static void main(String[] args)
	{
		date522_3 aa=date522_3.getInstance();//���¹�ȣ�� ��й�ȣ ���̵� �����ܾ��� Ȯ�� ��������
		aa.chul();
		Calendar ca=Calendar.getInstance();
		System.out.println(ca.YEAR);

	}

}
