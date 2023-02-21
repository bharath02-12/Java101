
class Demo1{

	 String name;
	int age=28;
	void disp() { 
		System.out.println("Demo1 "+ " "+age+" "+name);
	}
	Demo1()
	{
		System.out.println("I am parent !");
	}
}


class Demo2 extends Demo1
{
  
  
	void dis() 
	{
	
	name="Hello";
	System.out.println(name);
  }
	
}

class Demo3 extends Demo2
{
	
}

public class LaunchInheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Demo2 d2= new Demo2();
		d2.dis();
		
		

	}

}
