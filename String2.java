//java program to count total character in a string
import java.util.*;
class string1{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String ");
		String s=scan.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			count++;
		}
		System.out.println("total character in string is "+count);
	}
}