import java.util.Scanner;

class Alphaa300{
	void alphaa300() throws ArithmeticException
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

class Beta101{
	void beta101() throws ArithmeticException{
		Alphaa300 a = new Alphaa300();
		a.alphaa300();
	}
}
	

public class ExceptionObjInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Beta101 b = new Beta101();
			b.beta101();
			}catch(ArithmeticException e) 
			{
			
				System.out.println(e.getMessage());
			
			   System.out.println(" Finally in Main !");
			   
		   }

	}

}

/*
 * Connectin to application is established !!
 Enter the first num to divide
100
Enter the 2nd num to divide 
0
 Connetion is terminated , eception in alpha only by handler !!
 Conntion terminater using finally  
/ by zero
 Finally in Main !*/
