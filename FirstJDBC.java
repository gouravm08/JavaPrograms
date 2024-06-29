abstract class Dollop{
	Dollop(){
		System.out.println("abstract classs constructor");
	}
	public  final void fun(){
		System.out.println("fun called");
	}
}
 class FirstJDBC extends Dollop{
 	// public void fun()
 	// {
 	// 	System.out.println("fun called");
 	// }
public static void main(String[]args)
	{
		FirstJDBC d=new FirstJDBC();
           d.fun();
		System.out.println("Child main method called");
	}	
}