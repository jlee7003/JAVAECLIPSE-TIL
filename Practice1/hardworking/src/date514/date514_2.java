package src.date514;

public class date514_2 
{

	public static void main(String[] args) 
	{
		// arr�̶�� ������ �迭�� ũ��� 5�� �����
		//1~5������ ���� ������ �Է��Ѵ�.
		//4���濡 1,3���濡 2,2�� �濡 3....

		int arr[]=new int[5];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i+1;
		}
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.print("0������ �Է°���"+arr[0]);
	}

}
