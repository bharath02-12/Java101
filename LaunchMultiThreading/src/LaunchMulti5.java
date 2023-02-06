
class MyThread5 extends Thread{
	
	public void run() {
		System.out.println(" Child Thread !");
	}
	
}


public class LaunchMulti5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread5 m5= new MyThread5();
		
		// Constructor 
		Thread t5= new Thread(m5);// Runnable interface 
		t5.start();//---> Internally MyThread is obj of ( Implements Runnable 
		// Through Thread class ) 
		
		System.out.println(" Main Thread ");
		

	}

}

/*
 *  Main Thread 
 Child Thread !

*/
