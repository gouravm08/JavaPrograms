class A
{
  public static void main(String[] args) {
  		int a[]={2,5,3,10,7,4,1};
  		Mergesort t=new Mergesort();
  		t.print(a);
  		System.out.println();
          t.sort(a,0,a.length-1);
          t.print(a);
  	}	
}
class Mergesort{
public void sort(int a[],int s,int l)
 {
    if(s<l)
	    {  
	    	int  m=(s+l)/2;
	    	sort(a,s,m);
	    	sort(a,m+1,l);
	    	merge(a,s,m,l);
    }
 }
 public void merge(int a[],int s,int m,int l)
  {
  	int n1=m-s+1;
  	int n2=l-m;
  	int L[]=new int[n1];
  	int R[]=new int[n2];
  	for(int i=0;i<n1;i++)
  		L[i]=a[s+i];
  	for(int j=0;j<n2;j++)
      R[j]=a[m+1+j];
  int k=s,i=0,j=0;
  while(i<n1&&j<n2)
  {
  	if(L[i]<=R[j])
  	{
  		a[k]=L[i];
  		i++;
  	}
  	else{
  		a[k]=R[j];
  		j++;
  	}
  	k++;
  }
  while(i<n1)
  {
  	a[k]=L[i];
  	k++;
  	i++;
  } 
  while (j<n2) {
  	a[k]=R[j];
  	j++;
  	k++;
  }  
}
public void print(int a[])
{
	for(int i:a)
	{
		System.out.print(" "+i);
	}
}
}