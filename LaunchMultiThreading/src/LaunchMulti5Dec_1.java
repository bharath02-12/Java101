class MyThread5_1 extends Thread{
	
	public void run() {
		System.out.println(" Priority of Child Thread "+Thread.currentThread().getPriority());

	}
	
} 
public class LaunchMulti5Dec_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Priority of main Thread "+Thread.currentThread().getPriority());
		MyThread5_1 mt5_1= new MyThread5_1();
		mt5_1.start();

	}

}

/*
 *  Priority of main Thread 5
 Priority of Child Thread 5
 
 Both the threads have same Priority 
 */
 