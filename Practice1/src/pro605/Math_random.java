public class Math_Random 
{
	public static void main(String[] args)
	{
		int[] arr=new int[2];
		int tmp; // �ӽ÷� ����� ����(��ȯ��)
		
		/*
	    arr[0]=(int)(Math.random()*45)+1; //�ζ�
	    arr[1]=(int)(Math.random()*45)+1;
	    */
		for(int i=0;i<arr.length;i++)
			arr[i]=(int)(Math.random()*45)+1;
			
	    // 0�� �ε����� �������� ������ �ְ� ���α׷��� �Ͻÿ�.
	    if(arr[0]>arr[1])
	    {	// 0�� 1�� ���� ��ȯ
	       	tmp=arr[0];
	       	arr[0]=arr[1];
	       	arr[1]=tmp;
	    }
	    
	    for(int i=0;i<arr.length;i++)
	    	System.out.print(arr[i]+" ");
	}
}
