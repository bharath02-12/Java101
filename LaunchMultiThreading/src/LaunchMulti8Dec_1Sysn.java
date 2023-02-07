// On Same OBJ d8---->Regular output 

class Display8{
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
class MyThreadSyn extends Thread
{
	Display8 d8;
	String name;
	
	




	public MyThreadSyn(Display8 d8, String name) {
		
		this.d8 = d8;
		this.name = name;
	}






	@Override
	public void run() {
		d8.wish(name);
		
	}
}
public class LaunchMulti8Dec_1Sysn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display8 d8 = new Display8();
		
		MyThreadSyn ts = new MyThreadSyn(d8,"dhoni");
		MyThreadSyn ts1 = new MyThreadSyn(d8,"Kohli");
		ts.start();
		System.out.println(Thread.currentThread().getName());
		ts1.start();
		
		System.out.println(Thread.currentThread().getName());

	}

}

/*
 * Good Morning : 
dhoni
Good Morning : 
dhoni
Good Morning : 
dhoni
Good Morning : 
dhoni
Good Morning : 
dhoni
Good Morning : 
Kohli
Good Morning : 
Kohli
Good Morning : 
Kohli
Good Morning : 
Kohli
Good Morning : 
Kohli
*
*
* We are outside the sync block !! Thread-0
 Thread which is getting the lock inside is Thread-0
 We are outside the sync block !! Thread-1
Good Morning : 
dhoni
 Thread which is getting the lock inside is Thread-0
Good Morning : 
dhoni
 Thread which is getting the lock inside is Thread-0
Good Morning : 
dhoni
 Thread which is getting the lock inside is Thread-0
Good Morning : 
dhoni
 Thread which is getting the lock inside is Thread-0
Good Morning : 
dhoni
 Thread which is getting the lock inside is Thread-1
Good Morning : 
Kohli
 Thread which is getting the lock inside is Thread-1
Good Morning : 
Kohli
 Thread which is getting the lock inside is Thread-1
Good Morning : 
Kohli
 Thread which is getting the lock inside is Thread-1
Good Morning : 
Kohli
 Thread which is getting the lock inside is Thread-1
Good Morning : 
Kohli
*/
