package date610;

import java.util.Random;

public class Break2사기치는법
{

	public static void main(String[] args) 
	{
		Random r1=new Random();
		String[] member= {"홍길동","슈퍼맨","베트맨","이의호"};
		int n;
		//3이 나올때 까지 무한 반복
		
		for(;;)
		{
		n=r1.nextInt(4);
		
	    if(n==3)
		continue;
	    else
	    	break;
		}
		
		System.out.println("피자 사는 사람 :" +member[n]);

	}

}
