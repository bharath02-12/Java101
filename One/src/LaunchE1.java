import java.util.Scanner;

class Hello{
	Scanner sc= new Scanner(System.in);
	void bollo() {
		try {
		System.out.println(100/0);
		}
		catch(NullPointerException e) {
			System.out.println(" Sorry its wrong ");
	   }
	catch(ArithmeticException a) {
		System.out.println(" Its silly error dude !");
		throw a;
		}
	finally {
		System.out.println(" Hello I sthis cool");
	}
	}
}
public class LaunchE1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello h= new Hello();
		try {
		h.bollo();
		}
		catch(Exception e) {System.out.println(" woww");}

	}

}
