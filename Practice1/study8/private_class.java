import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class private_class {

	private String pwd="1234";
	private Connection conn;
	

	 
	 
	 public Connection return_db()
	 {
		 return conn;
	 }
	public String check(String pwd){
		return pwd;

	}
	 private_class(String pwd) throws SQLException
	{
		
			if (this.pwd == pwd)
			{
				System.out.println("맞음");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/java?useSSL=false", "root", "1234");
			}
			else
				System.out.println("틀림");
				
	}
}
