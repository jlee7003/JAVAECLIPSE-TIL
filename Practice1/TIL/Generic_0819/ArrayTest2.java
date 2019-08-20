package Generic_0819;

import java.util.Date;

class Array_pkc<T>
{
	private T[] arr;
	private int n=0;

	public T[] getArr() {//배열을 리턴
		return arr;
	}

	public void setArr(T[] arr) { //매개변수로 배열을 가져오는것
		this.arr = arr;
	}
	
	public void add(T str)
	{
		arr[n]=str; //배열에 문자열 입력
		n++;
	}
}
public class ArrayTest2 {

	public static void main(String[] args) {
		String[] aa=new String[10];
		Array_pkc<String> ap=new Array_pkc<String>();
		ap.setArr(aa);
		ap.add("슈퍼맨");	
		ap.add("베트맨");	
		System.out.println(aa[0]+" "+aa[1]);
	
		Integer[] bb=new Integer[10];
		Array_pkc<Integer> ap2=new Array_pkc<Integer>();
		ap2.setArr(bb);
		ap2.add(99);	
		ap2.add(88);	
		System.out.println(bb[0]+" "+bb[1]);
		
//		Date[] cc=new Date[10];
//		Array_pkc<Date> ap3=new Array_pkc<Date>();
//		ap3.setArr(cc);
//		ap3.add(99);	
//		ap3.add(88);	
//		System.out.println(cc[0]+" "+cc[1]);
	}

}
