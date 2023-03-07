import java.util.Scanner;

class Alpha{
	void d() {
		System.out.println(" Hello  Welcome to Alpha Club !");
		Scanner sc = new Scanner(System.in);
		int a=10;
		System.out.println(" Enter the divider");
		try{
			int d = sc.nextInt();
			System.out.println(a/d);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(" Sorry My Dear");
			throw ae;
			
		}
		
	}
	
}
public class LaunchExceptionalHandling1 {

	public static void main(String[] args) throws Exception,ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
	
		try {
			
			Alpha a1 = new Alpha();
			a1.d();
			
			Thread t = new Thread();
			t.sleep(500);
			System.out.println(" Hello Exception Family !!");
			int a=10;
			int b=0;
			int[] arr= new int[3];
			arr[-4]=200;
			System.out.println(a/b);
			System.out.println(" Did you Enjoy !!");
			System.out.println(" How was it   !!");
			System.out.println(" Did you Eat !!");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(" Sorry tere was exception ");
			
		}
		catch( Exception e){
			System.out.println(" Sorry tere was exception ");
			
		}
		System.out.println(" Ok ");
		System.out.println(" The Party is Done  ");
	
	

	}

}
