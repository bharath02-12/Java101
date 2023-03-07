class Beta{
	void fun() {
		try {
		System.out.println(" Making fun activity ");
		
		int  a=10;
		int b=0;
		System.out.println(a/b);
		}
		catch(Exception ae ) {
			System.out.println(" Sorry for the inconvienence ");
			System.out.println(ae.getStackTrace());
			System.out.println(ae.getMessage());
			throw ae;
		}
		
		finally {
		System.out.println(" We are happy for this type of things ");
		}
	}
}
public class LaunchExceptionHandlingTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		Beta b = new Beta();
		b.fun();
		
		}
		catch(Exception e) {
			System.out.println(" I caugut you Choor !");
		}

	}

}
