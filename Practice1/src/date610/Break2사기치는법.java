package date610;

import java.util.Random;

public class Break2���ġ�¹�
{

	public static void main(String[] args) 
	{
		Random r1=new Random();
		String[] member= {"ȫ�浿","���۸�","��Ʈ��","����ȣ"};
		int n;
		//3�� ���ö� ���� ���� �ݺ�
		
		for(;;)
		{
		n=r1.nextInt(4);
		
	    if(n==3)
		continue;
	    else
	    	break;
		}
		
		System.out.println("���� ��� ��� :" +member[n]);

	}

}
