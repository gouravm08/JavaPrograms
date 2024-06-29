//in 	switch we can not give statement outside of case;
//also in while if we pass true it also give us error of unreachable code because it will be infinite loop
//and at compile time compiler will check that the statement under loop will execute or not than it will give error

class WordDemo
{

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
		String a[]=s.split(" ");
		int count=0;
		for(int i=0;i<a.length;i++){
			if(a[i].equals(rightrotate(a[i], k))){
				count++;
			}
		}
		System.out.println(count);
	}
    
}