
class Demo{
	// Static variables
	static int a;
	static int b;
	
	
	
	// Static block
	
	static 
	{
		System.out.println("Staic  block ");
		a=10;
		b=20;
	}
	
	// Static method 
	
	static void disp() {
		System.out.println("Staic  Method ");
		System.out.println(a);
		System.out.println(b);
	}
	
	int x;
	int y;
	
	{
		int x=10;
		int y=20;
		System.out.println("Non static java block");
	}
	
	 Demo() { System.out.println("Constructor !"); }
	 
	
	void disp1() {
		System.out.println("Non static method");
		System.out.println(x);
		System.out.println(y);
		
		
	}
	

}

public class LaunchStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo d1= new Demo();
		d1.disp1();
		Demo.disp();
		
	}

}
