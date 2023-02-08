import java.util.*;
class ThreadB extends Thread{
	int total =0;
	@Override 
	// If its giving sum of 100 nums
	
	// I want this total variable  to be occupied by Only one  thread -> Lock it 
	
	// Data present in total should be given to Main thread 
	
	// CHILD THREAD needs lock of b , since b is not loacl we used this 
	
	public void run() {
		
		synchronized(this) 
		{
			System.out.println(" Child Thread started the calcluartion ");// step -2 

		for( int i=1;i<=100;i++)
		   {
			total+=i;
		    }
	System.out.println(" Child Giving the notifation call ");
		
		// Notification call should be done on OBJ !!!
		
		// Notificatin to waiting thread !!! 
		
		// Notify may or may not  release so main thread will go again to wait state 
		this.notify();// step - 3
	}
	

	}
}
public class LaunchMulti8Dec_3Wait {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ThreadB b = new ThreadB();
		b.start();
		
		// AT this line TWO THREADS --> main(5), user(5)
		
		// LOCK is applend in main thread --> b obj 
		
		// Main thread should wait till other thread funishes 
		
		// Main thread should wait on B obj
		
		
		// Obj level lock applied on main !!
		synchronized(b) {
			
			System.out.println(" Main thread is waiting , calling wait method  ");// step 1
			//
			
			/// Main thread is entered to wait state , it releases the lock 
			// of B and enters to wait state !
			
			// Who will use the lock ?? 
			
			// Child thread needs lock
			
			// GO to child thread 
			
			// This is one more waiting state to 
			b.wait();
			System.out.println(" Main thread got the notification call ");// step 4
			System.out.println(b.total);
			
		}
		

	}

}
