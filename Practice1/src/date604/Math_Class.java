package date604;

public class Math_Class 
{

	public static void main(String[] args) 
	{
	 //Math ��ü
		double a= Math.random(); // ���ϰ��� ������ -> �Ǽ�
		long b=Math.round(1.6);// ���� ���� long //�ݿø�
		double c=Math.ceil(1.4);// ���ϰ��� ������ //�ø�
		double d=Math.floor(1.6);// ���ϰ��� ������ //����
		Double dd=Math.floor(1.6);//Double class;
		
		System.out.println(a+" "+b+" "+c+" "+d);
		
		//�������� ������ �ٲٱ�
        int f=(int)c; //����ȯ
        System.out.println(f);
        
        //Double Ŭ����
        int g=dd.intValue();
        System.out.println(g);
        
           
	}

}
