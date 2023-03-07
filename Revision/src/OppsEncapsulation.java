class Student900{
	
	private int age;
	private String name;
	private int marks;
	
	
	
	
	public Student900(int age, String name, int marks) 
	{
		this();
		this.age = age;
		this.name = name;
		this.marks = marks;
	}
	

	Student900()
	{
		//this(30,"Uma",67);
	
		System.out.println(" No one called me,But i will come haha");
		System.out.println(" JDBC connection Started !!");
	}
	public void display() 
	{
		System.out.println(" Age is ="+age+" name is = "+name+ "Marks are = "+marks);
	}
	
	
	
	
	
}
public class OppsEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student900 s00 = new Student900();	
		s00.display();
		Student900 s100 = new Student900(20,"kamala",95);
		s100.display();
		
		
		
	}

}
