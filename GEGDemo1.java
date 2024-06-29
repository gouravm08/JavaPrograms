class GEGDemo1{
	public static void main(String[] args) {
		int a[]={1,2,0,0,4,3,6,5,0,6,0,2,8,0,0};
		int l=a.length;
		 int c=0;
		for(int i=0;i<l;i++)
		{
		   
		    if(a[i]!=0)
		    	a[c++]=a[i];
		}
		while(c!=l)
		{
			a[c++]=0;
		}
	
 for(int i=0;i<l;i++)
 {
 	System.out.print(a[i]+" ");
 }
	}

}
/* Alternate version of above program
int c=0;
int temp;
for(int i=0;i<l;i++)
{
	if(a[i]!=0)
	{
	 temp=a[c];
	 a[c]=a[i];
	 a[i]=temp;
	 c=c+1;
	}
}



*/