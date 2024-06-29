import java.util.*;
class ChegTest2{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int a[]=new int[n];
  for(int i=0;i<n;i++)
  	a[i]=sc.nextInt();
	 int k=sc.nextInt();
	int iteration=n-k;
	int index=0;
	int c=0;
	 for(int i=0;i<n-k;i++)
	 {  
	 	if(a[i]<a[i+1])
	 	{
	 		c++;
	 	}
	 	
	 }
	 System.out.println(c);
	
 }
}