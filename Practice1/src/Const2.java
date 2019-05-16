
public class Const2 
{
   int[] arr; // 갯수가 정해지지 않음
   
   // 생성자를 통한 배열 객체 생성
   Const2(int n)
   {
	   arr=new int[n];
   }
   
   // 메소드를 통한 배열 객체 생성
   public void init(int n)
   {
	   arr=new int[n];
   }
}
