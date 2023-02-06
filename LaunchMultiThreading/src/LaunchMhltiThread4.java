class MyThread4 extends Thread{
	
	public void run() {
		System.out.println(" Child Thread !");
	}
	
}
public class LaunchMhltiThread4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread4 m4= new MyThread4();
		
		///Thread t4= new Thread();
		m4.start();//---> Creats new Thread 
		// MyThread class Obj here--> calls the Start of Thread class--> Class run 
		// of Thread class 
		
		System.out.println(" Main Thread ");
		

	}

}

/*
 *  Main Thread 
 Child Thread !

*/
