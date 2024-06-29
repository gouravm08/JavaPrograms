//Median of two sorted arrays of different sizes
/*
ar1[] = {-5, 3, 6, 12, 15}
        ar2[] = {-12, -10, -6, -3, 4, 10}
Output : The median is 3.
Explanation : The merged array is :
        ar3[] = {-12, -10, -6, -5 , -3,
                 3, 4, 6, 10, 12, 15},
       So the median of the merged array is 3

*/
import java.util.*;
class MedianOfArray
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
        TreeSet ts=new TreeSet();		
		int []a=new int[n];
		int n1=sc.nextInt();
		int b[]=new int[n1];
		for(int i=0;i<n;i++)
			{a[i]=sc.nextInt();
             ts.add(a[i]);
			}
		for(int j=0;j<n1;j++){
			b[j]=sc.nextInt();
			ts.add(b[j]);
		}

		System.out.println(ts);
        Iterator it=ts.iterator();
        int count=0;
        System.out.println(ts.size());

        while(it.hasNext())
        {
        	//count++;
        	//if(count==ts.size()/2)
        		System.out.println(it.next());

        }
        /*int mid=(n+n1)/2;
        if(mid%2==0)
        	mid=mid;
        else mid+=1;
        for(int i=0;i<ts.size();i++)
        {
          if(mid==i)
          	System.out.println(ts.get(i));
        }*/
	}
}