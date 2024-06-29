//BAlanced Expression
import java.util.Scanner;
class STT
{
	static int count=0;
	static int j=0;
	static char [] arr=new char[10];
	public static void push(char r)
	{
       arr[j]=r;
       j++;
       count++;
	}
	public static void pop()
	{
		if(j!=-1)
		{char w=arr[j];
		j--;
		count--;
        }
         else return ; 
	}
	public static void main(String[] args)
	{
		char k;
        String s=new String();
        Scanner scan=new Scanner(System.in);
        s=scan.nextLine();
        char ex[]=s.toCharArray();
        for(int i=0;i<ex.length;i++)
        {
        	if(ex[i]=='('||ex[i]=='[')
        		push(ex[i]);
        	else if(ex[i]==')'||ex[i]==']')
        		pop();
        	else continue;
        }
        // if(k=='\0')
        // 	System.out.println("No elemt to pop");
         if(count==0)
        	System.out.println("BALANCED");
        else
        	System.out.println("NOT BALANCED");
	}
}