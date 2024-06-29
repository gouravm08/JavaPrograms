//program to find longest substring which is pelindrom also.
class LongestPel
{
	public static boolean isPelindrom(String str)
	{ int len=str.length();
		boolean flag=false;
		for(int k=0;k<len;k++)
		 		{
		 			if(str.charAt(k)!=str.charAt(len-1-k))
		 			{
		 				flag=true;
		 				break;
		 			}
		 		}
		 		return flag;
	} 
	public static void main(String[] args) {
		String s="forgeeksskeegfor";
		String str1="";
		 int i=0,j=0,k=0,maxlen=0;
		 for(i=0;i<s.length();i++)
		 {
		 	for(j=i;j<s.length();j++)
		 	{   boolean flag=false;
		 		String str=s.substring(i,j);
		 		int len=str.length();
		 		
		 		if(isPelindrom(str)==false)
		 		{
                    if(maxlen<=len)
                    {
                    	str1=str;
                    	maxlen=len;
                    }
		 		}
		 	}
		 }
		 System.out.println(str1+"  length= "+maxlen);
	}
}