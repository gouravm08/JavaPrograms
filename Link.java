import java.util.*;
class Link
{
	static Scanner sc=new Scanner(System.in);
	public static Link head=null;
	int data;
	Link next;
	Link(int data,Link next)
	 {
	 	this.data=data;
	 	this.next=next;
	 }
	 public static void Insert_at_last()
	 {
	 	System.out.println("inter data");
	 	 int data=sc.nextInt();
	 	 Link temp=new Link(data,null);
	 	 if(head==null)
	 	 	head=temp;
	 	 else{
	 	 	Link t=head;
	 	 	while(t.next!=null)
	 	 	{
	 	 		t=t.next;
	 	 	}
	 	 	t.next=temp;
	 	 }
	 }
	 public static int Delete_from_last()
	 {
        Link temp=head;
        int v=0;
        if(head==null)
        	v=0;
        else
        {
        	
        	while(temp.next.next!=null)
        		{	temp=temp.next;
        		}
        		v=temp.next.data;
        		temp.next=null;
        		
        }
        return v;
	 }
	 public static void Insert_at_begin()
	 {
       System.out.println("inter data");
	 	 int data=sc.nextInt();
	 	 Link temp=new Link(data,null);
	 	 if(head==null)
	 	 	head=temp;
	 	 else{
	 	 	temp.next=head;
	 	 	head=temp;
	 	 }
	 }
	 public static int Delete_from_first()
	 {
        int v=0;
        if(head==null)
            v=0;
        else{
            if(head.next==null)
            	{
            		v=head.data;
                    head=null;
            	}
            else{
            	v=head.data;
            	head=head.next;
                }	
        }
        return v;
	 }
	 public static void Display()
	 {
            Link temp=head;
            if(head==null)
            	System.out.println("List is empty");
             else
             {
             	while(temp!=null)
             	{
             		System.out.print(temp.data+" ");
             		temp=temp.next;
             	}
             	System.out.println();
             }
    }
	 public static void main(String[] args) {
	 	while(true)
	 	{
	 	System.out.println("1.Insert at last");
	 	System.out.println("2.Delete from last");
	 	System.out.println("3.Display");
	 	System.out.println("4.Insert at begin");
	 	System.out.println("5.Delete from first");
	 	System.out.println("6.Exit");
	 	System.out.println("Enter your choice");
	 	int ch=sc.nextInt();
	 	switch(ch)
	 	{
	 		case 1:Insert_at_last();
	 		    break;
	 		case 2:int v=Delete_from_last();
	 		    System.out.println("Deleted from last is "+v);
	 		    break;
	 		case 3:Display();
	 		    break;
	 		case 4:Insert_at_begin();
	 		    break;
	 		case 5:int r=Delete_from_first();
	 		if(r==0)
               System.out.println("List is empty ");
	 			else
	 		   System.out.println("Deleted from first is "+r);
	 		    break;
	 		case 6:System.exit(0);
	 	         	break;
	 	}
       }
	 }
}