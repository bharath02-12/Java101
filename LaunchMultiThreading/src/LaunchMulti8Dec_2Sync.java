// On Diff OBJ d8---. IR-REGULAR

class Display9{
	public void wish( String name) {
		//;;;;;;;;;
		// To access this part
		// Thread need to have access to lock 
		// Which ever gets access to lock can 
		System.out.println(" We are outside the sync block !! "+Thread.currentThread().getName());

		synchronized(this) {

			for( int i=1;i<=5;i++) 
			{
				System.out.println(" Thread which is getting the lock inside is "+Thread.currentThread().getName());

				System.out.println("Good Morning : ");
				try
				{
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {
					
				}
				System.out.println(name);
			}
		}
	}
	
}
class MyThreadSyn1 extends Thread
{
	Display9 d;
	String name;
	
	




	public MyThreadSyn1(Display9 d, String name) {
		
		this.d = d;
		this.name = name;
	}






	@Override
	public void run() {
		d.wish(name);
		
	}
}


public class LaunchMulti8Dec_2Sync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Display9 d9 = new Display9();
				Display9 d10 = new Display9();
				
				MyThreadSyn1 t2s = new MyThreadSyn1(d9,"Shyam");
				MyThreadSyn1 t2s1 = new MyThreadSyn1(d10,"Ram");
				t2s.start();
				t2s1.start();

	}

}

/*
 *  IR - REGULAR OUTPUT 
 *  
 *   We are outside the sync block !! Thread-0
 Thread which is getting the lock inside is Thread-0
Good Morning : 
 We are outside the sync block !! Thread-1
 Thread which is getting the lock inside is Thread-1
Good Morning : 
Ram
Shyam
 Thread which is getting the lock inside is Thread-1
Good Morning : 
 Thread which is getting the lock inside is Thread-0
Good Morning : 
Ram
 Thread which is getting the lock inside is Thread-1
Good Morning : 
Shyam
 Thread which is getting the lock inside is Thread-0
Good Morning : 
Shyam
Ram
 Thread which is getting the lock inside is Thread-0
Good Morning : 
 Thread which is getting the lock inside is Thread-1
Good Morning : 
Shyam
Ram
 Thread which is getting the lock inside is Thread-0
Good Morning : 
 Thread which is getting the lock inside is Thread-1
Good Morning : 
Shyam
Ram
*/
