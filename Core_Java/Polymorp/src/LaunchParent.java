
class Parent{
	
	public void cry() {
		System.out.println("Parent Crying !!");
	}
}
class Child1 extends Parent{
	public void cry() {
		System.out.println("Child crys at low voice !!");
	}
	
}
class Child2 extends Child1{
	public void cry() {
		System.out.println("Child crys at high voice !!");
	}
	
	
	
}
public class LaunchParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		a=10;
		
		int b=20;
		
		Child1 ch1= new Child1();
		ch1.cry();
		Child2 ch2 = new Child2();
		ch2.cry();
		
		Parent p1 =new Child1();
		p1.cry();
		Child1 p2= new Child2();
		p2.cry();
		
		
		
		

	}

}
