package date603;
import java.util.Date;
public class GC 
{
  public static void main(String[] args)
  {
	  Date today=new Date();
	  System.out.println(today.getMonth());
//	  ���� �׿��ִ� �ǹ̴� �� ���� Ŭ������ �����Ƿ� �װ��� ����϶�� ����
	  today=null; // �� �̻� ������� �����Ƿ� null���� �ش�..
	  System.gc();
	 
  }

}
