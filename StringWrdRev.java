//program to reverse word of a string sentence
import java.util.*;
class StringWrdRev
{
	public static void wordRev(String s)
	{
		String []arr=s.split(" ");
          int len=arr.length;
		 int i=0;
		while(i<len/2)
		{
			String t=arr[i];
			arr[i]=arr[len-1-i];
			arr[len-1-i]=t;
		    i++;
		}
		for (int j=0;j<len ;j++ ) {
		System.out.print(arr[j]+" ");
			
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
	wordRev(s);
	}
}