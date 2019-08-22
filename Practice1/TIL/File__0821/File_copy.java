package File__0821;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_copy 
{
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("d:/c.txt");//읽어올 대상
		FileWriter fw=new FileWriter("d:/ccc.txt");//쓰는 대상
		
		int tt;
		//fr.read() 값이 없다면 -1이다.
		long start=System.currentTimeMillis();

		char[] input=new char[100]; 
		String str="";
		while((tt=fr.read(input)) != -1)//-1이면 글자가 없다는 뜻
		{
			str= str+new String(input,0,tt);
		
		}
		
		fw.write(str);
		fr.close();
		fw.close();
	}
}
