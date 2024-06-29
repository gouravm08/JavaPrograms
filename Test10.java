import java.util.*;
class Test10
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String res="";
		        
         HashMap<Character,Integer> m=new HashMap<Character,Integer>();

          s=s.toLowerCase();
         for(int i=0;i<s.length();i++)
         { 
         	m.put(s.charAt(i),1);
         }
         
         for(char c='a';c<='z';c++)
       {
           if(m.containsKey(c)==false&&m.containsKey(' ')==true)
                res+=c;
       }
       if(res.length()==0) 
       System.out.println(0);
    else 
       System.out.println(res);
	} 
}