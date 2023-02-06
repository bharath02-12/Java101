class MyThread1 extends Thread{
	
	public void start() {
		super.start();
		System.out.println(" start method ");
	}
	
	public void run() {
		System.out.println(" Hello No args RUN ");
		//(5);
	}
	
	
}
public class LaunchMultiThread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread1 mt1= new MyThread1();
		try{
		mt1.start();
		mt1.start();
		}catch(Exception e) {
			System.out.println(" Sommethin is Wromg !!");
		}
		System.out.println(" hahah");
		//mt1.run(6);
		
		for( int i=0;i<10;i++) {
			System.out.println(" MYTHRED "+i);
		}

	}

}
