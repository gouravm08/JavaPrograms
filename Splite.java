class Split
{
	public static void main(String[]args)
	{
	   String s="123,134,153";
	   Spli(s,',');
	} 
	public static void Spli(String ns,char m)
	{
		 int sd=ns.length();
		 int num=sd;
		 int k=0;
		 String s[]=new String[num]; 
		 for(int i=0;i<sd;i++)
	    {
	    	int l_ind=ns.indexOf(',');
	    	if(l_ind!=-1)
	    	{
	    		s[k++]=ns.substring(0,l_ind);
	             ns=ns.substring(l_ind+1);
	         }
	         else
	          {
	          	s[k]=(ns);
	          	break;
	          }
	    }
	    for(int j=0;j<=k;j++)
	    	System.out.println(s[j]);
	}
}