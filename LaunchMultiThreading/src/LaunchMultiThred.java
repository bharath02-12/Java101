
class MyThread005 extends Thread{
	
	public void run() {
		System.out.println(" Child Thread !");
		System.out.println(Thread.currentThread().getName());

	}
	
}


public class LaunchMultiThred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyThread005 m005= new MyThread005();
		m005.start();
		System.out.println(Thread.currentThread().getName());
		/*
		Thread t005= new Thread();
		t005.start();//---> Creats new Thread be and calls the run ( No IMP) of Thread
		*/
		System.out.println(" Main Thread ");
		
	}

}

/*
 *  Main Thread--> Current obj is Thread class--> will call Thread calls start and it 
 *  it will invoke Thread class run which have no Implementation ! 

*/
