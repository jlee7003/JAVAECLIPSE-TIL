import java.io.FileNotFoundException;

import java.io.FileReader;

class Test1
{
	public void file_open() throws FileNotFoundException
	{//file open을 호출한 장소에게 예외처리를 넘긴다.
		FileReader f1=new FileReader("d:/ab.txt");
	}
}
public class throw2 {
	public static void main(String[] args)
	{
		Test1 t=new Test1();
		try //호출한 메소드에서 발생된 예외를 메소드를 호출한 곳에서 예외처리를 하는 방식 
		{
			t.file_open();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}

}
