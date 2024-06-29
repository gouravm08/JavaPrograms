//program to find Next Greater Elements from an array
import java.util.*;
class NGE{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter n");
		int n=sc.nextInt();
		int i=0;
		System.out.println("Enter "+n+" number");
		while(i<n)
		{
			a[i]=sc.nextInt();
			i++;
		}
		for(int j=0;j<n;j++)
		{
          for(int k=j+1;k<n;k++)
          {
          	if(a[k]>a[j])
          	{
                 System.out.print(a[k]+" ");
                 break;
          	}
          	else
          	{
                 System.out.print(" -1 ");
          	}
          }
		}
	}
}