package assignment;

class Threads implements Runnable {
	private Thread t;
	private String tname;
	   
	Threads( String name) {
	   tname = name;
	   System.out.println("Creating " +  tname );
	}
	   
	public void run() {
	   System.out.println("Running " +  tname );
	      for(int i = 3; i > 0; i--) {
	         System.out.println("Thread: " + tname + ", " + i);
	      }
	   System.out.println("Thread " +  tname + " exiting.");
	}
	   
	public void start () {
	   System.out.println("Starting " +  tname );
	   if (t == null) {
	      t = new Thread (this, tname);
	      t.start ();
	   }
	}
}

public class Multithreading {

	public static void main(String args[]) {
		Threads t1 = new Threads( "Thread 1");
		t1.start();
		Threads t2 = new Threads( "Thread 2");
        t2.start();
        Threads t3 = new Threads( "Thread 3");
        t3.start();
	}   
}

