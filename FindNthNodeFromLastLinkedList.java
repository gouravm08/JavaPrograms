//program to find FindNthNodeFromLastLinkedList 
import java.util.*;
class FindNthNodeFromLastLinkedList
{
class LinkedListDemo
	{
		int data;
		LinkedListDemo next;
		LinkedListDemo(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
   LinkedListDemo current;
   LinkedListDemo start;
  public void insert(int data)
	{
		LinkedListDemo temp=new LinkedListDemo(data);
		if(start==null){
			start=temp;
		    current=temp;
		}
		else
		{
			current.next=temp;
			current=temp;
		}
	}
  public void printList()
	{
		LinkedListDemo temp=start;
		if(start==null)
		{
			System.out.println("list is empty");
		   return;
		}
	   while(temp!=null)
          {
          	if(temp.next==null)
          	System.out.print(temp.data);
          	else		
          	System.out.print(temp.data+" ");
          	temp=temp.next;
          }
          System.out.println();
		
	}
	public LinkedListDemo reverse()
	{
		LinkedListDemo next1;
		LinkedListDemo prev=null;
		LinkedListDemo current1=start;
		while(current1!=null)
		{
			next1=current1.next;
			current1.next=prev;
			prev=current1;
			current1=next1;
		}
       return  prev;


	}

	public void findnthnode(int n)
	{
		start=reverse();
		LinkedListDemo temp=start;
		int count=0;
		int k=0;
		while(temp!=null)
		{
			count++;
			if(count==n)
				k=temp.data;
			temp=temp.next;

		}
		if(k==0)
			System.out.println("input is wrong");
		else 
			System.out.println(k);
		start=reverse();

	}
	
  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  FindNthNodeFromLastLinkedList l=new FindNthNodeFromLastLinkedList();
       		l.insert(2);
            l.insert(4);
            l.insert(5);
            l.insert(8);
       		l.insert(9);
       		l.insert(19);
            //l.printList();
            l.findnthnode(n);
           
            l.printList();
              

	}	
}