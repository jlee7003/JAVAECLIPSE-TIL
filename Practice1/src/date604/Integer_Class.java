package date604;

public class Integer_Class 
{

	public static void main(String[] args) 
	{
		Integer kor=100;
		Integer eng=new Integer(90);
		
		int a=kor.intValue();
	    short b=eng.shortValue();
	    byte c=kor.byteValue();
	    long d=eng.longValue();

	    String ss=kor.toString();
	    
	    String mat=new String("123");
	    //int su=mat; 문자는 정수형에 못넣음
	    int su=Integer.parseInt(mat);
	    
	    System.out.println(su);
	}

}
