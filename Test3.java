//throws keyword is used for multiple exception and throw is used for single exception i.e.throws is used
//in methods and throw is used in try-catch block or where a single line throw exception
class Test1
{
	public static void check(int agg) throws Age
	{
        if(agg<18)
        	throw new Age("invalide age");
        else
        	System.out.println("valid");
	}
	public static void main(String[]args) throws Exception
	{
	
            check(10);
        
	}
}
class Age extends Exception
{
	Age(String a)
	{
		super(a);
	}
}