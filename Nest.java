class Nest
{
	public static void main(String[]args)
	{
		//int i=0;
	  new Thread(){
	  	 public void run()
	  	 {
	      for( int i = 0;i<5;i++)
	       System.out.println("hello thread"+i);
       	}
	  }.start();
	  for(int j=0;j<5;j++)
	  System.out.println("main"+j);
	}
}