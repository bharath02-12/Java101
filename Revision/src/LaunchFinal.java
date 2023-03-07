class Demo1{// final class wil not participate in Hintertance 
	final int a=10;
	
	 void display() { // If metjod is final--> final methods can not be ovverriden 
		System.out.println(" We are Here to Display !");
	}
	
	
}
class Demo2 extends Demo1
{
	
	
	 void display() { // If metjod is final--> final methods can not be ovverriden 
		System.out.println(" We ere to Display !");
	}
	 void dimp() {
		 System.out.println(" I am here to shpw the dimples ");
	 }
	
}
public class LaunchFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1 d1 = new Demo1();
		
		Demo1 d2 = new Demo2();
		d2.display();
		((Demo2) d2).dimp();//----> Down casting 
		
	

	}

}
