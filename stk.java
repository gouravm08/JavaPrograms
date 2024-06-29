import java.util.*;
class st{
	int val;
	st pre;
	st(int val)
	{
		this.val=val;
		this.pre=null;
	}
}
class stack{
	st top=null;
	public void push(int v)
	{   st t=new st(v);
		if(top==null)
			top=t;
		else{
	       	t.pre=top;
	       	top=t;
	}
		System.out.println("success");
      
	}
	public void pop()
	{
		if(top==null)
		{
        System.out.println("empty stack");
		}
		else{
     System.out.println(top.val);
          top=top.pre;
        }
	}
	public String toString()
	{
		st t=top;
		String s=""+'[';
		if(top==null)
		{
             System.out.print("Stack is empty ");
         }
		else{	
       while(t!=null)
       {
       			//System.out.print(t.val+" ");
         if(t.pre==null)
          s=s+t.val+']';
          else	
         	s=s+t.val+",";
            t=t.pre;
       }
     }
     return s;
	}
	public void peak()
	{
	           	if(top==null)
		System.out.println("empty stack");
	 else
       
       			System.out.println(top.val+" ");
       }	
}
class Stk
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		stack t=new stack();
		while(true){
		System.out.println("1.push");
		System.out.println("2.pop");
		System.out.println("3.show");
        System.out.println("4.peak");
		System.out.println("5.exit");
       	System.out.println("enter ur choice");
       	int v=sc.nextInt();
       	switch(v)
       	{
       		case 1:		System.out.println("enter data");
       		 int d=sc.nextInt();
       		 t.push(d);
       		break;
       		case 2:t.pop();
       		break;
       		case 3:System.out.println(t);
       		break;
       		case 4:t.peak();
       		break;
       		case 5:System.exit(2);
       		break;
       	}
       }
	}
}