package date524;


class son 
{
int kor;
 public void chul() //final을 사용하면 바뀌지 않음 final을 사용하면 오버라이딩을 절대 못사용함
 //오버라이딩 : 부모가 갖고 있는 메소드를 수정하여 사용 하는 것
 {
	 System.out.println("아버지");
 }
 //final 수정 불가
}

public class Abstractclass2 extends son
	
{
	 public void aaa()
		{
			System.out.println("추가");
		}
		
	 public void chul()//이 메소드를 없에면 원래의 chul 메소드가 실행;
	    {
			System.out.println("곰탕 추가"); //아버지가 곰탕 추가로 바뀜
		}
		
}