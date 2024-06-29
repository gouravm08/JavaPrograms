class Thread1
{
	public static void main(String[]args) throws Exception
	{
     Thread t=new Thread(new Time1());
     t.start(); 
	}
}
class Time1 implements Runnable 
{   String s="Dollop info tech pvt ltd vishupuri AB Road Indore MP ";
      String str=s+" ";
      int len=str.length();
      String s1[]=str.split(" ");

	public void run()
	{
		for(int i=0;i<s1.length;i++)
		{   if(i<str.length())
		   	 {
			 //if()
			 System.out.println(s1[i]);
			 // else{
              }
			  //}
			   	try{
             Thread.sleep(1000);
               }
               catch(Exception e){}
	   }
 }
}