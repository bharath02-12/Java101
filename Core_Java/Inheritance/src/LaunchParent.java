class Parent100{
	String name;
	int age;
	Parent100(){
		System.out.println("Parent class Constructor ");
	}
	void disp() {
		System.out.println("Parent class");
	}
}

class Child extends Parent100
{
	Child(){
		System.out.println("Hello con 1");
	}
	void disp2() {
		System.out.println("This is child class ");
	}
	
	
}

class Child2 extends Child{
	
}

public class LaunchParent {
	
	public static void main(String args[]) {
		
		Child2 c1 = new Child2();
		
	}

}
