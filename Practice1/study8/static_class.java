
public class static_class {

	
	static String name="홍길동"; //객체 생성 없이 쉽게 접근 가능함
    static int kor=90;
    static int eng=88;
    String juso="서울시";
    int age=33;
    
    public static void test() // 스태틱 메소드 내에서는 static 변수만 가능함
    {
    	static_class sc= new static_class();
//    	System.out.println("스태틱메소드"+" "+kor+" "+juso);//juso는 객체메소드임으로 객체생성을 해야 접근 가능함
    	System.out.println("스태틱메소드"+" "+kor+" "+sc.juso);
    
    	System.out.println(sc.juso);
    }
    public void chul()
    {
    	System.out.println("객체메소드");
    }
    
}

