interface One1{
	public void m1();
}

interface Two2{
	public void m1();
}

class Impl implements One1,Two2{

// Only one method will be implemented 
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}

////////////////////***********************************************
interface Left{
	public void left(int a);
}
interface Left1{
	public void left();
}
class Center implements Left,Left1{

	//******* BOTH METHODS WILL BE IMPLEMENTED !!!
	@Override
	public void left() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void left(int a) {
		// TODO Auto-generated method stub
		
	}
	
}

///***********************************************************************

/*
 * This caSE NOT POSSIBE interface LeftOne{ 
 * public int left();
 * 
 *  
 *  }
 * 
 *  interface
 * Left1One{ 
 * public void left();
 *  } 
 *  
 *  class CenterOne implements LeftOne,Left1One\
 *  {
 * 
 * @Override public int left() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * 
 * 
 * }
 */


public class LaunchInterfaceTwoMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
