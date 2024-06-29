//Given a string, print all possible palindromic partitions
/*
n i t i n
n iti n
nitin
*/
import java.util.*;
class PalindromicPartitions
{
	public static void pelindrom(String str)
	{
		int len=str.length();
		boolean flag=false;
		for(int i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i)!=str.charAt(len-1-i))
			{
				flag=true;
				break;
			}
		}
		if(flag==false)
			System.out.println(str);
	}
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       for(int i=0;i<str.length();i++)
       {
       	 for(int j=i+1;j<str.length()+1;j++)
       	 {
			//System.out.println(str.substring(i,j));
              
       	 	pelindrom(str.substring(i,j));
			//System.out.println();

       	 }
       }		
	}
}