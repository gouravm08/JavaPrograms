import java.util.Scanner;
class Std1
{
	public static void main(String args[])
 {
 	Scanner scan=new Scanner(System.in);
 	System.out.println("Enter how many Number u want to store");
 	int n=scan.nextInt();
 	System.out.println("Enter how much do u rotate left");
 	int d=scan.nextInt();
 	System.out.println("Enter "+n+" Number");
 	int []a=new int[n];
 	 for(int i=0;i<n;i++)
 	 	a[(i+n-d)%n]=scan.nextInt();
 	 for(int i=0;i<n;i++)
 	 	System.out.print(" "+a[i]);
    
 } 

}