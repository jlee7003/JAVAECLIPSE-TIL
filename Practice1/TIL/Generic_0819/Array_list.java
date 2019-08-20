package Generic_0819;

//배열에는 몇가지 불편한 점이 있는데 그 중의 하나가 정해진 배열의 크기를 변경 할 수 없는 점이다.
//이러한 불편함을 컬렉션즈 프레임워크를 사용하면 줄어든다.
//Arraylist는 크기를 미리 지정하지 않기 때문에 얼마든지의 많은 수의 값을 저장 할 수 있다!
import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		ArrayList<String> tt=new ArrayList<String>();
		
		tt.add("홍길동");
		tt.add("슈퍼맨");
		tt.add("아인슈타인");
		tt.add("원더우먼");
		tt.add("아이언맨");
		System.out.println("index 1:"+tt.get(1));
		System.out.println("리스트 크기:"+tt.size());
		System.out.println(tt.isEmpty()); //비었는지 아닌지 확인
		System.out.println(tt.indexOf("슈퍼맨")); //인덱스 값을 가지고 오는것
		System.out.println(tt.contains("원더우먼"));
		tt.remove(1); //1이  없어졌으므로 아인슈타인이 1번이 됌
		System.out.println(tt.get(1));
		
		
		ArrayList<Integer> ss=new ArrayList<Integer>();
		
		ss.add(90);//배열에 집어넣기
		ss.add(80);
		ss.add(70);
		ss.add(60);
		
		System.out.println(ss.get(0));//ss의 0번째 배열 불러오기
	}
	

}
