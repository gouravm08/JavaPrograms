import java.util.*;
import java.util.Arrays;
//to find prime series 
class Prime
{
   public static void main(String[]args)
  {  Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int n1=sc.nextInt();
     for(int i=n;i<=n1;i++)
     { boolean flag=false;
      for(int j=2;j<=i/2;j++)
      {
        if(i%j==0)
        {
         flag=true;
         break;
        }
       
      }
       if(flag==false)
        {
          System.out.println("Prime "+i);
        }
     }
  }
}
