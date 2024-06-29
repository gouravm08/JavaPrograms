class Test5
{
	public static void main(String[] args)  {
		G g=new G();
		Thread t=new Thread(g);
		t.start();
		//t.interrupt();
		for(int i=0;i<5;i++)
			{
				t.interrupt();
				System.out.println("main Thread"+i);
			     try{
			     Thread.sleep(2000);
			     }catch(Exception e)
			     {
			     	
			     }
            }
	}
}
class G implements Runnable 
{
	public void run()
	{
		for(int i=0;i<5;i++){
		//	System.out.println("child Thread"+i);
		  try{
		  Thread.sleep(5000);
           }
           catch(Exception e)
           {
           	System.out.println("INtruppted occured");
           }
       }
	}
}