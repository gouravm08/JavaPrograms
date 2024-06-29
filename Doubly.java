//program of doubly Linked list in java
import java.util.Scanner;
class Doubly
{ 
   static Scanner sc=new Scanner(System.in);
   public static Doubly head=null;
   int data;
   Doubly pre;
   Doubly next;
   Doubly (int data,Doubly pre,Doubly next)
   {
   	this.data=data;
   	this.pre=pre;
   	this.next=next;
   }
    public static void Insert_at_last()
	 {
	 	System.out.println("inter data");
	 	 int data=sc.nextInt();
	 	 Doubly temp=new Doubly(data,null,null);
	 	 if(head==null)
	 	 	{
	 	 	   head=temp;
	 	 	}
	 	 else{
	 	 	Doubly t=head;
	 	 	while(t.next!=null)
	 	 	{
	 	 		t=t.next;
	 	 	}
	 	 	temp.pre=t;
	 	 	t.next=temp;
	 	 }
	 }	
	  public static int Delete_from_first()
	  {
	  	int v=0;
	  	if(head==null)
	  		v=0;
	  	else{
          Doubly temp=head.next;
          if(head.next==null)
          {
             v=head.data;
             head=null;                                                      
          }else{
          v=head.data;
          temp.pre=null;
          head.next=null;
          head=temp;}
	  	}
	  	return v;
	  }
	  public static void Insert_at_begin()
	  { 
	  	System.out.println("inter data");
	 	 int data=sc.nextInt();
	 	 Doubly temp=new Doubly(data,null,null);
	 	 if(head==null)
	 	 	{
	 	 	   head=temp;
	 	 	}
	 	 else
	 	 {
	 	 	Doubly t=head;
	 	 	t.pre=temp;
	 	 	temp.next=t;
	 	 	head=temp;
	 	 }
	  }
	  public static int Delete_from_last()
	  {
	  	int v=0;
	  	if(head==null)
	  		v=0;
	  	else{
         Doubly temp=head;
         if(head.next==null)
          {
             v=head.data;
             head=null;                                                      
          }
          while(temp.next.next!=null)
          	temp=temp.next;
          v=temp.next.data;
          temp.next.pre=null;
          temp.next=null;
	  	}
	  	return v;
	  }
	  public static void Display()
	 {
            Doubly temp=head;
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
     public static void reverse_print()
     {
     	Doubly temp=head;
     	while(temp.next!=null)
     		temp=temp.next;
     	
     	while(temp!=null)
     	{
     		System.out.print(temp.data+" ");
     		temp=temp.pre;
     	}
     	System.out.println();
     }
     public static int length()
     {
     	Doubly temp=head;
     	int l=0;
     	if(head==null)
     		 l=0;
     	else {
     		while(temp!=null)
     		{
              l++;
              temp=temp.next;
     		}
     	}
     	return l;
     }
     public static void Insert_postion()
     {
             int data;     
        System.out.println("Enter position you want to insert data"); 
         int position=sc.nextInt();
       if(head==null)
       	  Insert_at_last();
       	  else if(position==1) 
       	     Insert_at_begin();
       	     else if(position==length())
       	       Insert_at_last();
       	       else if(position>length())
       	          {
                   System.out.println("illegal position");
       	          }
       	       	else{
       	       	System.out.println("inter data");
	 	      data=sc.nextInt();
	 	      Doubly temp=new Doubly(data,null,null);
       	       	int i=1;
       	       	Doubly t=head,t1;
                 while(i<position-1)
                 {
                 	t=t.next;
                 	i++; 
                 }
                 t1=t.next;
                 t.next=temp;
                 temp.pre=t;
                 temp.next=t1;
                 t1.pre=temp;
       	       } 
     }
     public static int Delete_position()
     {
     	int td=0;
     	//Doubly temp=new Doubly(data,null,null);
        System.out.println("Enter position you want to insert data");
        int position=sc.nextInt();
        if(head==null)
       	  td=0;
       	  else if(position==1) 
       	     td=Delete_from_first();
       	     else if(position==length())
       	       td=Delete_from_last();
       	       else if(position>length())
       	       	{
                   System.out.println("illegal position");
                   return -1;
       	       	}
       	       	else{
       	       	int i=1;
       	       	Doubly t=head,t1;
                 while(i<position-1)
                 {
                 	t=t.next;
                 	i++;
                 }
                 t1=t.next;
                 t.next=t1.next;
                 td=t1.data;
                 t1.pre=null;
                 t1.next=null;
                 t1=t.next;
                 t1.pre=t;
       	       } 
        return td;
     }
    public static void main(String[] args) {
 	while(true)
 	 	{
	 	System.out.println("1.Insert at last");
	 	System.out.println("2.Delete from last");
	 	System.out.println("3.Display");
	 	System.out.println("4.Insert at begin");
	 	System.out.println("5.Delete from first");
	 	System.out.println("6.reverse_print the Doubly list");
	 	System.out.println("7.insert at any position");
	 	System.out.println("8.Delete at any position");
	 	System.out.println("9.Exit");
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
                 System.out.println("list is empty");
	 		   	else
	 		   System.out.println("Deleted from first is "+r);
	 		    break;
	 		case 6:reverse_print();
	 		  break;
	 		 case 8:int re=Delete_position();
	 		   if(re==0)
	 		   	System.out.println("List is empty");
	 		   else 	System.out.println(" Deleted is "+re);
               break;
             case 7:Insert_postion();
               break;
	 		case 9:System.exit(0);
	 	         	break;
	 	}
       }
	 }
} 