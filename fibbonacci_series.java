
import java.util.*;
class Test1 
{
public static void main(String args[]) throws InterruptedException
{
 Thread thread =new Thread(new myrunnable());
 thread.start();
 thread.join();
 for(int i=1;i<10;i+=2)
 	System.out.println(i+" ");
}

}
  class  myrunnable implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i+=2)
			System.out.println(i+ " ");
	}
}
//op:-firstly thread.start will execute and run method will execute and myrannuable thread execute one time
//then main thread will execute but at main thread there is thread.join method that will hold all work of
//main thread and wait till the current thread i.e. myraunnable is finished;
//so o/p will be 0246813579