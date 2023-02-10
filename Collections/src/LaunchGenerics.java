import java.util.*;

class Student{
	private String name;
	private int age;
	private int mark;
	
	public Student(String name ,int age , int mark) {
		this.name=name;
		this.age=age;
		this.mark=mark;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getMark() {
		return mark;
	}

	
	
}
public class LaunchGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student("Rahul",74,12);
		Student s2 = new Student("Babul",94,19);
		Student s3 = new Student("Kamal",90,19);
		
		ArrayList al = new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println(al);// Output : [Student@5a07e868, Student@76ed5528, Student@2c7b84de]
		
		// You are adding 100 amd 200 which is being added which is  is not correct ! 
		al.add(100);
		al.add(300);
		System.out.println(al);
		
		ArrayList<Student> a2 = new ArrayList<Student>();
		a2.add(s1);
		a2.add(s2);
		a2.add(s3);
		//Collections.sort(a2);--> Sort can not be used for complex data
		System.out.println(a2);
		//  a2.add(100); ----> ERROR , as it is INT it will not accespt 
		
		
		ArrayList a4 = new ArrayList();
		a4.add(10);
		a4.add(20);
		a4.add(30);
		a4.add(50);
		int index=Collections.binarySearch(a4, 30);
		System.out.println("Index "+index);

		
	}

}
