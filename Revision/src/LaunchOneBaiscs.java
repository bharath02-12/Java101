import java.util.Scanner;

class Student500{
	String sName;
	int sId;
	String sLname;
	int sage;
	
	void plays(int a ) {}
	int plays(float b) {return 0;}
	void plays(int a,float b ) 
	{
		System.out.println("Hello First Int");
	}
	void plays(float a,int b ) 
	{
		System.out.println("Hello First Float");
	}
	void eat() {}
}

public class LaunchOneBaiscs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student500 s1= new Student500();
		//s1.plays(2.5f, 2);
		s1.plays(2, 2.5f);

		
	}

}
