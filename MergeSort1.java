import java.util.*;
class MergeSort1
{
	public void merge(int arr[],int l,int mid,int h)
	{
		/*int lsize=mid-l+1;
		int rsize=h-mid;
		int left[]=new int[lsize];
		int right[]=new int[rsize];
		for(int i=0;i<lsize;i++)
			left[i]=arr[l+i];
		for(int i=0;i<rsize;i++)
               right[i]=arr[mid+1+i];
           int i=0;
          int j=0,k=l;
           while(i<lsize&&j<rsize)
           {
           	if(left[i]<right[j])
           		arr[k++]=left[i++];
           	else arr[k++]=right[j++];
           }
           while(i<lsize)
           	arr[k++]=left[i++];
           while(j<rsize)
           	arr[k++]=right[j++];*/
	int lsize=mid-l+1;
	int rsize=h-mid;
	int left[]=new int[lsize];
	int right[]=new int[rsize];
	for(int i=0;i<lsize;i++)
		left[i]=arr[l+i];
	for(int i=0;i<rsize;i++)
		right[i]=arr[mid+1+i];
     int i=0;
     int j=0;
     int k=l;
	  while(i<lsize&&j<rsize)
	  {
	  	if(left[i]<right[j])
	  		arr[k++]=left[i++];
	  	else
	  		arr[k++]=right[j++];
	  }
	  while(i<lsize)
	  	arr[k++]=left[i++];
	  	  while(j<rsize)
	  	arr[k++]=right[j++];
	
	}
	public  void mergeSort(int arr[],int l,int h)
	{
		
		if(l<h)
		{
			int mid=l+(h-l)/2;
		/*	mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,h);
			merge(arr,l,mid,h);*/
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,h);
			merge(arr,l,mid,h);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		MergeSort1 p=new MergeSort1();
		System.out.println("Enter "+n+" elemtn");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
          p.mergeSort(arr,0,n-1);
          for(int i=0;i<n;i++)
          	System.out.print(arr[i]+" ");
	}
	
}