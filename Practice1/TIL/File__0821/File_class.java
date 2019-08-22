package File__0821;

import java.io.File;

public class File_class
{
	
	 public static void main(String[] args) 
	 {
		 File f1= new File("c:/windows"); //폴더, 파일의 이름
		 System.out.println(f1.isDirectory());
		 String[] tt=f1.list();
		 for(int i=0; i<10; i++)
		 System.out.println(tt[i]);
		 
		 
		 
		 File f2= new File("c:/euihos");
				 
//		 System.out.println(f2.getName());
//		 System.out.println(f2.canExecute());//실행
//		 System.out.println(f2.exists());//존재
//		 System.out.println(f2.isFile());//파일인가
//		 System.out.println(f2.isDirectory());//디렉토리인가
//		 System.out.println(f2.length());//길이
//		 
		 
	}

}
