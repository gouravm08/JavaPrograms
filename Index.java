//Program to find positon of a character  in string
import java.util.Scanner;
class Index{
	public static void main(String[]args)
	{
	int i;
	Scanner sc=new Scanner(System.in);
	String s=new String();
	s=sc.nextLine();
	char arr[]=s.toCharArray();
	System.out.println("Enter Character you want to find index");
	char v=sc.next().charAt(0);
	for(i=0;i<arr.length;i++)
	 {
	  if(arr[i]==v)
    System.out.println(i+1+" position");
	 }
	}
}