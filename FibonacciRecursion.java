import java.util.*;
class FibonacciRecursion
{
	public static int fib(int n)
	{
        if(n<=1)
        	return n;
        else return fib(n-2)+fib(n-1);
	}
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>=0)
		{
	       System.out.print(" "+fib(n));
	       n--;	
     	}
	}
}