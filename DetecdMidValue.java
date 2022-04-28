//program to detect mid value from an Linked list
class DetecdMidValue
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
 
 
   public int length()
   {
    int count=0;
   	boolean flag=false;
   	LinkedListDemo slow=start;
   	while(slow!=null)
   	{
   		count++;
   		slow=slow.next;
   	}
   	//System.out.println(count);
   	return count;
   }


   public int detectMidValue()
   {
   	boolean flag=false;
   	LinkedListDemo slow=start;
   	LinkedListDemo fast=start;
   	
   	while(fast!=null&&fast.next!=null)
   	{
   		fast=fast.next.next;
   		slow=slow.next;
   	}
   	if (length()%2==0) {

   		//System.out.println(slow.next.data);
   		return slow.data;
   	}
   	else if(length()%2==1){
  return slow.data;
   	}
   	else
   	return 0;

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
	
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
   
          //int n=sc.nextInt();
	       DetecdMidValue l=new DetecdMidValue();
            l.insert(1);
            l.insert(2);
            l.insert(3);
            l.insert(4);
            l.insert(5);
            l.insert(6);
            l.insert(7);
            l.insert(8);
            l.insert(9);
          
            System.out.println(l.detectMidValue());
            l.printList();

   }
}
