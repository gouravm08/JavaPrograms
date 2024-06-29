import java.util.*;
class MaxMinPelindrom
{
	public static boolean isPelin(int n)
	{    int n1=n;
		int sum=0;
		while(n>0)
		{
			sum=sum*10+n%10;
			n/=10;
		}
		//	System.out.println(sum);

		if(n1==sum)
			return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=n,n2=n;
		boolean flag=false;
		while(n1<2147483647)
		{
			if(isPelin(n1))
			{
				flag=true;
				break;
			}
			n1++;
		}
		if(flag)
			System.out.println(n1);
		flag=false;
	while(n2>0)
		{
			if(isPelin(n2))
			{
				flag=true;
				break;
			}
			n2--;
		}
		if(flag)
			System.out.println(n2);
	}
}