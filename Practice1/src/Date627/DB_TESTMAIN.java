package Date627;

import java.sql.SQLException;
import java.util.Scanner;

public class DB_TESTMAIN {

	public static void main(String[] args) throws SQLException 
	{
		int leh = 0;
		DB_TEST aa=new DB_TEST();
		Scanner sc=new Scanner(System.in);
		do
		{   leh=sc.nextInt();
			
			switch(leh)
			{
			case 1: aa.all_chul(); break;
			case 2: aa.name_chul(); break;
			case 3: aa.age_chul(); break;
			case 4: aa.juso_chul(); break;
				
			}
			
			
		}while(leh!=5);
		

	}

}
