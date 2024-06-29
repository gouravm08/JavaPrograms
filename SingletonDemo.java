import java.sql.*;
import java.util.*;
class Connectiondemo{
 private static Connection con=null;
 private Connectiondemo(){}
  public static Connection getCon()
  {  
  	if(con==null)
  	 {
  		try
  		{
         Class.forName("com.mysql.jdbc.Driver");
	    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginregister","root","");
       }
     catch(Exception e){
     	System.out.println(e);
       }
  	 }
  	return con;
  }
}
class SingletonDemo
{
   public static boolean iscont(String contact)
   {  boolean flag=false;
     try{
        Connection con=Connectiondemo.getCon();
        PreparedStatement ps=con.prepareStatement("select * from employee WHERE emp_contact=?");
        ps.setString(1,contact);
         ResultSet rs=ps.executeQuery();
        if(rs.next()==true)
        	flag=false;
        else flag=true;
    }
    catch(Exception e)
     { 
     	System.out.println(e);
     }
   return flag;
   }
	public static void add()
	{
		 Scanner sc=new Scanner(System.in);
		 String contact;
		Connection con=Connectiondemo.getCon();
		System.out.println("ENter Name");
		 String Name=sc.nextLine(); 
		 while(true){
		  System.out.println("ENter Contact");
	    	 contact=sc.nextLine();
	    	if(iscont(contact)==true)
	    		break;
	    	else System.out.println("Contact already exist ");
	           }
		System.out.println("ENter address");
		 String address=sc.nextLine();
		System.out.println("ENter sal");
		int sal=sc.nextInt();
		 try{
		  PreparedStatement ps=con.prepareStatement("insert into employee(`emp_name`, `emp_sal`, `emp_contact`, `emp_address`) values(?,?,?,?)");
		         ps.setString(1,Name);
		         ps.setInt(2,sal);
		         ps.setString(3,contact);
		         ps.setString(4,address);
		         int a=ps.executeUpdate();
		         if(a!=0)
		         	System.out.println("success");
		         else System.out.println("failed");
		     }
		     catch(Exception e){System.out.println(e);}
	}
	public static void show()
	{
		try{
        Connection con=Connectiondemo.getCon();
        PreparedStatement ps=con.prepareStatement("select * from employee");
        ResultSet rs=ps.executeQuery();
        System.out.println("ID\tNAME\tSALARY\tCONTACT NUM\tADDRESS");
        while(rs.next())
        {
           System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
        }
       }
       catch(Exception e)
      {
     	System.out.println(e);
      }  
	}
	   public static void  pshow(int id)
      {
      	try{
        Connection con=Connectiondemo.getCon();
        PreparedStatement ps=con.prepareStatement("select * from employee WHERE emp_id=?");
        ps.setInt(1,id);
        ResultSet rs=ps.executeQuery();
        System.out.println("ID\tNAME\tSALARY\tCONTACT NUM\tADDRESS");
        while(rs.next())
        {
           System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
        }
       }
       catch(Exception e)
      {
     	System.out.println(e);
      }  
	}
	public static void update()
	{
		Connection con=Connectiondemo.getCon();
		Scanner sc=new Scanner(System.in);
		String name=null;
		int sal=0;
		String address=null;
		String contact=null;
		System.out.println("enter id of student");
		int id=sc.nextInt();
	       pshow(id);
	       System.out.println("enter in which part do u want to change\n1.name\n2.address\n3.contact\n");
	       int ch=sc.nextInt();
	       switch(ch)
	       {
	       	case 1:System.out.println("enter new name");
	       	    sc.nextLine();
	       	   name=sc.nextLine();
	       	   break;
	       	   case 2:System.out.println("enter new address");
	       	    address=sc.nextLine();
	       	   break;
	       	   case 3:while(true){
	                  System.out.println("enter contact of employee");
	                   contact=sc.nextLine();
	                  if(iscont(contact)==true)
	    		       break;
	            	else 
	            		System.out.println("Contact already exist ");
	                 }
                 break;
                 default: System.out.println("INVALID choice"); 
	       }
		/*sc.nextLine();
	       System.out.println("enter name of employee");
	       name=sc.nextLine();
	       while(true){
	       System.out.println("enter contact of student");
	       contact=sc.nextLine();
	       if(iscont(contact)==true)
	    		break;
	    	else System.out.println("Contact already exist ");
	        }
	       System.out.println("enter address of student");
            address=sc.nextLine();
              System.out.println("enter salary of student");
	       sal=sc.nextInt();*/
		try{
          PreparedStatement ps=con.prepareStatement("update employee SET emp_name=?  OR emp_contact=? OR emp_address=? WHERE emp_id=?");
            ps.setString(1,name);
            //ps.setInt(2,sal);
            ps.setString(2,contact);
            ps.setString(3,address);
            ps.setInt(4,id);
            int a=ps.executeUpdate();
            if(a!=0)
              System.out.println("UPDATED SUCCESSFULLY");
          else System.out.println("NOT UPDATED OR INVALID DETAILS");
		}catch(Exception e)
		{
        System.out.println(e);
		}
	}
	public static void Delete()
	{
		Scanner sc=new Scanner(System.in);	
	  	System.out.println("Enter id u want to delete");
	  	int id=sc.nextInt();
	  	pshow(id);
	  	try
	  	{
	  		Connection con=Connectiondemo.getCon();
	  		PreparedStatement ps=con.prepareStatement("delete  from employee WHERE emp_id=?");
	  		ps.setInt(1,id);
	  		int a=ps.executeUpdate();
	  		if(a!=0)
	  			System.out.println("SUCCESSFULLY DELETED");
	  		else 
	  	         System.out.println("some problem occured or data is not present ");

	  	}catch(Exception e){
	  		System.out.println(e);
	  	}
	}
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);	
	   while(true){
	  	System.out.println("1.ADD employee");
	  	System.out.println("2.show employee");
	  	System.out.println("3.update employee");
	  	System.out.println("4.Delete employee");
        System.out.println("5.exit");
         System.out.println("enter ur choice");
        int ch=sc.nextInt();
	  	switch(ch)
	  	{
	  		case 1:add();
	  		break;
	  		case 2:show();
	  		break;
	  		case 3:update();
	  		break;
	  		case 4:System.out.println("ARE YOU SURE? press y for yes AND N for NO");
	  		sc.nextLine();
	  		String cnfrm=sc.nextLine();

	  		if(cnfrm.equalsIgnoreCase("y"))
	            {  Delete();
	            	break;
                }
	  		else  
	  			break;
	  		case 5:System.exit(1);
	  		break;

	  	}
	}
  } 
}
