package Date617;
import java.sql.SQLException;
import java.util.Scanner;
public class Mum_Test 
{

		
	public static void main(String[] args) throws SQLException 
	{
		Scanner sc=new Scanner(System.in);
		DB_MEM aa=new DB_MEM();
        String nameI=sc.next();
        String phoneI=sc.next();
        int ageI=sc.nextInt();
        
        aa.insert(nameI,phoneI,ageI);
	
	}

	
}
