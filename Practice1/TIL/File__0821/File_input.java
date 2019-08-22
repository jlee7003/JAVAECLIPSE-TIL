package File__0821;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_input {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\APM_Setup\\htdocs/4290.html"); //stream -> 읽어온게 바이트 단위
		byte[]  input=new byte[100];
		String str="";
		int tt;
		tt=fis.read(); //>파일의 끝 -> 읽을게 없다 -> -1
		
		while((tt=fis.read(input)) != -1) 
		{
			str=str+new String(input,0,tt);//배열에 있는 아스키값
			
		}
		System.out.print(str);
//		System.out.println((char)fis.read());
	}
	
}
