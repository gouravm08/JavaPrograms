import java.util.*;
class TwinString
{
	public static String Swap(String s)
	{

		char []a=s.toCharArray();
		for(int i=0;i<a.length/2;i++)
		{
			char b=a[i];
			a[i]=a[i+2];
			a[i+2]=b;
		}
             System.out.println("Enter  "+new String(a));
		return new String(a);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
             System.out.println("Enter first String array count");

		int n=sc.nextInt();
             System.out.println("Enter first String array");
		sc.nextLine();
		String[] str=new String[n];
		for(int i=0;i<n;i++)
			str[i]=sc.nextLine();
		sc.nextLine();
             System.out.println("Enter second String array count");
		int n1=sc.nextInt();
		sc.nextLine();
             System.out.println("Enter second String array ");
		String []str1=new String[n1];
		for(int i=0;i<n1;i++)
           str1[i]=sc.nextLine();
       sc.nextLine();
         for (int i=0;i<n;i++) {
         	str[i]=Swap(str[i]);
           if(str[i].equals(str1[i]))
             System.out.println("yes");
             else 
             System.out.println("no");		
         }

	}
	
}