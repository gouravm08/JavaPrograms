//Maximum product of indexes of next greater on left and right
import java.util.*;
class IntDemo
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
          int a[]={5,4,3,4,5};
          int n=a.length;
          int l[]=new int[a.length];
          int r[]=new int[a.length];

          for(int i=0;i<n;i++)
          {
          	for(int j=i+1;j<n;j++)
          	{
          		if(a[j]>a[i])
          			l[i]++;
          		else l[i]=0;
          	}
          }
          for(int i=n-1;i>=0;i--)
          {
          	for(int j=i-1 ;j>=0;j--)
          	{
          		if(a[j]>a[i])
          			{r[i]=a[j];break;}
          		else r[i]=0;
          	}
          }
          for(int i=0;i<n;i++)
          {
          	System.out.print(l[i]+" ");
          }
    System.out.println();
          for(int i=0;i<n;i++)
          {
          	System.out.print(r[i]+" ");
          }
          int max=0;
           System.out.println();
          for(int i=0;i<n;i++)
          {
          	if(r[i]*l[i]>max)
          		max=r[i]*l[i];
          }
          System.out.println(max);
	}
}