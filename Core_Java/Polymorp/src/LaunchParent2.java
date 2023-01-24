class Parent2{
	public void cry() {
		System.out.println("Parents crying !!");
	}
}
class Child11 extends Parent2{
	public void cry()  // overriden metods 
	{
		System.out.println("Child11 crying !!");
	}
	public void eat() // specialized method 
	{
		System.out.println("Eat less ");
		
	}
}

class Child22 extends Parent2{
	
	public void cry() {
		System.out.println("Child22 crying !!");
	}
public void eat() {
	System.out.println("Eat less ");
		
	}
	
}
public class LaunchParent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent2 p = new Child11();// Loose coupling 
		p.cry();
		((Child11) p).eat();
		
		
		// For child type of object the refrence is of parent type !!!
		
		Parent2 p2 = new Child22();
		p2.cry();
		((Child22) p2).eat(); // Downcast
		

	}

}
