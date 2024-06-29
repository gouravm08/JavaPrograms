//example of lambda expression
@FunctionalInterface
interface R{
	public  abstract void m3();
}
/*abstract class P
{
	abstract void m1();
}*/
class Poly implements R
{	
	public static void main(String args[])
	{
	  R p= ()->{System.out.println("hello");};
	  p.m3();    
	}
}