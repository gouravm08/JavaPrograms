import java.util.*;
class WeakHashMapDemo
{
 public static void main(String[] args) throws Exception {
 	WeakHashMap hs=new WeakHashMap();
    Tempr t=new Tempr();
    hs.put(t,"hello");
    System.out.println(hs);
    t=null;
    System.gc();
    Thread.sleep(5000);
    System.out.println(hs);
 }
	
}
class Tempr
{
	public String toString()
	{
		return "temp";
	}
	public void finalize()
	{
		System.out.println("finalize called");
	}

}