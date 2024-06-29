import java.util.*;
class StarPattern
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
				System.out.println("Enter n ");
		int n=sc.nextInt();	
		n=n%2==0?n+1:n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i<=n/2){
				if(i-j>0||j+i>n+1)
					System.out.print(" ");
				else System.out.print("*");
                 }
             else{
             	  if(i+j<=n||j-i>0)
             	  	System.out.print(" ");
             	  else System.out.print("*");

             }
			}
			System.out.println("");
		}
}
}

