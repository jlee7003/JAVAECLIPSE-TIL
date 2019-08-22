package File__0821;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\APM_Setup\\htdocs/4290.html");
		// 파일을 읽어오는 기능
		int tt;
		//fr.read() 값이 없다면 -1이다.
		long start=System.currentTimeMillis();//1970년도 1월 1일 기준 초 단위
		
//		while ((tt = fr.read()) != -1) // 왜 이상하게 나오지? //한문자씩 나옴 //tt변수에 넣으면 정상적으로 출력 된다.
//		{
//			System.out.print((char)tt);
//
//		}
		//배열을 이용해서 read() 함수를 이용하여 배열 크기만큼 불러오기
		char[] input=new char[100]; 
		String str="";
		while((tt=fr.read(input)) != -1)
		{
			str= str+new String(input,0,tt);//배열에 있는 아스키 값을 문자로 =>0~tt 까지
		
		}
		
		System.out.println(str);
		long end=System.currentTimeMillis();//1970년도 1월 1일 기준 초 단위
		System.out.println("소모시간 :"+(end-start));
		System.out.println(tt);

//	for(int i=1;i<1500;i++)
		fr.close();
	}
}