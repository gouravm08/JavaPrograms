import java.util.*;
class ChegTest{
	
	public static void maxStrength(int n)
	{
		HashMap< Integer,Boolean> m=new HashMap< Integer,Boolean>();
	     int c=0;
	     m.put(n,true);
		while(true)
		{ int sum=0;
           //System.out.println(f);
			while(n>0)
                {     int fact=n%10;
                	  int fa=1;
	              	while(fact>=1){
		        	  fa*=fact;
	        		  fact--;
	              	 }
                	sum=sum+fa;
                	n/=10;
                }
                n=sum;
			if(!(m.put(n,true)==null))
			{    
				break;
                
			}
		}
 		TreeMap t=new TreeMap(m);
           Integer I=(Integer)t.lastKey();
           System.out.println(I);
           System.out.println(c);

           Integer size=t.size();
           System.out.println(size);
           System.out.println(I*size);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		maxStrength(n);
	}
}