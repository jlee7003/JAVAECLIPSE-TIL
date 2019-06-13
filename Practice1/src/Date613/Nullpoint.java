package Date613;

public class Nullpoint 
{
	
	public static void main(String[] args) 
	{
	  // String str="하하하";
	   
	   //str=null;//null 값은 출력 할 수 없다
	   
	  // System.out.println(str.toString()); //str객체변수가 null
	   
	   int n;
	   int[] lotto=new int[6];
	   n=6; //n의 값을 입력 받는다고 가정
	   if(n>=0 && n<=5)
	   lotto[n]=100;
	   //java.lang.ArrayIndexOutOfBoundsException: 6 -> 배열의 범위를 벗어났다는 오류
	   
		int dd;
		int a;
		dd=0;
		
		if(dd!=0)
	       a=10/dd; //0으로는 숫자를 나눌수 없으므로 오류가 발생
		
		System.out.println("다음문장실행");
	}

}
