import java.util.*;
class Team
{
	public static void main(String[] args) {
		  String s;
		  Scanner sc =new Scanner(System.in);
		  s=sc.nextLine();
		  int i=0;
		  int open=0;
		  int close=0;
		  while(i<s.length())
		  {
          if(s.charAt(i)=='{')
          	open++;
          else if(s.charAt(i)=='}')
          	close++;
          i++;
		  }
		  if(open==close)
		   System.out.println(open+close);
		else  System.out.println("can't be made");
	}
}