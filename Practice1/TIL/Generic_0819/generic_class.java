package Generic_0819;


//제네릭이란?

//제네릭(Generic)은 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법을 의미한다. 말이 어렵다.  
//-> 같은 클래스에 다른 자료형을 사용하는 것

class Test4<A> // T는 자료형 -> T는 들어오는 자료형에 맞추어서 동작하게 하자는 문법(반드시 T가 아니여도 사용 가능함,T는 c언어의 템플릿에서 유례)
				// T에 스트링이 들어오면 스트링 ,int가 들어오면 int
{
	private A kor;// 자료형만 다르다면 이름이 같아도 상관이 없음

	public A getName() {
		return kor;
	}

	public void setName(A kor) {
		this.kor = kor;
	}
}

public class generic_class {

	public static void main(String[] args) { //동작은 같은데 자료형만 다를 경우 이렇게하면 편함
		 								     //하나의 클래스로 자료형이 다를때 유용하게 쓸 수 있다.
		Test4<Integer> t1 = new Test4<Integer>(); //대신 초기화 할떄 옆에다가 자료형을 적어주어야 함
		t1.setName(100);
		System.out.println(t1.getName());
		Test4<String> t2 = new Test4<String>();
		t2.setName("홍길동");
		System.out.println(t2.getName());
		Test4<Boolean> t3=new Test4<Boolean>();
		t3.setName(true);
		System.out.println(t3.getName());
	}

}
