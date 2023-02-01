import java.util.Scanner;

public class MultiCathBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println(" Connectin to application is established !!");
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the first num to divide");
		
		int num1=sc.nextInt();
		System.out.println("Enter the 2nd num to divide ");
		
		int num2= sc.nextInt();
		
		int num3= num1/num2;
		
		System.out.println(" The res is "+num3);
		System.out.println(" Enter the size of arry ");
		int size =sc.nextInt();
		int[] a =new int[size];
		
		System.out.println(" Enter th ele to be inserted in the array !");
		
		int ele = sc.nextInt();
		
		System.out.println("ENTER THE Position at which the ele need to be inserted ");
		int pos=sc.nextInt();
		a[pos]=ele;
		System.out.println(" Ele inserted succsesfully !!");
		}
		// ArithmeticException 
		catch(ArithmeticException ae) {
			System.out.println(" Connetion treminated !! Please provide non zero denomunator ");
			
		}
		catch(NegativeArraySizeException nae) {
			System.out.println(" Connetion treminated !!  Please provide positive array size ");
			
		}
		
		catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println(" Connetion treminated !!  Be in your limits dont cross it  ");
			
		}
		catch(Exception e) {
			System.out.println(" Wrong Input !!");
		}
		System.out.println(" Connetion treminated !!");
		

	}

}
