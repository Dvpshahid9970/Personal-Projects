package Student_Manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class StudentDao {
   public static Boolean inseretDB(StudentDetail st) {
	   Boolean flag = false;
	   try {
		Connection con = ConDB.createCon();
		   String query = "insert into students(sname,scontact,scity) values(?,?,?);";
		   
		   PreparedStatement pstm = con.prepareStatement(query);
		   
		   pstm.setString(1,st.getsName());
		   pstm.setString(2, st.getsContact());
		   pstm.setString(3,st.getsCity());
		   
		   pstm.executeUpdate();
		   flag = true;
		   pstm.close();
	}  catch (SQLException e) {
		e.printStackTrace();
	}
	   return flag;
   }
   

public static void displayDB() {
	
	 try {
			Connection con = ConDB.createCon();
			   String query = "select * from students;";
			   
			  Statement stm = con.createStatement();
			   ResultSet rs = stm.executeQuery(query);
			   
			   while(rs.next()) {
			  
				  System.out.println("ID : "+rs.getInt(1));
				  System.out.println("NAME : "+rs.getString(2));
				  System.out.println("CONTACT : "+rs.getString(3));
				  System.out.println("CITY : "+rs.getString(4));
				  System.out.println("=======================================");
			   }
			   stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
}


public static Boolean deleteDB(int sId) {
	 Boolean flag = false;
		try {
			Connection con = ConDB.createCon();
			String query = "delete from students where sId = ?;";
			
			 PreparedStatement pstm = con.prepareStatement(query);
			   
			   pstm.setInt(1,sId);
			   pstm.executeUpdate();
			   flag = true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
}


public static Boolean UpdateDB(String name,int id) {
	 Boolean flag = false;
	   try {
		Connection con = ConDB.createCon();
		   String query = "update students set sName=? where sId=?;";
		   
		   PreparedStatement pstm = con.prepareStatement(query);
		   
		   pstm.setString(1, name);
		   pstm.setInt(2,id);
		   
		   pstm.executeUpdate();
		   flag = true;
		   pstm.close();
	}  catch (SQLException e) {
		e.printStackTrace();
	}
	   return flag;
	
}





}
