//usage of interface is prior because in future if want to extend or inherited any class 
//but in java multiple inheritance is not supported so we use Runnable interface in the place of Thread Class.
class Test2
{
	public static void main(String[] args) {
	MT t=new MT();
	Thread t1=new Thread(t);
	Thread.currentThread().setName("gourav");
	//t.start();
	t1.start();
	for(int i=0;i<5;i++)
	 System.out.println(Thread.currentThread().getName()+i);	
  }
}
class MT implements Runnable
{
  public void run()
  { Thread.currentThread().setName("makwana");
  	for(int i=0;i<=4;i++)
  	System.out.println(Thread.currentThread().getName()+i);
  }
}