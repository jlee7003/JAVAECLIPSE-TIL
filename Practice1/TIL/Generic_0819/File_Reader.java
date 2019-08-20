package Generic_0819;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\APM_Setup\\htdocs/4290.html");
		// 파일을 읽어오는 기능
		int tt;
		//fr.read() 값이 없다면 -1이다.
		while ((tt = fr.read()) != -1) // 왜 이상하게 나오지?
		{
			System.out.print((char)tt);

		}

//	for(int i=1;i<1500;i++)

	}
}