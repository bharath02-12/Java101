class Parent{
	String name;
	int age;
	
	static {
		System.out.println(" We are Gupta Family !");
	}
	
	void works() {
		System.out.println(" we work to earn money for kids !");
	}
	
	void cook()
       {
		System.out.println(" We cook food to feed my Kids !!");
		}
	}

class Child extends Parent
{
	String name;
	int age;
	void study() {
		System.out.println(" I study to makes my Parents Proud ");
	}
}
public class LaunchInheritanceOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
