import java.util.Scanner;
class Dynamic
{
	public static Dynamic top=null;
		int data;
	Dynamic next;
	Dynamic(int data,Dynamic next)
	{
		this.data=data;
		this.next=next;
	}
	 public static void push()
     {
     	Scanner scan=new Scanner(System.in);
     	System.out.println("Enter value");
     	int data=scan.nextInt();
     	Dynamic temp=new Dynamic(data,null);
     	if(top==null){
     		 top=temp;
     		}
     		else
     		{
     			temp.next=top;
     			top=temp;
     		}
     }
     public static boolean pop()
     {
     	if(top==null)
     	{
     		return true;
     	}
     	else
     	{
     		System.out.println(top.data);
     		top=top.next;
     		return false;
     	}
     }
     public static void display()
     {
     	if(top==null)
          System.out.println("stack is empty");
         else
         {
         	Dynamic t=top;
         	while(t!=null)
         	{
                System.out.println(t.data);
                t=t.next;
         	}
         }		
     }
     public static void peak()
     {
     	if(top==null)
     		System.out.println("stack is empty");
         else
     	System.out.println(top.data);

     }
}
 class DSTK
 {
    
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
	   case 1:Dynamic.push();
	   break;
	   case 2:v=Dynamic.pop();
	    if(v)
	     System.out.println("Stack is empty");
	    else 
	       System.out.println("ITEM POPPED");
	    break;
	    case 3:Dynamic.peak();
	    break;
	    case 4:Dynamic.display();
	    break;
	   case 5:System.exit(0);
	    break;
	    default:System.out.println("INVALID INPUT");
	   }
	}
  }
}