class MyThread5_3 extends Thread{
	
	public void run() {
	
		for( int i=0;i<5;i++) {
			Thread.yield();//--->Pause your execution , Check if any threads waiting on line 
			System.out.println(" Child Thread ");
		}
	}
	
} 
public class LaunchMulti5Dec_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread5_3 mt5_3= new MyThread5_3();	
		mt5_3.start();
		
		for( int i=0;i<5;i++) {
			//Thread.yield();//--->Pause your execution , Check if any threads waiting on line 
			System.out.println(" Main Thread ");
		}
		

	}

}
