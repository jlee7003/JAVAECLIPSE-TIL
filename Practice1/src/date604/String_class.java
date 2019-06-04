package date604;

public class String_class 
{

	public static void main(String[] args) 
	{
		String name="홍길동";
		String str=new String("홍길동");
		
		System.out.println(name+" "+str);
		
        if(name.equals(str))//int char는 =을 사용하면 되지만
        	                //객체와 객체를 비교할떄는 equals메소드를 사용해서 비교해야함
        {
        	System.out.println("같다");
        }
        else
        	System.out.println("다르다");
        //객체이기 때문에 다른 공간에 존재하므로 서로 다른 존재로 인식하게 됨
        
        //wrapper class
        //
        //int
//        char   ----\  클래스
//        double ----/
//        boolean(true,false)
        

	}
}
