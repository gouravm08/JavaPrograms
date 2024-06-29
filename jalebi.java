import java.util.*;
/*
555555555
544444445
543333345
543222345
543212345
543222345
543333345
544444445
555555555
*/
class jalebi
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=n;
		for(int i=1;i<2*n;i++)
		{
			t=n+1;
			for(int j=0;j<2*n-1;j++)
			{
				if(j<i)
					t--;
				if(j>(2*n-1)-i)
					t++;
				System.out.print(t);
			}
			System.out.println();
		}
	}
}