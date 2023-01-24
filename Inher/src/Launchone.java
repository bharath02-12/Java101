
abstract class Loan1
{
	
	abstract public void dispInt();
	
	public void welcomeNote() 
	{
		System.out.println(" Welcome to this bank !!");
	}
	
	
}
class HomeLoan1 extends Loan1
{

	
	public void dispInt() 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Rate of intrest is 12% ");
		
	}
	
	
}


class EduactionalLaon1 extends Loan1
{

	@Override
	public void dispInt()
	{
		System.out.println("Rate of intrest is 7%");
		// TODO Auto-generated method stub
		
	}
	
}

public class Launchone {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Loan1 l = new Loan1();---> unable to create OBJ --> We can not create obj of abstract class !!
		
		Loan1 loan = new HomeLoan1();
		
		// Loan1 loan it is not obj , it is reference 
		// So we can create reference of ABSTRACT CLASS !!
		
		
		loan.dispInt();
		loan.welcomeNote();
		
		System.out.println("-----------------------------------");
		
		
		Loan1 loan2= new EduactionalLaon1();
		loan2.dispInt();
		loan2.welcomeNote();

	}


}
