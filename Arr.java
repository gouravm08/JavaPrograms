class Test1
{
  public static void main(String[] args) {
  	int a[]={9,6,5,1};
  	int v=11,c=1,i=0,j=0;
  	int len=a.length;
  	for ( i=0;i<len ;i++ ) {
  		for ( j=i;j<len ;j++ ) {
  			if(a[i]+a[j]==v)
  			{
  				c++;
  				break;
  			}
  		}
  		if(c==2)
  			break;
  		
  	}
  System.out.println(c+" coin of "+a[i]+", "+a[j]);
  }
}
