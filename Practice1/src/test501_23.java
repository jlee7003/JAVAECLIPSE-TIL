
public class test501_23
{

	public static void main(String[] args)
	{
		int pkc[]=new int[10];
		int num=0;
		System.out.println("��÷�� 6���� ��ȣ��");
		for(int i=0;i<pkc.length;i++) // arr.length = arr �迭�� ũ��
		{
			pkc[i]=(int)(Math.random()*110)+1;
			
			for(int j=0;j<=i;j++)
			{
				if( pkc[i] < 100)
					i=i-1;
			}
		}
		for(int i=0;i<pkc.length;i++)
		System.out.print(pkc[i]+" ");
	}

}
