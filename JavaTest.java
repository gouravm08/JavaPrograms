import java.util.*;
import java.time.LocalDateTime;  
class JavaTest
{
	/*public void printreverse(char arr[],int f,int l)
	{
      if(f>l)
      	return;
      else{
           char r=arr[f];
           arr[f]=arr[l];
           arr[l]=r;
           printreverse(arr,f+1,l-1);
      }

	}*/
	int sum=0;
	public int printreverse(int n)
	{
		if(n==0)
			return  0;
		else
		{
           sum=sum*10+(n%10);
           printreverse(n/10);
		}
		return sum;

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s="gourav";
		JavaTest t=new JavaTest();
		//char arr[]=s.toCharArray();
		
		//s=String.valueOf(arr);
		System.out.println(t.printreverse(123));

	}
}