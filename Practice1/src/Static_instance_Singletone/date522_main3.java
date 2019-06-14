package Static_instance_Singletone;

import java.util.Calendar;

public class date522_main3 
{

	public static void main(String[] args)
	{
		date522_3 aa=date522_3.getInstance();//계좌번호와 비밀번호 없이도 계좌잔액이 확인 가능해짐
		aa.chul();
		Calendar ca=Calendar.getInstance();
		System.out.println(ca.YEAR);

	}

}
