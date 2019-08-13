import java.io.FileNotFoundException;
import java.io.FileReader;

//throw는 예외처리를 메소드 내에 발생 되는 예외를 
//메소드 내에서 처리하지 않고 메소드를 호출한 곳으로 예외처리를 넘기는 것
public class throw1 {
	public static void main(String[] args) throws FileNotFoundException {
	//메인클래스는 자바 가상머신이 호출함
		//main에서 throw를 쓰는 것은 의미가 없다, 실제로는 하지 않는것
		FileReader f1=new FileReader("d:/ab.txt");
	}

}
//throw를 쓰는 이유??

//내가 작업하는 소스에 메소드를 호출하는데 예외가 발생한 경우 throw로 다른 사람에게 넘기는 것
//내가 예외 처리를 못할때
