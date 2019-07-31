
public class 반복문 {
	public static void main(String[] args) {
		
		int one=1;
		int two=2;
		int[] lotto=new int[5];
		
		for(int i=0;i<4;i++)
		{
			 lotto[i]=(int)(Math.random()*45)+1;
		}
		//배열에 있는 값을 낮은 순으로 정렬
		int temp=0;
	
		for(int i=0;i<4;i++) 
		{
			if(lotto[0]>lotto[i+1])
			{
						
				temp=lotto[i+1];
				lotto[i+1]=lotto[0];
				lotto[0]=temp;
				
			}
			
			System.out.print(lotto[i]+" ");
		}
	}
}
