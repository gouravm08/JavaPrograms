import java.util.*;
class GCDinArray
{
 public int HCF(int input1,int input2[])
 {
   int gcd=input2[0];
    int j=1;
    while(j<input1)
    {
       if(input2[j]%gcd==0)
       {
           j++;
       }
       else
       {
           gcd=input2[j]%gcd;
           j++;
       }
    }
    return gcd;
}
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int a[]=new int[n];
  for(int i=0;i<n;i++)
   a[i]=sc.nextInt();
  System.out.println(new GCDinArray().HCF(n,a));
}
}