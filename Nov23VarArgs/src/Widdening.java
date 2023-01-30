import static java.lang.Math.random;
import static java.lang.Math.sqrt;
import static java.lang.System.out;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Byte.MIN_VALUE;
class D {
	
	public static void One(long l) {
		System.out.println("I am Int ");
	}
	
	public static void One(Integer i) {
		System.out.println(" I am integer !");
	}
	

}
public class Widdening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		D d= new D();
		d.One(x);
		
		System.out.println(random());
		System.out.println(sqrt(5));
		
		out.println("Hello");
		
		System.out.println(MAX_VALUE);
		
		System.out.println(MIN_VALUE);
		
		
		

	}

}
