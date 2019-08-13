
public class 예외처리 {
public static void main(String[] args) {
	
int a=100;
int b=0;

int c=a/b;//예외가 발생하면 -> 프로그램이 종료된다.

//try catch를 쓰는 이유??

//-> 종료 혹은 먹통이 되는 현상을 막을려고
 
System.out.println(c);

System.out.println("계속 실행되는 문장들");

}

}
