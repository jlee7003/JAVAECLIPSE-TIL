package Date611;
import java.util.Date;
public class test 
{

	public static void main(String[] args) 
	{
		Date today=new Date();
		
		int y=today.getYear()+1900; 
		int m=today.getMonth()+1;
		String m2=m+"";//���� + ���� =����
		//m�� ���ڸ��ϰ�� 0�� ���δ�.
		if(m2.length()==1) //length ����س�����
			m2="0"+m;
	    
	
		int d=today.getDate();
		String d2=d+"";
		if(d2.length()==1) //0~9�� 0�� �����ְ� 10~12�� ������ ��������
			d2="0"+d;
		
		
		String tt=y+"-"+(m2)+"-"+d2;
		System.out.println(tt);
	
		String aa=y+"�� "+(m2)+"�� "+d2+"�� ";
		System.out.println(aa);

		int h=today.getHours();
	    int mm=today.getMinutes();
	    int s=today.getSeconds();
	    String tt3=h+":"+mm+":"+s;
	    System.out.println(tt3);
	}   

}
