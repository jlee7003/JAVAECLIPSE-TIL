package Date617;

import java.sql.SQLException;

public class DB_MEM_MAIN 
{

	public static void main(String[] args) throws SQLException 
	{
		DB_MEM dm =new DB_MEM();
		dm.insert("홍길동","0103983939",24);
		dm.insert("사람1","013333333",11,"제주도");

	}

}
