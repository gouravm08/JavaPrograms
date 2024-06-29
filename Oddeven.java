import java.util.*;
class Abc{
	//java program to find frequency of odd and even in an array
	public static void main(String args[])
   	{   int i,o=0,e=0;
   		Scanner scan=new Scanner(System.in);
   		System.out.println("enter how many element you want to store");
   		int n=scan.nextInt();
   		int a[]=new int[n];
		System.out.println("Enter"+n+" element");
		for(i=0;i<n;i++)
			a[i]=scan.nextInt();
		for(i=0;i<n;i++)
		{
			if(i%2==0)
				e++;
			else
				o++;
		}
		System.out.println("Number of Even element is "+e +" and odd element is "+o);
	}
}