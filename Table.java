import java.util.*;
class Table{
	static int check(String s,int k)
	{
		String a[]=s.split(" ");
		int count=0;
		for(int i=0;i<a.length;i++){
			if(a[i].equals(rightrotate(a[i], k)))
			{
				count++;
			}
		
		}
		return count;
   }
public static String leftrotate(String str, int d)
     {
      String ans = str.substring(d) + str.substring(0, d);
      return ans;
    } 
	public static String rightrotate(String str, int d)
     {
     return leftrotate(str, str.length() - d);
    }	

	public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int k=sc.nextInt();
		System.out.println(check(s,k));
	}
}
