
public class test_501 
{

	public static void main(String[] args)
	{
		//값을 저장하는 공간=> 변수, 배열
		//변수 => 하나의 값을 저장하는 공간
        //배열=> 동일한 성격을 가진 값의 집합
		//     for문과 연동 가능=> 코딩 소스의 간소화
		
		//제어문 if,switch, for, while
		//분기문 => if(조건식), switch(값)
		//반복문 => for(시작값;조건식;증가값) 증가값은 거의 1씩만 증가
		int lot[]=new int[6];
		
		for(int i=0;i<lot.length;i++)
		{
			lot[i]=(int)(Math.random()*45)+1;
			
			for(int j=0;j<=i-1;j++)
			{
				if(lot[j]==lot[i])
					i=i-1;
			}
			
		}
		
		for(int i=0;i<lot.length;i++)
		{
			System.out.print(lot[i] + " ");
		}
	}

}
