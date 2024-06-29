 import java.util.*;
class StringPermutation
{  
	public  static void printPermutation(String s,int l,int r )
	{
		/*if(l==r)
			System.out.println(s);
		else{
		for(int i=l;i<=r;i++)
		 {
		   s=swap(s,l,i);
		   printPermutation(s,l+1,r);
		   s=swap(s,l,i);
		 } 
	    }*/

	    if(l==r)
	    	System.out.println(s);
	    else{
	    	for(int i=l;i<=r;i++)
	    	{
	    		s=swap(s,l,i);
	    		printPermutation(s,l+1,r);
	    		s=swap(s,l,i);
	    	}
	    }
	}
	public static String swap(String str,int i,int j)
	{
		char []ch=str.toCharArray();
		char c=ch[i];
		ch[i]=ch[j];
		ch[j]=c;
       return String.valueOf(ch);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		printPermutation(s,0,s.length()-1); 
	}
}