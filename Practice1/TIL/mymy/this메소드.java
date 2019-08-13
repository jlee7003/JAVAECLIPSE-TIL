
public class this메소드
{
	int num1;
	int num2;
	int tot;

	this메소드() //this는 단독으로 사용해야함
	{
		this(1,100); //현제 클레스에 매개변수를 넣어준다 즉 생성자에 매게변수를 넣는것
		             // 즉 귀찮게 많은 내용의 소스 코드를 쓸 필요없이 매개변수의 경우의 수 
		             //를 표현하기 매우 좋음
//		num1=1;
//		num2=100;
//		
//		for(int i=num1;i<num2;i++)// ->1~100
//		{
//			tot=tot+i;
//		}
	}
	this메소드(int num2) //-> 1~b
	{
		this(1,num2);
//		num1=1;
//		
//		
//		for(int i=num1;i<num2;i++)
//		{
//			tot=tot+i;
//		}
	}
	this메소드(int num1, int num2)//-> a~b
	{
	
		for(int i=num1;i<num2;i++)
		{
			tot=tot+i;
		}
	}
}
