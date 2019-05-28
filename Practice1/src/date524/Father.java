package date524;


class son 
{
int kor;
 public void chul() //final을 사용하면 바뀌지 않음 final을 사용하면 오버로딩을 절대 못사용함
 {
	 System.out.println("아버지");
 }
 //final 수정 불가
}

public class Father extends son
	
{
	 public void aaa()
		{
			System.out.println("추가");
		}
		
	 public void chul()
	    {
			System.out.println("추가alal"); //아버지가 추가alal로 바뀜
		}
		
}

