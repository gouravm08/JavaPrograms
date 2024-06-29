//program to swap group element from a linked list
import java.util.*;
class SwapLinkedListGroup
{
	class LinkedListDemo
	{
		int data;
		LinkedListDemo next;
		LinkedListDemo(int data)
		{
			this.data=data;
			LinkedListDemo next=null;
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
          	System.out.print(temp.data+" -> ");
          	temp=temp.next;
          }
          System.out.println();
		
	}
	//function to find number of groups
   public int group(LinkedListDemo head,int k)
   {
     LinkedListDemo current=head;   
       int total=0;
       while(current!=null)
       {
           int count=0;
          while(count<k&&current!=null)
           {
            current=current.next;
             count++;
            }      
        total++;
      }
   return total;
   } 
 public LinkedListDemo listA(LinkedListDemo head,int k)
	{
       LinkedListDemo next1=head;
       LinkedListDemo current=head;
       LinkedListDemo temp=head;
       LinkedListDemo temp1=head;
        LinkedListDemo temp2=head;
       int totalgroup=group(head,k);
       int i=0;
       	int  j=0;
       	 while (j<k*(totalgroup-1)-1&&temp.next!=null) 
       	 {
       	 	temp=temp.next;
       	 	j++;
       	 }
       next1=temp.next;
       temp1=temp.next;
       temp.next=head;
         i=0;//moving first group pointer to its kth node
       while(i<k-1&&current.next!=null)
       {
       	current=current.next;
          i++;
       }
       temp2=current.next;
       i=0;//moving last group pointer to last
       while(i<k-1&&next1.next!=null)
      { 
          next1=next1.next;
          i++;
      }
      next1.next=temp2;
      current.next=null;
    return temp1;
	}

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);

		 int n=sc.nextInt();
	       SwapLinkedListGroup l=new SwapLinkedListGroup();
            l.insert(1);
            l.insert(2);
            l.insert(3);
            l.insert(4);
            l.insert(5);
            l.insert(6);
            l.insert(7);
            l.insert(8);
            l.insert(9);
            l.insert(10);
            l.insert(11);
            l.insert(12);
            l.insert(13);
            l.insert(14);
            l.insert(15);
            l.printList();
            l.start=l.listA(l.start,n);
            l.printList();
	
	}
}