import java.util.*;
//recursion to find fibonacci series 
class Test1 
{
static int a=-1,b=1,c;
static void fib(int n){
if(n>0)
 {
c=a+b;
System.out.printf(" "+c);
a=b;
b=c;

fib(n-1);
}
}
public static void main(String args[])
{ //int i,j,a=-1,b=1,c;
  Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
  fib(n);
}
}