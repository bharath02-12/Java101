
class MyThread3   implements Runnable{

	@Override
	public void run() 
	{
		for( int i=0;i<10;i++) {
			System.out.println(" Child Thread");
		}
		// TODO Auto-generated method stub
		
	}
	
}
public class LaunchMutliThread2ndInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread3 t3= new MyThread3();
		
		Thread t = new Thread(t3);
		t.start();
		/*
		Thread t= new Thread();
		t.start();
		
		*/
	//t3.start();
		
		for(int i=1;i<=10;i++) {
			System.out.println(" Main Thread "+i);
		}
		
		

	}

}
