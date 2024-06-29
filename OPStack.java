import java.util.Scanner;
class StackMember
{
	int data;
	StackMember pre;
	StackMember(int d)
	{
	this.data=d;
	}
}

class Mystack
{
   StackMember top=null;
   public String toString()
   {
   	String value="";
   	StackMember t=top;
   	while(t!=null)
       {
         //System.out.println(" "+t.data);
         value=value+","+t.data;
         if(t.pre!=null)
         	value+=",";
         t=t.pre;
       }
       return value;
   }
   public boolean push(StackMember temp)
   {
    if(top==null)
    {
     top=temp;
     return true;
    }
    temp.pre=top;
    top=temp;
    return true;
   }
   public int pop()
   {
     if(top==null)
      return -1;
      int v=top.data;
      top=top.pre;
     return v;
   }
   // public void show()
   // {
   //    StackMember t=top;
   //    while(t!=null)
   //    {
   //      System.out.println(" "+t.data);
   //      t=t.pre;
   //    }
   // }
}
class Stk1{
	public static void main(String[]args)
	{
	int ch,v;
	Mystack st=new Mystack();
	Scanner sc=new Scanner(System.in);
	  while(true)
	  {
	    System.out.println("1.push");
	    System.out.println("2.pop");
	    System.out.println("3.show");
	    System.out.println("4.exit");
	    System.out.println("Enter your choice");
         ch=sc.nextInt();
         switch(ch)
         {
         case 1:System.out.println("enter element");
            v=sc.nextInt();
           StackMember t=new StackMember(v);
           System.out.println(st.push(t));  
           break;
         case 2: v=st.pop();
         if(v==-1)
         	System.out.println("stack is empty");
         else
         	System.out.println(v+" popped sucessfully" );
         break;
         case 3://st.show();
         System.out.println(st);
         break;
         case 4:System.exit(2);
          break;
         }
	  }
	}
}