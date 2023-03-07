interface factory{
	public void work();
	public void employe();
	int x=10;
}
abstract class Type implements factory{
	public void work() {
		System.out.println(" We work on Tires Manufactures ");
	}
	
}
class Budget extends Type{
	public void employe() {
		System.out.println(" we have 300 employes ");
	}
}

interface One{
	public void m1();
}
interface Two{
	public void m2();
}
//Multi interface Impelementation --> A class can implement two interfaces at same time 
// class with multiple interfaces 
class Three implements One,Two
{
	public void m1() {
		System.out.println(" HELLO M1 :: ONE CLASS CAN INPLEMENT MORE THAN 1 INTERFACE AT SAME TIME ");
	}
	
	public void m2() {
		System.out.println(" HELLO M2 :: ONE CLASS CAN INPLEMENT MORE THAN 1 INTERFACE AT SAME TIME");
	}
}


// CASE 2 : A CLASS with class and interface 
class Four extends Budget implements One{

	@Override
	public void m1() {
		System.out.println(" A NEED TO EXTEND OTHER CLASS FIRST AND IMPLEMENT THE INTERFACE LATER !!");
		
	}
	
}

// CASE 3 : RelatinShip Between Interface and Interface !!
interface Five extends One,Two
{
	
}
//////////////////////////////////////////////////
public class LaunchInterfaceOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		factory f1= new Budget();
		f1.employe();
		
		Type t1= new Budget();
		t1.employe();
		t1.work();
		
		
		

	}

}


