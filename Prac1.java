import java.util.Scanner;
class Prac1{
  public static void main(String[]args)
  {
  	int i,j;
  	Scanner scan=new Scanner(System.in);
  	System.out.println("Enter value of n");
  	int n=scan.nextInt();
  	for(i=0;i<n;i++)
  	{
  		for(j=0;j<=i;j++)
  			System.out.print("*");
  		System.out.println();
  	}

  }
	
}