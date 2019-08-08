
public class para_ref 
{
 //참조형 변수 => 배열, 클래스
	 //=> 값을 넘길때 기본형이 아니라 참조형(주소)를 넘김
	//매개변수는 다른 클래스에 넘길때 주로 사용함
	int[] arr=new int[3];
	public void imsi()
	{
		arr[0]=11;
		arr[1]=22;
		arr[2]=33;
		test2 t2=new test2();
		t2.input(arr);
	}
}
class test2
{
	int[] arr2; //배열은 만들었지만 생성은 아직 안해줌 (new 메소드)
	public void input(int[] arr) // 
	{
		this.arr2=arr;
		arr[1]=88;//매개변수에서 바꿈
		arr2[0]=99; //멤버 배열의 값을 변환시킴
	}
}
