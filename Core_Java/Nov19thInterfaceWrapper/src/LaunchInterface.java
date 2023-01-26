

abstract class Person{
	String name;
	Integer age;
	Float height;
	public Person(String name, Integer age, Float height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	
}
class Stu extends Person
{
	Integer sid;
	Float marks;
	String courseName;
	public Stu(String name, Integer age, Float height, Integer sid, Float marks, String courseName)
	{
		super(name, age, height);
		this.sid = sid;
		this.marks = marks;
		this.courseName = courseName;
	}
	


	
public void getStudentDetails() 
{
	System.out.println(name);
	System.out.println(this.age);
	System.out.println(this.height);
	System.out.println(this.sid);
	System.out.println(this.marks);
	System.out.println(this.courseName);
	// Logic 
}
	
	
}
public class LaunchInterface 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p= new Stu("sachin",12,5.6f,101,25f,"Java");
		((Stu) p).getStudentDetails();
	
		

	}

}
