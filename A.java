//program to find maximum and second maximum from an array
import java.util.Scanner;
class A{
	public static void main(String[]args){
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter "+n+" number");
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
    int max,secmax;
    max=secmax=a[0];
      for(int i=0;i<n;i++)
      {
        if(a[i]>max)
        	{
        		secmax=max;
        		max=a[i];
        	}
        if(a[i]>secmax&&a[i]<max)
          secmax=a[i]; 
      }
    System.out.println("max num "+max);
    System.out.println("second max "+secmax);
	}
}