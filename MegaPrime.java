class Test
{
	public static void main(String[] args)
	{ int c=0;
        int s=0;
		for(int i=2;i<100;i++)
		{   boolean flag=false;
			for(int j=2;j<i;j++)
			 {
                if(i%j==0)
                {
                	flag=true;
                	break;
                }
             }
     	     if(flag==false)
     	     {   int mp=i;
     	     	int np=mp;
     	     	boolean tr=false;
     	     	if(mp>9)
     	     	{
                    while(np>0)
                    {   tr=false;
                       int a=np%10;
                        if(a==4||a==6||a==8||a==9||a==1)
                          {
                        	tr=true;
                        	break;
                          } 
                        np/=10;
                 	}
                 
                 if(tr==false)
                 //System.out.println(mp);
                    s+=mp;
                }  
     	  	   else
     	    // System.out.println(mp);
            s+=mp;	
     	    }
	    }
        System.out.println(s);
	}
  }
