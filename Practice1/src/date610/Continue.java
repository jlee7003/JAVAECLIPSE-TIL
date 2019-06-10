package date610;


public class Continue 
{
	public static void main(String[] args)
	{
	    for(int i=1;i<=10;i++)
	    {
	    	System.out.println("continue실행전");
            if(i%2==0) //짝수 일 경우
            	continue; // 여기서 for문 1번 완료하고 다시 for문으로
            
	    	System.out.println("안녕하세요");
	    }
	}
}

