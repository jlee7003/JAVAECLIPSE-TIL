package Date613;

public class TryCatchException 
{

	public static void main(String[] args) 
	{
		 int n=6;
		   int[] lotto=new int[6];
		   int num=100;
		   int div=5;
		   
				
		try //try 구문 안에 에러가 있으면 캐치 구문으로 이동하게 됨  //array 오류인데 아래의 케치 구문은 null오류 케치구문이다.
		    // 예외가 발생된 캐치만 실행되고 가장 상위에 있는 예외구문만 실행이 됨 바로 캐치로 넘어가므로
		{
			
	     lotto[4]=100;
	     int result=num/div;
	     
	   	 String str="하하하";
		//str=null;//null 값은 출력 할 수 없다
		 System.out.println(str.toString()); 
		 System.out.println("정상이다정상");

		}
		catch(Exception e) //하지만 이 방식은 편리하지만 오류를 찾아낼수 없으므로 추천하지 않는 방식
		{
		System.out.println("하하하");
		e.printStackTrace();
		}
		System.out.println("오류다오류");
	}

}
