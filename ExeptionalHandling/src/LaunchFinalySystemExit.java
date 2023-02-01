//  System.Exit>>> Finally >>> return 

class Demo1{
	void disp1() {
		try {
			System.out.println(" Method Started !");
			System.exit(0);//-----> ENTIRE JAVA APPLICATIO IS CLOSED 
			
		}
		// Finally will be exceuted 
		finally {
			System.out.println(" Finally its been returned !!");
		}
	}
}
public class LaunchFinalySystemExit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1 d1 = new Demo1();
		d1.disp1();

	}

}
