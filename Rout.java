import java.lang.Throwable;
 import java.util.*;
 class next extends Thread{
 	public void start()
 	{System.out.println("hello");
 		super.start();
 		
 	}
   public void run()
   {
   	Thread.currentThread().setName("gourav");
   	//Thread.currentThread().setPriority(12);
   	for(int i=0;i<4;i++)
   		{ 
   	System.out.println(Thread.currentThread().getName()+" "+i);
     }
   }
 }
class Rout {
 public static void main(String[] args) {
   next y=new next();
   //Runnable r=new Runna0ble();
   Thread  t=new Thread();
   y.start();
   for(int j=0;j<4;j++)
  System.out.println(Thread.currentThread().getName()+" "+j);

}
	
	//public static void main(String[] args) {

//	System.out.println(l.contains(23));
//	System.out.println(s1.hashCode());
 //}
}
