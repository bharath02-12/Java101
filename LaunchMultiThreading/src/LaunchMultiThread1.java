class MyThread implements Runnable{

	@Override
	public void run() {
		for( int i=0;i<10;i++) {
			System.out.println(" Child Thread! = "+i );	
			}
		
	}
	
	/* 
	 * 	@Override
	 
	public void start() {
		System.out.println(" Hello !");
	}
	@Override
	public void run()
	{
		//  Task for User defined Thread
		for( int i=0;i<10;i++) {
			System.out.println(" Child Thread! = "+i );	
			}
	}	
	*/

}
public class LaunchMultiThread1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		MyThread mt= new MyThread();
		Thread t20= new Thread();
		t20.start();
		System.out.println(" ---------------------------");
		//mt.run();
		System.out.println(" Ayyo");
		
		// Task for Main Thread !!
		for( int i=0;i<=10;i++) 
		{
			System.out.println(" Main Thread ! = "+i);
		}
		
	}
}
		
/*
 *  Maim Thread !
 Maim Thread !
 Maim Thread !
 Maim Thread !
 Maim Thread !
 Maim Thread !
 Maim Thread !
 Maim Thread !
 Maim Thread !
 Maim Thread !
 Maim Thread !
 Child Thread!
 Child Thread!
 Child Thread!
 Child Thread!
 Child Thread!
 Child Thread!
 Child Thread!
 Child Thread!
 Child Thread!
 Child Thread!
 
 And Also :
 
  Maim Thread !
 Maim Thread !
 Maim Thread !
 Maim Thread !
 Maim Thread !
 Maim Thread !
 Maim Thread !
 Maim Thread !
 Maim Thread !
 Maim Thread !
 Maim Thread !
 Child Thread!
 Child Thread!
 Child Thread!
 Child Thread!
 Child Thread!
 Child Thread!
 Child Thread!
 Child Thread!
 Child Thread!
 Child Thread!


*/
 