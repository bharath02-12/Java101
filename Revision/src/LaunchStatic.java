
class NewStudent {

	static int age;
	String name;
	int marks;

	static {
		System.out.println(" I am Static Bloack !!");
		age =10;
		System.out.println(age);

	}

	{
		System.out.println(
				" I am Simple Java Block , but but i will be executed every fucking time the custructor is called !!");
	}

	static void display() {
		System.out.println(" I am the Static method!");
	}

	NewStudent() {
		this("Ravi ");
		System.out.println(" Hey this is Constructor with Zero Param");
	}

	NewStudent(String name) {
		this.name = name;
		System.out.println(" Hello "+name);
	}

	NewStudent(String name, int marks) {
		this();
		this.name = name;
		this.marks = marks;
		System.out.println(" hello All I am "+name+" Got the marks of "+marks);
	}

}

public class LaunchStatic {
	


	public static void main(String[] args){
		
		
		  NewStudent ns = new NewStudent(); 
		  NewStudent ns1 = new NewStudent("Sonal");
		  NewStudent ns2 = new NewStudent("Nagesh",500);
		 


	}

}
