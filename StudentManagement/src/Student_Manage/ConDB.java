package Student_Manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConDB {
   static Connection con = null;
   
   public static Connection createCon(){
	    try {
			String url = "jdbc:mysql://localhost:3306/student_management";
			String user = "root";
			String password = "shah1d@9970;";
			
			con = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return con;
   }
}
