class Demo100{
	
	public void m1( int... x) {
		System.out.println(" I am the Var args guy ");
	}
	
	public void m1(int x) {
		System.out.println(" I am the normal guy ");
	}
}

/*
 *  C ERROR--> Var args and 1D Array !!
class Demo200{
	public void m1( int... x) {
		System.out.println(" Var Args method !!");
	}
	public void m1( int[] x) {
		System.out.println(" I am ");
	}
	
}

*/
public class LaunchVarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo100 d1 = new Demo100();
		d1.m1(10);//  I am the normal guy ---> Normal Guy Is Called 


	}

}
