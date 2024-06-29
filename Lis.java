import java.util.*;
class Lis
{
	public static int check(String str,String search)
	{
		String[] arr=str.split(" ");
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(search))
				c++;
		}
		return c;
	}
	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
          System.out.println("enter word u want to search");
          String search=sc.next();
          int n=check(str,search);
          System.out.println(n);
	}
}