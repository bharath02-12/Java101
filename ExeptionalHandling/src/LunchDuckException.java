import java.util.Scanner;

class Alphaa{
	void alphaa() throws ArithmeticException
	{
     
		System.out.println(" Connectin to application is established !!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the first num to divide");
		
		int num1=sc.nextInt();
		System.out.println("Enter the 2nd num to divide ");
		
		int num2= sc.nextInt();
		
		int num3= num1/num2;
		
		
		System.out.println(" The res is "+num3);
	};
}
class Beta{
	void beta() throws ArithmeticException{
		Alphaa a = new Alphaa();
		a.alphaa();
	}
}
public class LunchDuckException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Beta b = new Beta();
		b.beta();
		}catch(ArithmeticException e) 
		{
		   System.out.println(" Finally in Main !");
		   
	   }

	}

}
/*
 *  Connectin to application is established !!
 Enter the first num to divide
100
Enter the 2nd num to divide 
0
 Finally in Main !
 */
