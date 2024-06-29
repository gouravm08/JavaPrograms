class MySingleTon
{
 private MySingleTon()
  {

  }	 
static private  MySingleTon MS1=null;
public static MySingleTon getObj()
 { 
 	if(MS1==null)
    MS1= new MySingleTon();
  return MS1;
 }

}
class MyTest
{
	public static void main(String[]args)
	{
	
	System.out.println(MySingleTon.getObj());
	//System.out.println(MS1);
	System.out.println(MySingleTon.getObj()); 
	}

}