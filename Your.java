import java.util.Scanner;
class Your{
	public static int countBinarySubstrings(String s) {
        int ans = 0, prev = 0, cur = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) != s.charAt(i)) {
                ans += Math.min(prev, cur);
                prev = cur;
                cur = 1;
            } else {
                cur++;
            }
        }
        return ans + Math.min(prev, cur);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int c=0;

	String s=sc.nextLine();
		//String a[]=s.split(" ");
	
	 System.out.println(countBinarySubstrings(s));
	}
}