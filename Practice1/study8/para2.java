//매개변수 
//	1. 변수-> 변수 자체가 아니라 값만 전달된다. => 값만 전달, 동일X
//	2. 배열
//	3.클래스 -> 주소를 전달한다. -> 동일한 메모리를 작업한다.
public class para2 {
	int[] arr = { 21, 43, 55 };// 일차원 배열 3칸짜리
	// 배열을 건드리면 안될경우에는 복사하는 방법도 있다. 

	public void imsi() {
		test4.cal(arr);
		System.out.println(arr[0]);
	}

}

class test4 {
	public static void cal(int[] arr) {
		arr[0]++;
		arr[1]++;
		arr[2]++;
	}
}