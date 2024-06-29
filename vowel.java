//java program to find vowels
import java.util.*;
class vowel{
	 public static void main(String[] args)
	 {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter String");
       String s=scan.nextLine();
         s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
        	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
        		System.out.println("Vowels are "+s.charAt(i));
        }
		
	}
}