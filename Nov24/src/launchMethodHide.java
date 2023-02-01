class Parent{
	public static void disp() {
		System.out.println(" Hello Parent !!");
	}
}

class Child extends Parent{
	public  static void disp() {
		System.out.println(" Hello Child !! ");
	}
}
public class launchMethodHide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Child();
		p.disp();
		
		Child c= new Child();
		c.disp();

	}

}
