// Child Thread waitimg for Main Thread 

class MyThreadjj extends Thread{
	static Thread mj;
	@Override
	public void run() {
		try {
			mj.join();// Child  thread is waiting to Join Main 
		}
		catch(Exception e) {
			
		}
		
	}
}
public class LaunchMulti5Dec_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MyThreadjj mj =Thread.currentThread();
		
		MyThreadjj mtj = new MyThreadjj();
		
		mtj.start();
		
		for( int i=1;i<=5;i++) {
			
		}
		
		
		

	}

}
