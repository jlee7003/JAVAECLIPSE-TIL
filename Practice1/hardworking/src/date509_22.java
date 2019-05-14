
public class date509_22 
{

    //22. test라는 정수형이고 크기가 10인 배열을 만들어
   // Math.random()을 이용하여 1~10까지의 임의의 수를 넣고 출력을 하시오.

	int test[]=new int[10];
	
	public void input()
	{
		for(int i=0;i<test.length;i++)
		{
			test[i]=(int)(Math.random()*10)+1;
		}
		
	} 
	
	public void output()
	{	
		for(int i=0;i<test.length;i++)
		{
			System.out.print(test[i]+" ");
		}
	}
}
