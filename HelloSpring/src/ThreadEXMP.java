


public class ThreadEXMP {

	public static void main (String args[])
	{
		final String a="HI I AM GONNA LOCK";
		final String b="ME TOO";
		
		Thread t1=new Thread(){
			public void run(){
				synchronized(a){System.out.println("Thread 1 locked a");
				try{Thread.sleep(1000);}catch(Exception e){}
  
				
				synchronized(b){System.out.println("Thread 1 locked b");
				}
				
			} 
			
			}};
		Thread t2=new Thread(){
			public void run(){
				synchronized(b){System.out.println("Thread 2 locked b");
				try{Thread.sleep(1000);}catch(Exception e){}
  
				
				synchronized(a){System.out.println("Thread 2 locked a");
				}
				
			} 
			
			}	};		
		
	t1.start();
	t2.start();
	
		}
	
}
