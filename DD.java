//program to check if number is perfect square without founding square root
class Root
{
	 public static boolean perfct(int n)
	{
          for(int i=1;i*i<=n;i++)
          	if((n%i==0)&&(n/i==i))
          		return true;
          	return false;
	}
	public static void main(String[]args)
	{
		int n=36;
		if(perfct(n))
         System.out.println("yes");
     else System.out.println("no");
  
	}
}