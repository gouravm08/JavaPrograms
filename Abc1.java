class Abc1
{
	public static void main(String args[])
	{
		int a[]=new int[]{10,20,30,40};
		int b[]=new int[]{50,60};
		System.out.println(a);
		System.out.println(b);
				//System.out.println(Integer.MIN_VALUE);
		//for(Abc1 ob1:ob)
		a=b;
		b=a;

		System.out.println(a);
		System.out.println(b);

	
	}	
}

class bc extends Abc1{

}