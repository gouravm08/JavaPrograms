//Concatenated string with uncommon characters of two strings
import java.util.*;
class UncommonChars
{
	public static String ConcatenatedString(String s,String str)
	{
		String tr="";
		HashMap<Character,Integer> m=new HashMap<Character,Integer>();
            
            for(int i=0;i<str.length();i++)
                 m.put(str.charAt(i),2);
             
             for(int i=0;i<s.length();i++)
             	if(!m.containsKey(s.charAt(i)))
                       tr=tr+s.charAt(i);
                   else
                   	m.put(s.charAt(i),1);
             
                   for(int i=0;i<str.length();i++)
                   	if(m.get(str.charAt(i))==2)
                   		tr+=str.charAt(i);
   return tr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		String s=sc.nextLine();
		System.out.println("Enter second String");
		String str=sc.nextLine();
System.out.println(ConcatenatedString(s,str));
	}
}