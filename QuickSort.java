import java.util.*;
class QuickSort
{
	public void swap(int a[],int i,int j)
	{
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	public int partition(int a[],int l,int h)
	{
        
        int start=l;
        int end=h;
        int pivote=a[l];
        while(start<end)
        {
        	while(a[start]<= pivote)
        		start++;

             while(a[end]>pivote)
        		end--;
             
           if(start<=end)
           {
          	//swap(a,start,end);
           	a[start]=a[start]+a[end]-(a[end]=a[start]);
           }	
        }
        //swap(a,l,end);
         	a[l]=a[l]+a[end]-(a[end]=a[l]);
        return end;
    }
        
	public void quickSort(int arr[],int l,int h)
	{
		if(l<h)
		{
			int j=partition(arr,l,h);
			quickSort(arr,l,j-1);
			quickSort(arr,j+1,h);
		}

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		QuickSort p=new QuickSort();
		System.out.println("Enter "+n+" elemtn");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
          p.quickSort(arr,0,n-1);
          for(int i=0;i<n;i++)
          	System.out.print(arr[i]+" ");
	}
}