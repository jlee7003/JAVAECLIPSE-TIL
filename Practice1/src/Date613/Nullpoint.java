package Date613;

public class Nullpoint 
{
	
	public static void main(String[] args) 
	{
	  // String str="������";
	   
	   //str=null;//null ���� ��� �� �� ����
	   
	  // System.out.println(str.toString()); //str��ü������ null
	   
	   int n;
	   int[] lotto=new int[6];
	   n=6; //n�� ���� �Է� �޴´ٰ� ����
	   if(n>=0 && n<=5)
	   lotto[n]=100;
	   //java.lang.ArrayIndexOutOfBoundsException: 6 -> �迭�� ������ ����ٴ� ����
	   
		int dd;
		int a;
		dd=0;
		
		if(dd!=0)
	       a=10/dd; //0���δ� ���ڸ� ������ �����Ƿ� ������ �߻�
		
		System.out.println("�����������");
	}

}
