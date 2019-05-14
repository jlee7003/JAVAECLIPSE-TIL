
public class test_4301
{

	public static void main(String[] args)
	{
		int[] arr=new int[6];
		
		
		
		for(int i=0;i<arr.length;i++) //방의 개수 생성 함수
			// arr.length = arr 배열의 크기 그러므로 i의 크기와 같게 한다면 오류가 남
			//int i=0 이 아니라 1로 한다면 int 0일때 0번 방에는 값의 입력이 없어지므로 0번째 방의 출력은 0이 나오게 됨
		{
			arr[i]=(int)(Math.random()*45)+1; //새로운 값 발생
			
			for(int j=0;j<=i-1;j++) //j의 크기가 i보다 1 적어야 하기 때문에 -1 
			{
				if(arr[j]==arr[i]) //
				{
					i=i-1; //i++ 되는 방의 값을 -1씩 빼줌으로 다시 초기화
				}	
				
			    if(arr[j] >= arr[i]) // 6개의 숫자를 오름차순으로
					i=i-1;
			    
			} 
			/*
			// i가 1일떄 
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
