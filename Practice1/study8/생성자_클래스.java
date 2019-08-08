
public class 생성자_클래스 {

	int num1;
	int num2;
	int tot;
	생성자_클래스(int num1,int num2) //num1의 값과 num2의 값이 존재하지 않는다--생성자 오버로딩------
	{
		this.num1=num1;
      	this.num2=num2;
      	if(num1<60) {
      		this.num1=60;
          	
      	}
    	if(num2<60) {
      		this.num2=60;
          	
      	}
		
	} 
	생성자_클래스(int num1) //num1의 값과 num2의 값이 존재하지 않는다---------------------------
	{
		this.num1=num1;
		if(num1<60) {
      		this.num1=60;
      	}
		this.num2=60;
	} 
	생성자_클래스() //num1의 값과 num2의 값이 존재하지 않는다---------------------------
	{
		this.num1=60;
      	this.num2=60;
		
	} 
//	public void input(int num1,int num2)
//	{
//		this.num1=num1;
//		this.num2=num2;
//	}
	public void hap()
	{
		tot=num1+num2;
	}
	public void chul()
	{
		System.out.println("두 점수의 합 " + tot);
	}
	
}
