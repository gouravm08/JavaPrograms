class JoinMethod
{
   static JoinMethod curr=null;
	public static void main(String[] args) throws Exception {
	//curr=;
		MT t=new MT(Thread.currentThread());
		t.start();
		//t.join(4000);

		 //main thread gives 4 second to child thread to execute completely but lazy child thread
		for(int i=0;i<5;i++)//complete task 1 time and sleep for 3 second so main thread execute after 4 second 
		{

			System.out.println("main :"+i);
		}
	}
}
class MT extends Thread
{

	Thread t=null;
	MT(Thread a)
	{
		t=a;
	};
	
	public void run()
	{  
		for(int i=0;i<5;i++)
		{
			try{
				Thread.currentThread().join();
				//   t.sleep(1000);
				//Thread.sleep(3000); 
			}
			catch(Exception e){}
			System.out.println("child :"+i);
		}
	}
}