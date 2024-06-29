import java.util.*;
class JavaPractice
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    System.out.println("fsd");
		String s=sc.nextLine(); //nncncnnn
		char arr[]=new char[n];
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='c'&&i!=0)
		{
            
            arr[i]=arr[i+1]=arr[i+2]='i';
            arr[i-1]=arr[i-2]='i';       
            //res+=;

		}
		else{
			arr[i]='u';
		}
	}
	for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	}
}