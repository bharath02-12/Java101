// Main Thread is waiting for Child Thread !!

class MyThreadj extends Thread{
	@Override 
	public void run() {
		for( int i =0; i<5;i++) {
		System.out.println(" Deepika Thread !");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			
		}
		}
	}
}
public class LaunchMulti5Dec_4join {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThreadj t = new MyThreadj();
		t.start();
		t.join(1000);
		
		// Deepika should join Ranveer
		
		// Ranveer will wait wait wait till Deepika joins 
		
		//t.join(1000);--> Ranveer only waits for 1000 ms 
		
		for( int i =0; i<5;i++) {
			
			System.out.println(" Ranveer Thread !");
			}

	}

}
