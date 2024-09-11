package Multithreading;


public class DaemonThreadDemo extends Thread{
	
	
		public void run() {
	    	if(Thread.currentThread().isDaemon()) {
	    		System.out.println("Daemon");
	    	}else {
	    		System.out.println("Not Daemon");
	    	}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThreadDemo d=new DaemonThreadDemo();
		
		
		d.setDaemon(true);	
		d.start();
		
		System.out.println("main Started...!");

		
		
		

	}

}
