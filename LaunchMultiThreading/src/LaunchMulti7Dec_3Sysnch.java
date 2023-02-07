class Display101{
	public synchronized void wish(String name) {
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


class Mythread7_3 extends Thread{
	Display101 d01;
	String name;
	public Mythread7_3(Display101 d01, String name) {
		
		this.d01 = d01;
		this.name = name;
	}
	
	@Override
	public void run() {
		d01.wish(name);
		
	}
	
}
public class LaunchMulti7Dec_3Sysnch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Display101 d01 = new Display101();
		Mythread7_3 t73= new Mythread7_3(d01,"Sachin");
		Mythread7_3 t737= new Mythread7_3(d01,"Yuvi");
		t73.start();
		t737.start();
		

	}

}

/*
 * Regular OutPut : 
 * 
 * Good Morning : 
Sachin
Good Morning : 
Sachin
Good Morning : 
Sachin
Good Morning : 
Sachin
Good Morning : 
Sachin
Good Morning : 
Sachin
Good Morning : 
Yuvi
Good Morning : 
Yuvi
Good Morning : 
Yuvi
Good Morning : 
Yuvi
Good Morning : 
Yuvi
Good Morning : 
Yuvi

*/
