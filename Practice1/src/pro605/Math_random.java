public class Math_Random 
{
	public static void main(String[] args)
	{
		int[] arr=new int[2];
		int tmp; // 임시로 사용할 변수(교환시)
		
		/*
	    arr[0]=(int)(Math.random()*45)+1; //로또
	    arr[1]=(int)(Math.random()*45)+1;
	    */
		for(int i=0;i<arr.length;i++)
			arr[i]=(int)(Math.random()*45)+1;
			
	    // 0번 인덱스가 낮은값을 가질수 있게 프로그래밍 하시오.
	    if(arr[0]>arr[1])
	    {	// 0과 1의 값을 교환
	       	tmp=arr[0];
	       	arr[0]=arr[1];
	       	arr[1]=tmp;
	    }
	    
	    for(int i=0;i<arr.length;i++)
	    	System.out.print(arr[i]+" ");
	}
}
