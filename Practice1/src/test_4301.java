
public class test_4301
{

	public static void main(String[] args)
	{
		int[] arr=new int[6];
		
		
		
		for(int i=0;i<arr.length;i++) //���� ���� ���� �Լ�
			// arr.length = arr �迭�� ũ�� �׷��Ƿ� i�� ũ��� ���� �Ѵٸ� ������ ��
			//int i=0 �� �ƴ϶� 1�� �Ѵٸ� int 0�϶� 0�� �濡�� ���� �Է��� �������Ƿ� 0��° ���� ����� 0�� ������ ��
		{
			arr[i]=(int)(Math.random()*45)+1; //���ο� �� �߻�
			
			for(int j=0;j<=i-1;j++) //j�� ũ�Ⱑ i���� 1 ����� �ϱ� ������ -1 
			{
				if(arr[j]==arr[i]) //
				{
					i=i-1; //i++ �Ǵ� ���� ���� -1�� �������� �ٽ� �ʱ�ȭ
				}	
				
			    if(arr[j] >= arr[i]) // 6���� ���ڸ� ������������
					i=i-1;
			    
			} 
			/*
			// i�� 1�ϋ� 
			if(i==1)
			{
			if(arr[0] == arr[1])
			{
				i=i-1;
			}
			}
			
			if(i==2)
			{
			if(arr[0] == arr[2] && arr[1] == arr[2])
			{
				i=i-1;
			}
			}
			
			if(i==3)
			{
			if(arr[0] == arr[3] && arr[1] == arr[3] && arr[2] == arr[3])
			{
				i=i-1;
			}
			}
			
			if(i==4)
			{
			if(arr[0] == arr[4] && arr[1] == arr[4] && arr[2] == arr[4] && arr[3] == arr[4])
			{
				i=i-1;
			}
			}
			
			if(i==5)
			{
			if(arr[0] == arr[5] && arr[1] == arr[5] && arr[2] == arr[5] && arr[3] == arr[5] && arr[4] == arr[5])
			{
				i=i-1;
			}
			}
				
			*/
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			
		System.out.print(arr[i] + " ");
		}
		
	}

}
