import java.util.Scanner;
// RE- THROW --> Even after handling the exception re throw 
class Alpha101{
	void alpha101() throws ArithmeticException  
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
		System.out.println(" Conntion terminater ");
		
		
	};
}
public class LanchReThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			System.out.println(" Main Method !!");
			Alpha101 a = new Alpha101();
			a.alpha101();
		}
		catch(ArithmeticException e) {
			System.out.println(" Exception Handled in Main !");
		
		}
		
		// If no Try and cath in Main--> It will be thrown to Main method !!

	}

}

/*
 * OUT PUT : 
 * 
 *  Main Method !!
 Connectin to application is established !!
 Enter the first num to divide
100
Enter the 2nd num to divide 
0
 Connetion is terminated , eception in alpha only by handler !!
 Exception Handled in Main !
 
 POINT : Lines below throw keyword will no be executed 

*/
