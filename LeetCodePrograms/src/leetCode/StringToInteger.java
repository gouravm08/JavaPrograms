package leetCode;

public class StringToInteger {

	public static void main(String[] args) {
    String str="0-1";
    System.out.println(myAtoi(str));

	}
	 public static int myAtoi(String s) {
	     int k=0;
	     String str="";
	     int sign=0;
	     s=s.trim();
	     for(int i=0;i<s.length();i++) {
	    	 if(s.charAt(i)=='-') {
	    		 sign=-1;
	    	continue;	 
	    	 }
	    	 if(isAlpha(s.charAt(i)))
	    		 continue;
	    	 str+=String.valueOf(s.charAt(i));
	     }
	     int int1 = Integer.parseInt(str);
	     
		 return int1*sign;
	    }
	 public static boolean isAlpha(char a) {
		 if((a>='A' && a<='Z') || (a>='a' && a<='z'))
			 return true;
		 return false;
	 }

}
