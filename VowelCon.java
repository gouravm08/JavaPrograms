import java.util.*;
//to find number of vowel and consonant
class Char
{
  
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
     int i,c=0,d=0;
   System.out.println(s.length());
     for(i=0;i<s.length();i++)
 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
        c++;
 else if(s.charAt(i)==' ')
        continue;
else d++;
    System.out.println(c);
    System.out.println(d);
 }

}