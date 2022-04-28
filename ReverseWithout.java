//program to reverse String without affecting special character
import java.util.*;
class ReverseWithout
{
	public static boolean isAlpha(char c)
	{
		return (c>='a'&&c<='z'||c>='A'&&c<='Z');
	}
	public void ReverseAlpha(String str)
	{
		System.out.println(str);
		char[] ch=str.toCharArray();
		int k=0;		
		int right=ch.length-1;
		int left=0;
	    while(left<right)
		{
			if(!isAlpha(ch[left]))
				left++;
			else if(!isAlpha(ch[right]))
				right--;
			else{
				char t=ch[left];
				ch[left]=ch[right];
				ch[right]=t;
			left++;
			right--;
			}
		
     	System.out.println(ch[k++]);

		  
	 }
		System.out.println(ch.length);
	 str=new String(ch);
     //for(int i=0;i<ch.length;i++)
     	System.out.print(str+"A");
     	System.out.println();

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		ReverseWithout rs=new ReverseWithout();
		rs.ReverseAlpha(str);


	}
}