//program to remove duplicates of a sorted array
import java.util.*;
class ArrayDuplicatesMethod
{
	public static int removeDupli(int a[],int n)
	{
		if(n==0||n==1)
			return n;
		int j=0;
		for(int i=0;i<n-1;i++)
			if(a[i]!=a[i+1])
				a[j++]=a[i];
			a[j++]=a[n-1];
			return j;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();

			n=removeDupli(arr,n);
             for(int i=0;i<n;i++)
             	System.out.print(arr[i]+" ");
	}
}