

class A1{
	public void show1() {
		System.out.println(" In Show");
	}
	  class B1
	{
		public void config() {
			System.out.println(" In Config ");
		}
		
	}
}
public class InnerClass1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		A1 obj3= new A1();
		obj3.show1();
		
	
		
		// A1.B1 obj4 = new A1.B1();---> If inner class is static 
		
		A1.B1 obj4;
		obj4=obj3.new B1();
		
		A1 obj = new A1();
		
		obj.show1();
		
		// To Access B1 you need A1 class 
		A1.B1 obj2;
		
		// When B1 is Static class --> you can call using class name 
		/*
		 * obj2=new A1.B1(); obj2.config();
		 */
		
		obj2=obj.new B1();

	}

}
