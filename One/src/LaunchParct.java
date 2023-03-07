
class Parent1{
	public  void maa() 
	{
		System.out.println(" I Am parent !");
	}
}
class Child1 extends Parent1{
public  void maa() 
    {
	System.out.println(" I Am Child !");

	}
}
public class LaunchParct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent1 p = new Child1();
		p.maa();
		
		
		
		
		
		
	}

}
