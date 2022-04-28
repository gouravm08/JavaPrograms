//program to find String pelindrom
import java.util.*;
class StringPelindrom
{
	public static boolean isPelindrom(String s)
	{
		int l=s.length();
		boolean flag=false;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=s.charAt(l-1-i))
			{
				flag =true;
				break;
			}
		}
		if(flag)
			return false;
		else return true;
	}
	public static void main(String[] args) {
		System.out.println("enter string");

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
        String[] s1=s.split(" ");
        for(int i=0;i<s1.length;i++)
        {
        	if(isPelindrom(s1[i]))
        		 System.out.println(s1[i]);
        		else System.out.println("not");
        }
	}
}