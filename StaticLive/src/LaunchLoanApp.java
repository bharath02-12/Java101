import java.util.Scanner;

class Farmer{
	private float pa;
	private float td;
	private float si;
	private static float ri;
	
	static {
		ri=2.5f;
	}
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly enter the principle amount !!");
		pa=sc.nextFloat();
		System.out.println("Kindly mention the time duratipn !");
		td=sc.nextFloat();
		
		
	}
	
	void compute() {
		si=(pa*td*ri)/100;
		
	}
	
	void disp() {
		System.out.println("SI is = "+si);
	}
}

public class LaunchLoanApp {

	public static void main(String[] args) {
		
		Farmer f1= new Farmer();
		Farmer f2 = new Farmer();
		
		f1.input();
		f1.compute();
		f1.disp();
		
		
		f2.input();
		f2.compute();
		f2.disp();
		
	}
}
