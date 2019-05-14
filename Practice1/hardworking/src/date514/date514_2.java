package src.date514;

public class date514_2 
{

	public static void main(String[] args) 
	{
		// arr이라는 정수형 배열의 크기는 5로 만든다
		//1~5까지의 값을 역으로 입력한다.
		//4번방에 1,3번방에 2,2번 방에 3....

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
		System.out.print("0번방의 입력값은"+arr[0]);
	}

}
