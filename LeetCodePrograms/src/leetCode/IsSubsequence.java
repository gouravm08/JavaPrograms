package leetCode;

public class IsSubsequence {

	public static void main(String[] args) {
		String s="abc";
		String str="ahbgdc";
		System.out.println(isSubsequence(s, str));
		

	}
	
	 public static boolean isSubsequence(String s, String t) {
		 int sp = 0;
	     int tp = 0;
	        
	        while (sp < s.length() && tp < t.length()) {
	            if (s.charAt(sp) == t.charAt(tp)) {
	                sp++;
	            }
	            tp++;
	        }

	        return sp == s.length();  
	   
	    }
	 
	   public boolean isSubsequence1ms(String s, String t) {
	       int i=0,j=0;
	    int n=t.length();
	    int m=s.length();
	    char ss[]=s.toCharArray();
	    char tt[]=t.toCharArray();
	     if(m<1)
	        return true;

	    while(i<n){
	        if(tt[i]==ss[j]){
	            j++;
	        }
	        i++;
	        
	    if(j==m)
	        return true;
	    }

	        return false;
	    }

}
