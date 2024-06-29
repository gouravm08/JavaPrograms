//program to find minimum number of swapping required for sorting an array
import java.util.Scanner;
class Array
{
	public static void main(String[] args)
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter n");
    	int n=scan.nextInt();
    	int[] arr=new int[n];
    	 for(int j=0;j<n;j++)
    	 	arr[j]=scan.nextInt();
    	 int c=0,t,i=0;
    	 n=arr.length;
    	   while(i<n)
    	   {
              if(arr[i]!=i+1)
              {
              	t=arr[i];
              	arr[i]=arr[t-1];
              	arr[t-1]=t;
              	c++;
              }
              else
              	i++;
    	   }
    	   System.out.println("minimum swapping required is "+c);
	}
}