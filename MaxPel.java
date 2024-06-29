class MaxPel{
	public static boolean prime(int n)
 	{   boolean flag =true;
        for(int i=2;i<=n/2;i++)
       {
       	 if(n%i==0)
       	 {
           flag=false;
           break;
       	 }
       }
       if(flag==false)
       	return false;
       else
       	return true;
	}
	public static boolean pel(int n)
	{ 
		int n1=n;
     int sum=0;
     while(n>0)
     {
     	sum=sum*10+n%10;
     	n/=10;
     }
     if(sum==n1)
     	return true;
     else return false;

	}
	public static void main(String[] args) {
		int min=500;
		int max=1000;
		int minnum=0,c=0,maxnum=0;
		boolean flag1=false;
		boolean flag2=false;
		while(min<max)
		{
           flag1=prime(min);
           flag2=pel(min);
           if(flag1==true&&flag2==true)
           	 {
           	 	if(c==0)
           	   {  minnum=min;
                c++;
           	   }
               	else{
           		maxnum=min;
               c++;
           	}
              }
          	  min++;
          	  
		}
		System.out.println(minnum);
		System.out.println(maxnum);
	}
}