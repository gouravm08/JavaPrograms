class Test
{
	public static void main(String[] args)
	{ 
        MT.t1=Thread.currentThread();
     	//MT t=new MT(Thread.currentThread());
        MT t=new MT();
        t.start();
        for(int i=0;i<=4;i++)
        {
        System.out.println("main :"+i);//when you join main thread from main thread then it will go to deadlock
        //  try{
         //  t.join();
        //}
        //catch(Exception e)
        //{}     
       }
   }
}
class MT extends Thread
{
    static  Thread t1=null;   //one way is create a static thread t1 and access it in main with class name and assign current Thread
    //Thread t1=Thread.currentThread();//is is also a way to create main thread object in another class
     // Thread t1=null;//another way is create a constructor of MT class and assign a thread passed at main thread in object creation of MT class    
     // MT(Thread a)
     //    {
     //        t1=a;
     //    }
     public void run()
     { 

        for(int  i=0;i<=4;i++)
        {
            try{
                t1.join();
            }
        catch(Exception e) {}

           System.out.println("chilld :"+i);
        }
    }
}
// class MT1 extends Thread
// {
//     public void run()
//     {
//         for(int i=0;i<5;i++)
//         {
//             System.out.println("MT1 : "+i);
//         }
//     }
// }