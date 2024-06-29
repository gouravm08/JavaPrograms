import java.util.*;
class BinarySearchRecursion
{
	public void binarySearchMethod(int a[],int s,int l,int key)
	{
		if(s>l){
			System.out.println("not found");
		  return;
		}
		int mid=(s+l)/2;
		if(key==a[mid])
			System.out.println("found at"+ (mid+1));
		else if(key>a[mid])
			binarySearchMethod(a,mid+1,l,key);
		else if(key<a[mid])
			binarySearchMethod(a,s,mid-1,key);
		
			

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("enter search key");
		int k=sc.nextInt();
		BinarySearchRecursion br=new BinarySearchRecursion();
	     br.binarySearchMethod(a,0,n-1,k);
	}
}