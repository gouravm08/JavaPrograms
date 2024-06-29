//binary search using Recursion
import java.util.Scanner;
class Binary
{
	public static int Binarysearch(int a[],int l,int h,int key)
	{
		if(l<=h)
		{
			int mid=(l+h)/2;
			if(a[mid]==key)
				return mid;
			else if(a[mid]>key)
				return Binarysearch(a,l,mid-1,key);
			else return  Binarysearch(a,mid+1,h,key);
		}
		else
		{
			return -1;
		}
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many value you want to store");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" element");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int l=0;
		int h=n-1;
		System.out.println("Enter element u want to search");
		int k=sc.nextInt();
		int index=Binarysearch(a,l,h,k);
		if(index!=-1)
		System.out.println("found at "+(index+1)+" Position");
	else  System.out.println("not found");
	}
}