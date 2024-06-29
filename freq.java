//program to find frequency of character in a string
import java.util.*;
class freq{
	public static void main(String args[])
	{
		int i,j;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		String s=scan.nextLine();
         int v=s.length();
         int f[]=new int[v];
         char str[]=s.toCharArray();
         for( i=0;i<v;i++)
         {     f[i]=1;
         	for( j=i+1;j<v;j++)
         	{
         		if(str[i]==str[j])
         		{	f[i]++;
         		str[j]='0';
         	    }
         	}
         }
         for(i=0;i<f.length;i++)
         	if(str[i]!=' '&&str[i]!='0')
         		System.out.println(str[i]+" -> "+f[i]);	
	}
}