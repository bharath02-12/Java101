import java.util.Scanner;

class Alpha{
	void alpha() 
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
public class Launch2Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alpha a = new Alpha();
		a.alpha();

	}

}
