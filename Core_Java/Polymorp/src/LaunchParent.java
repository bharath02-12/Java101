
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
class Child2 extends Parent{
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
		Child2 ch2 = new Child2();
		
		StringBuilder sb = new StringBuilder(6);
		
		Parent ref;// variable to store obj type value 
		
	ref=ch1;
	ref.cry();
	
	ref=ch2;
	ref.cry();
		
		ch1.cry();
		ch1.cry();
		ch2.cry();
		

	}

}
