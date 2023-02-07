// Class Level Lock, even with same obj or diff --. Regular output !!

class Display10{
	public void wish( String name) {
		//;;;;;;;;;
		// To access this part
		// Thread need to have access to lock 
		// Which ever gets access to lock can 
		System.out.println(" We are outside the sync block !! "+Thread.currentThread().getName());

		synchronized(Display10.class) {
			System.out.println(" Thread which is getting the lock inside is "+Thread.currentThread().getName());


			for( int i=1;i<=5;i++) 
			{

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
		System.out.println(" Thread which is released the lock Outside is "+Thread.currentThread().getName());

	}
	
}
class MyThreadSyn3 extends Thread
{
	Display10 d;
	String name;
	
	




	public MyThreadSyn3(Display10 d, String name) {
		
		this.d = d;
		this.name = name;
	}






	@Override
	public void run() {
		d.wish(name);
		
	}
}

public class LaunchMulti8Dec_3Sync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display10 d11 = new Display10();
		Display10 d12 = new Display10();
		
		MyThreadSyn3 t3s = new MyThreadSyn3(d11,"Srinu");
		MyThreadSyn3 t3s1 = new MyThreadSyn3(d12,"Ramesh");
		t3s.start();
		t3s1.start();

	}

}

/*
 *  We are outside the sync block !! Thread-1
 We are outside the sync block !! Thread-0
 Thread which is getting the lock inside is Thread-1
Good Morning : 
Ramesh
Good Morning : 
Ramesh
Good Morning : 
Ramesh
Good Morning : 
Ramesh
Good Morning : 
Ramesh
 Thread which is released the lock Outside is Thread-1
 Thread which is getting the lock inside is Thread-0
Good Morning : 
Srinu
Good Morning : 
Srinu
Good Morning : 
Srinu
Good Morning : 
Srinu
Good Morning : 
Srinu
 Thread which is released the lock Outside is Thread-0
*/
 