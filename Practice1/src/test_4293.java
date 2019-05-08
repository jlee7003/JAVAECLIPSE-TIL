public class test_4293 
{
	public static void main(String[] args) 
	{
		// (int)(Math.random()*45) 0~45 까지의 값을 정수 값으로 => 0~44
		int aa1=(int)(Math.random()*45)+1;
		
		int[] lot=new int[6];
		lot[0]=(int)(Math.random()*45)+1;
		lot[1]=(int)(Math.random()*45)+1;
		lot[2]=(int)(Math.random()*45)+1;
		lot[3]=(int)(Math.random()*45)+1;
		lot[4]=(int)(Math.random()*45)+1;
		lot[5]=(int)(Math.random()*45)+1;
		
		
		
		for(int i=0;i<=5;i++) //임의의 값 6(5+1)개
			lot[i]=(int)(Math.random()*45)+1; 
	}
	
}
	
