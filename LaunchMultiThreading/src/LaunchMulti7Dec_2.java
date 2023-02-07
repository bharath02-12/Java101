class Display{
	public void wish(String name) {
		for( int i=0;i<=5;i++) 
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
}

class Mythread extends Thread{
	Display d;
	String name;
	public Mythread(Display d, String name) {
		
		this.d = d;
		this.name = name;
	}
	
	@Override
	public void run() {
		d.wish(name);
		
	}
	
}
public class LaunchMulti7Dec_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display d = new Display();
		Mythread t7= new Mythread(d,"Sachin");
		Mythread t707= new Mythread(d,"Yuvi");
		t7.start();
		t707.start();
		
		

	}

}

/*
 *  IRREGULAR OUTPUT 
 *  
 *  Good Morning : 
Sachin
Good Morning : 
Yuvi
Good Morning : 
Yuvi
Good Morning : 
Sachin
Good Morning : 
Sachin
Good Morning : 
Yuvi
Good Morning : 
Yuvi
Sachin
*/
