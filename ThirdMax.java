//program to find third max of an array
import java.util.*;
class ThirdMax
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Etner n");
       int n=sc.nextInt();
       int a[]=new int[n];
		 System.out.println("Etner "+n+" element");
       for(int i=0;i<n;i++)
       	a[i]=sc.nextInt();
       int max=0,smax=0,tmax=0;
       max=smax=tmax=a[0];
       for(int i=0;i<n;i++)
       {
       	if(a[i]>max)
       	{
       		tmax=smax;
       		smax=max;
       		max=a[i];
       	}
       	else if(a[i]<max&&a[i]>smax)
       	{
       		tmax=smax;
       		smax=a[i];
       	}
       	else if(a[i]<max&&a[i]<smax&&a[i]>tmax)
       	{
       		tmax=a[i];
       	}
       }
      System.out.println(max+" "+smax+" "+tmax);
	}
}