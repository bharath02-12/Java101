// 

/*
 * @FunctionalInterface
 * interface Runnable{
 * void run(){}
 * 
 * */
/*
class MyRunnable implements Runnable{

	@Override
	public void run() {
		for( int i=0;i<=5;i++) {
			System.out.println(" Child Thread !");
		}
		
	}
	
}

*/

/// USING LAMBDA EXPRESSION 
public class LaunchMulti7Dec_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Thread t = new Thread(my);
		 * 
		 * MyRunnable my =new MyRunnable();
		 */
		
		/*---> Inner Classes 
		 * Runnable r = new Runnable()--> This is not obj of runnable
		 * {
		 * @Overrde 
		 * public void run(){
		 * for( int i=0;i<=5;i++)
		 *   {
		 *            System.out.prinltn(" Main Thread !");
		 *   }
		 *   
		 *   }
		 *   
		 *   */
		
		Runnable r=()->{
			for( int i=0;i<=5;i++) {
			System.out.println(" Child Thread !");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for( int i=0;i<=5;i++) {
			System.out.println(" Main Thread !");
		}

	}

}
