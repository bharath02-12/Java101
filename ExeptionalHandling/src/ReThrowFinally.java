import java.util.Scanner;

class Alpha201{
	void alpha201() throws ArithmeticException  
	{
     
		System.out.println(" Connectin to application is established !!");
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the first num to divide");
		
		int num1=sc.nextInt();
		System.out.println("Enter the 2nd num to divide ");
		
		int num2= sc.nextInt();
		
		int num3= num1/num2;
		System.out.println(" The res is "+num3);
		
		} catch(ArithmeticException e)
		{
			System.out.println(" Connetion is terminated , eception in alpha only by handler !!");
			throw e;//-----> Re Throw
		}
		finally {
		System.out.println(" Conntion terminater using finally  ");
		}
		
		
	};
}
public class ReThrowFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	try {
			
			System.out.println(" Main Method !!");
			Alpha201 a = new Alpha201();
			a.alpha201();
		}
		catch(ArithmeticException e) {
			System.out.println(" Exception Handled in Main !");
		
		}

	}

}

/*
 * 
Main Method !!
Connectin to application is established !!
Enter the first num to divide
100
Enter the 2nd num to divide 
0
Connetion is terminated , eception in alpha only by handler !!
Conntion terminater using finally  
Exception Handled in Main !

*/


/*
 * Even with out exception there is finally block execution !!
 *  Main Method !!
 Connectin to application is established !!
 Enter the first num to divide
100
Enter the 2nd num to divide 
5
 The res is 20
 Conntion terminater using finally  
 
*/
 