import java.util.*;
class Sub1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A  number");
		int n=sc.nextInt();
		System.out.println("sum of digit of number is :"+(n%9==0?9:n%9));
		
	}
}