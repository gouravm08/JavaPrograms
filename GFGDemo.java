import java.util.Scanner;
class GFGDemo
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      int n =sc.nextInt();
      int a[]=new int[n];
      int f[]=new int [n];
      int k=0;
      while(k<n)
      {
      	a[k]=sc.nextInt();
      	k++;
      }
      for(int i=0;i<n;i++)
      {
      	for(int j=0;j<n;j++)
      	{
      		if(a[i]==a[j])
      			f[i]++;
      	}
      }
      for(int i=0;i<n;i++)
      {
         for(int j=i+1;j<n;j++)
         {
         	if(f[j]>f[i])
         	{
         		System.out.print(a[j]+" ");
         	   break;
         	}
         	else{
          System.out.print(" -1 "); 	
           break;      
              }
     }
      }
	}
}