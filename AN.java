class AN
{
	public static void main(String[] args) {
		 new Thread( new Runnable()   //it because of anonymous class
		 { public void run()
		 	{
		 		for (int  i=0; i<5;i++ ) {
		 			System.out.println("Runnable Thread"+i);
		 		}
		 	}
		 }).start();
		 //Thread t=new Thread(r);
		 //t.start();
        for (int i=0;i<5 ;i++ ) {
        	System.out.println("main Thread"+i);
        	
        }
	}
}