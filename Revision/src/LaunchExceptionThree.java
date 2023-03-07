
public class LaunchExceptionThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(" This is outside Try");
			System.out.println(10/0);

			
			try {
				System.out.println(" This is Inside Try");
			   }
			catch(ArrayIndexOutOfBoundsException  e) {
				System.out.println(" Inside catch");
				
			   }
			finally {
				System.out.println(" Inner finally ");
			}
			
			
			System.out.println(" outsidw Try two");
		   }
		catch(Exception ae) {
			System.out.println(" Outside catch ");
			
		}
		
		finally {
			System.out.println(" I am Finally Done ");
		}
		
		

	}

}
