//program to detect loop from a Linked List
class DetectLoop
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
  public void removeLoop(LinkedListDemo slow)
  {
  	LinkedListDemo t=start;
  	while(t.next!=slow.next)
  	{
  		t=t.next;
  		slow=slow.next;
  	}
  	slow.next=null;
  	printList();

  }
   public boolean detectLoop()
   {
   	boolean flag=false;
   	LinkedListDemo slow=start;
   	LinkedListDemo fast=start;
   	while(fast!=null&&fast.next!=null)
   	{
   		fast=fast.next.next;
   		slow=slow.next;
   		if(fast==slow)
   		{
           flag=true;
           	removeLoop(slow);
           break;
   		}
   	}
   	if (flag) {
   		System.out.println("detectLoop");
   		return flag;
   	}
   	return flag;

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


   public static void main(String[] args) {
 	 Scanner sc=new Scanner(System.in);
   
          //int n=sc.nextInt();
	       DetectLoop l=new DetectLoop();
            l.insert(1);
            l.insert(2);
            l.insert(3);
            l.insert(4);
            l.insert(5);
            l.insert(6);
            l.insert(7);
            l.insert(8);
            l.insert(9);
            
           l.current.next=l.start.next.next.next.next.next;
            System.out.println(l.detectLoop());
           
            l.printList();
   }
}