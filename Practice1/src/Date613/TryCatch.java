package Date613;

public class TryCatch 
{

	public static void main(String[] args) 
	{
		 int n=6;
		   int[] lotto=new int[6];
		   int num=100;
		   int div=0;
		   
		
		
		
		try //try 구문 안에 에러가 있으면 캐치 구문으로 이동하게 됨  //array 오류인데 아래의 케치 구문은 null오류 케치구문이다.
		    // 예외가 발생된 캐치만 실행되고 가장 상위에 있는 예외구문만 실행이 됨 바로 캐치로 넘어가므로
		{
			
			lotto[6]=100;
	     int result=num/div;
	     
	   	 String str="하하하";
		 str=null;//null 값은 출력 할 수 없다
		 System.out.println(str.toString()); 

		}
		catch(ArrayIndexOutOfBoundsException e)//array값 예외시
		{
			System.out.println("Array오류");
		}
		catch(NullPointerException e)//예외처리 클래스 e는 매게변수이다. null값 예외시
		{
			System.out.println("ERROR 404: 오류가 발생했습니다.");
			System.out.println("str의 정보값이 현재 null입니다.");
			e.printStackTrace();
		}
		catch(ArithmeticException e)//0으로는 못나눈다 
		{
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		catch(Exception e) //에러를 다 구분해주고 예상하지 못한 에러를 걸러내는 법
		                   //단 Exception은 무조건 마지막 catch에다가 사용해야함->아니면 다 Exception에 걸러짐
		{
			System.out.println("에러는 났지만 무슨 에러인지는 모른다.");
		}
		finally //마지막 실행구문 예외이든 아니든 무조건 실행됨
		{
			System.out.println("finally입니다");
		}
		
		System.out.println("하하하");
	}

}
