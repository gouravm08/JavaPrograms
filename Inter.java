interface I1{
	public static void fun()
	{
		System.out.println("hello I1");
		//return 0;
	}
}
interface I2{
	public static void fun()
	{
		System.out.println("hello I2");
		
	}
}
class B {
		public static void fun()
	{
		System.out.println("hello class B");
	}
}
class Inter extends B implements I1,I2
{

	public static void main(String[] args) {
	fun();	
	}
   
}