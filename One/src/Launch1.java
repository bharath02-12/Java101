class Parent{
	public   void disp() {
		System.out.println("Hello Parent !!");
	}
}

class Child extends Parent{
	public  void disp(int a) {
		System.out.println(" Hello Child");
	}
	public  void dp() {
		System.out.println(" Hello ");
	}
}
public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p=new Parent();
		
		Child c = new Child();
		
		Parent p1= new Child();//--. Loose coupling
		
		p.disp();
		p1.disp();
		
		((Child) p1).dp();//----. Down cast to access the child specilized methods 
		// with Parent Class referenece !!
		c.disp();

	}

}
