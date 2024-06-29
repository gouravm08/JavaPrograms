import java.util.Scanner;
class Sub
{
	public static void main(String[]args)
	{
	  String str;
	  
	  int k=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter string");
	  str=sc.nextLine();
	  System.out.println("Enter starting index and last index");
      int s_ind=sc.nextInt();
      int l_ind=sc.nextInt();
      char sub[]=new char[s_ind+l_ind];
      if(s_ind<=str.length()&&l_ind<=str.length())
      {
      	 if(s_ind>l_ind)
		System.out.println("-1");
	 else
	   {
	     for(int i=0;i<str.length();i++)
	     {
	       if(i>=s_ind&&i<l_ind)
	        sub[k++]=str.charAt(i);
 	     }
 	   System.out.println(sub);
	   }
     }
	else
	 System.out.println("invalid index");
 }
}