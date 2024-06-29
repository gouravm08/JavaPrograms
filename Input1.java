import java.io.*;
class Input1{
	public static void main(String[]args) throws Exception
	{ int c=0;
	 File f=new File("C:\\Users\\Gaurav\\Documents");
	 String s[]=f.list();
	 for(String s1:s){
	 	 File f1=new File(f,s1);
	 	//if(f1.isFile()) 
	 	//{
	 	c++;
	    System.out.println(s1);
	  // }
	}
  		System.out.println(c);
	}
}