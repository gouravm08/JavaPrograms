import java.util.Scanner;
class Test  implements Runnable
{

   public static void main(String[] args)
   { 
      //st t1=new Test();
      Thread.currentThread().setPriority(10);
      Thread t=new Thread(new Test());   
       t.start();
       System.out.println(Thread.currentThread().getPriority());
       for(int i=0;i<3;i++)
       System.out.println("main"+i);       
   }
   public void run() 
   {
     for(int i=0;i<4;i++)
     {
      Thread.currentThread().setPriority(7);
      System.out.println(Thread.currentThread().getPriority());
    System.out.println("thread running"+i);
   }
 }
   
}

 


/*
Exception:
  1 checked Exc.

  2 unchecked Exc.

  */