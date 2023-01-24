/*abstract class Account
{
	public abstract void withDraw();
	public abstract  void deposit();
	public abstract void checkBalance();
	public void printPassBook() {
		
	}
}*/

/*interface  Account
{
	// It is 100% abstarct class 
	  void withDraw();
	   void deposit();
	  void checkBalance();
	
}



class Savings extends Account{
	
}

class Current extends Account{}

class Salary extends Account() {}
*/
//SRs



///////////  STANDARD INTERFACE /////////////////////////////////////
/*
interface ISample{
	
	// 100% abstarct class 
	// Methods by default " public and abstarct "
	
	void m1();
	void m2();
}

 class SampleImpl implements ISample{
	
	 @Override// Indication to Compiler that these methos are overriden methods 
	public void m1() {
		System.out.println(" Hello I am giving implentation ");
	}
	
	@Override // Indication to Compiler that these methos are overriden methods
	public void m2() {
		System.out.println(" Hey Imp given ");
	}
	
}
public class InterfaceOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ISample sample =new SampleImpl();// loose couplng 
		
		sample.m1();
		sample.m2();
	}

}

*/


interface ISample{
	
	// 100% abstarct class 
	// Methods by default " public and abstarct "
	
	void m1();
	void m2();
}

abstract class SampleImpl implements ISample{// CLASS AS ABSTRACT For Partial methods implementation 
	
	 @Override// Indication to Compiler that these methos are overriden methods 
	public void m1()
	 {
		System.out.println(" Hello I am giving implentation ");
	}
	
}

class SubSampleImpl extends SampleImpl{
	public void m2() {
		System.out.println(" Hello M2 implemetation ");
	}
}
public class InterfaceOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ISample sample =new SubSampleImpl();// loose couplng 
		
		sample.m1();
		sample.m2();
	}

}