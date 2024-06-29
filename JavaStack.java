import java.util.*;
class JavaStack
{
	static  int stk[]=new int[10];
	  static int top=-1;
	public static void push()
	{
	     Scanner scan=new Scanner(System.in);	
		if(top>9)
			System.out.println("Stack is overflow");
		else
		{
			System.out.println("enter data");
			int data=scan.nextInt();
			stk[++top]=data;
			System.out.println("SUCCESSSFULLY INSERTED");
		}
	}
	public static boolean pop()
	{
		if(top==-1)
			return true;
		else
		{
			System.out.println(stk[top]);
			top--;
			return false;
		}

	}
	public static void display()
	{ 
		if(top==-1)
		{
			System.out.println("Stack is empty");
			return;
		}
		for(int i=0;i<=top;i++)
			System.out.print(stk[i]+" ");
		System.out.println();

	}
	public static void peak()
	{

      if(top==-1)
      	System.out.println("Stack is underflow");
      else
      	System.out.println("peak is"+stk[top]);
	}
	public static void main(String[]args)
	{
	   Scanner scan=new Scanner(System.in);
	   boolean v=false;
	   while(true)
	 {
	   System.out.println("1.push");
	   System.out.println("2.pop");
	   System.out.println("3.peak");
	   System.out.println("4.show stack");
	   System.out.println("5.exit");
	   System.out.println("ENTER YOUR CHOICE");
	   int ch=scan.nextInt();
	   switch(ch)
	   {
	   case 1:push();
	   break;
	   case 2:v=pop();
	    if(v)
	     System.out.println("Stack is empty");
	    else 
	       System.out.println("ITEM POPPED");
	    break;
	    case 3:peak();
	    break;
	    case 4:display();
	    break;
	   case 5:System.exit(0);
	    break;
	    default:System.out.println("INVALID INPUT");
	   }
	}
  }
}