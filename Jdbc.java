import java.sql.*;
import java.util.*;
class Jdbc
{
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		System.out.println("ENter Name");
		 String Name=sc.nextLine(); 
		System.out.println("ENter Email");
		String Email=sc.nextLine();
		System.out.println("ENter Contact");
		String Contact=sc.nextLine();
		System.out.println("ENter Password");
		 String Password=sc.nextLine();
		try{
		Class.forName("com.mysql.jdbc.Driver");
	     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
	     PreparedStatement ps=con.prepareStatement("SELECT  * FROM admin WHERE `name`=? ");
          ps.setString(1,Name);
          //(`name`,`email`,`mobile`,`password`)
          //ps.setString(2,Email);
          //ps.setString(3,Contact);
          //ps.setString(4,Password);
	      ResultSet rs=ps.executeQuery();
	     while(rs.next())
	     	System.out.println("   "+rs.getString("name")+"   "+rs.getString("email")+"   "+rs.getString("mobile")+"   "+rs.getString("password"));
	     //else System.out.println("failed");
	}
	catch(Exception r)
	{
		r.printStackTrace();
	}
}
}