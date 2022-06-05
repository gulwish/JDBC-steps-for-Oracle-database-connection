package jdbc_steps;
import java.sql.*;
public class JDBC_39 {

	public static void main(String[] args) throws Exception{
		
		String url=" jdbc:mysql://localhost: 3306/studentdb"; //nmae of db
		 String password=")#!!)#&#@&*Gul";
	String 	user = " root"; 
	try {
	//	jdbc:mysql://localhost: 3306/studentdb
		Class.forName("com.mysql.jdbc.Driver"); 
	
Connection con= DriverManager.getConnection(url, user, password);
String query = "select name from  studentdb.stdnt where age=20; "; // name of table 
Statement stmt= con.createStatement();// to perform  a query 
 ResultSet rset= stmt.executeQuery(query); //to pocess the query 
 rset.next();// b/f fetching the value 
  String name =rset.getString(2);
  System.out.println(name);
  stmt.close();
  con.close();
	}
	catch( Exception mistake ) {
System.out.println(" mistake "+ mistake.getMessage());
	}}}
	
