class A
{
	public void show() 
	{
		System.out.println(" I am in Show ");
		
	}
	 
	
	class B
	{
		public void config() 
		{
			System.out.println(" I am in Config ");
		}
	}
}


class A1
{
	public void show() 
	{
		System.out.println(" I am in New Show ");
		
	}
	
	
	static class B1
	{
		public void config() 
		{
			System.out.println(" I am in New Config ");
		}
	}
}

public class LaunchInnerClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj = new A();
		obj.show();
		
		// Inner class Obj 
		
		
		A.B obj1 = obj.new B();
		obj1.config();
		
		System.out.println("**************************");
		
		//************************************************
		
		A1 obj2 = new A1();
		obj2.show();
		
		A1.B1 obj3 = new A1.B1();
		obj3.config();
		
	}

}
