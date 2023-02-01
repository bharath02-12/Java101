import java.util.Scanner;

class Alpha1{
	void alpha1() 
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
		
		} catch(ArithmeticException e){
			System.out.println(" Connetion is terminated , eception in alpha only by handler !!");
			
		}
		System.out.println(" Conntion terminater ");
		
		
	};
}
public class LaunchException7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println(" Main Method !!");
		Alpha1 a = new Alpha1();
		a.alpha1();
		}
		catch(ArithmeticException e) {
		System.out.println(" Exception handled in Main ");
		}

	}

}

/* OUT PUT : 
 *  
 *  Main Method !!
 Connectin to application is established !!
 Enter the first num to divide
100
Enter the 2nd num to divide 
0
 Connetion is terminated , eception in alpha only by handler !!
 Conntion terminater 
 
 */
