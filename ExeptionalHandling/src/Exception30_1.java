
public class Exception30_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(" 1.Outer Try");

			  try {
				
				System.out.println("2. Inner try ");
				System.out.println(100/0);
				
			
			
			} 
			
			catch ( ArithmeticException e) {
				System.out.println(" 3.Inner Catch");
				System.out.println(100/0);

			}
		
			finally {
				System.out.println(" 4.Inner Finally !!");
			}
			System.out.println("5. End of other try , done with inner world lol ");

		} 
		
		
		catch (ArithmeticException  a) 
		
		{
try {
				
				System.out.println("2. Inner try ");
				System.out.println(100/0);
				
			
			
			} 
			
			catch ( ArithmeticException e) {
				System.out.println(" 3.Inner Catch");
				System.out.println(100/0);

			}
		
			finally {
				System.out.println(" 4.Inner Finally !!");
			}
			System.out.println("5. End of other try , done with inner world lol ");

		} 

		 finally {
			System.out.println("7 . Outer Finally ");
		}

		
		System.out.println(" 8 . Haha Done MF !!");
	}

}
