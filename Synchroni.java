class Show
{
	public static synchronized void showName(String name)
    {
     for(int i=0;i<4;i++)
     {
     	System.out.println("hello! welcome :");
     	try{
     		Thread.sleep(1000);
     	}catch(Exception e){}
      System.out.println(name);
     }
    }
}
class MT extends Thread 
{
	 Show s;
	 String name;
	 public void run()
	{
		s.showName(name);
	}
	MT(Show s,String name)
	{  
		this.s=s;
		this.name=name;
	}
}
class Synchro
{
  public static void main(String[] args) {
  	Show s=new Show();
  	Show s1=new Show();
  	MT t1=new MT(s,"GOURAV");//in case if we pass two different object then it will not work like synchonized
  	t1.start();//method so there are two lock system thatis 1.Object level lock and 2.class level lock;
  	MT t2=new MT(s1,"Kamal");//so if we apply class level lock by adding static modifier so no other object
  	t2.start();//can access synchonized  method.

  }	
}