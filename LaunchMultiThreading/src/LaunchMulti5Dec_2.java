
/*
 * public static final int MIN_PRIORITY;
 
  public static final int NORM_PRIORITY;
  public static final int MAX_PRIORITY;
  
  */

class MyThread5_2 extends Thread{
	
	public void run() {
		System.out.println(" Priority of Child Thread "+Thread.currentThread().getPriority());

		for( int i=0;i<5;i++) {
			System.out.println(" Child Thread ");
		}
	}
	
} 
public class LaunchMulti5Dec_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Priority of main Thread "+Thread.currentThread().getPriority());
		MyThread5_2 mt5_2= new MyThread5_2();
		mt5_2.setPriority(10);
		mt5_2.start();
		
		for( int i=0;i<5;i++) {
			System.out.println(" Main Thread ");
		}
		
		
		

	}

}
