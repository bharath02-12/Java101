class MyThread100 extends Thread{
	public void run() 
	{
		
			for( int i=0;i<10;i++) {
				System.out.println(" I am a Lazy child Thread !!");
				
				try {
					Thread.sleep(2000);//
				}
				catch(Exception e) {
					
				}

			}
		

		
	}
}
public class LaunchMulti9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread100 mt1000 = new MyThread100();
		mt1000.setDaemon(true);
		mt1000.start();
		System.out.println(" Main Thread !!");

	}

}
