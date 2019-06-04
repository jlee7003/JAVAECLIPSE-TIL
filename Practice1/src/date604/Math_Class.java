package date604;

public class Math_Class 
{

	public static void main(String[] args) 
	{
	 //Math 객체
		double a= Math.random(); // 리턴값이 더블형 -> 실수
		long b=Math.round(1.6);// 리턴 값이 long //반올림
		double c=Math.ceil(1.4);// 리턴값이 더블형 //올림
		double d=Math.floor(1.6);// 리턴값이 더블형 //내림
		Double dd=Math.floor(1.6);//Double class;
		
		System.out.println(a+" "+b+" "+c+" "+d);
		
		//더블형을 정수로 바꾸기
        int f=(int)c; //형변환
        System.out.println(f);
        
        //Double 클래스
        int g=dd.intValue();
        System.out.println(g);
        
           
	}

}
