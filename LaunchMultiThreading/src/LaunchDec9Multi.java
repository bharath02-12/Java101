class MyThread999 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
	}
	
}
public class LaunchDec9Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isDaemon());
		
		//Thread.currentThread().setDaemon(true);
		
		MyThread999 mt = new MyThread999();
		mt.setDaemon(true);
		mt.start();
		
		System.out.println(mt.isDaemon());


	}

}
