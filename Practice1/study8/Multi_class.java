class Parent1 {
	public void aa() {
		System.out.println("Parent1");
	}
}

class Parent2 {
	public void bb() {
		System.out.println("Parent2");
	}
}

class Son3 extends Parent1 // extends Parent1,Parent2 -> 자바는 다중상속시에 에러가 발생함 ,c++은 가능
			// 하나만 상속 받아야함 interface는 다중구현이 가능함
{
	public void son3_bb() { //Parent1을 상속 받음
		Parent2 p2 = new Parent2();
		p2.bb();

	}
}

public class Multi_class {
	public static void main(String[] args) {

Son3 s3=new Son3(); 
s3.aa();
s3.son3_bb();
}
}