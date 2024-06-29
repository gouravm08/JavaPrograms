import java.util.*;
class LIST
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter n");
		int n=sc.nextInt();
		ArrayList<String> List=new ArrayList<String>(n);
		System.out.println("enter "+n+" name");
		for(int i=0;i<=n;i++)
		 {  String str=sc.nextLine();
		 	List.add(str);
	     }
          Iterator rt=List.iterator();
		while(rt.hasNext()){
			System.out.println(rt.next());
		}
	}
}