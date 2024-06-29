abstract class p
{
	int a,b	;
	public  void  m1()
	{
      System.out.println("p m1");
	}
	//public abstract void m3();
}
interface intf
   {
   	  int i=10;
        public void m4();
 	}
 class Demo extends p implements intf
{
      public void m4()
	{
        	System.out.println("INTERFACE m4");
        }
	public static void main(String[] argd)
	{
		Demo d=new Demo();
	  // d.m3();
	   d.m1();
	   d.m4();
	   d.i=2;
	   System.out.println(d.i);
	}
}