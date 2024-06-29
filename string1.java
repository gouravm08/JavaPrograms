import java.util.Scanner;
//reverse a string
class String11{
public static void main(String[]args)
{
 Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  int i;
  char v;
  char t[]=s.toCharArray();
  int d=s.length();
  for(i=0;i<d/2;i++)
   {
    v=t[i];
    t[i]=t[d-1-i];
     t[d-1-i]=v;
   }
 System.out.println(t);
}

}