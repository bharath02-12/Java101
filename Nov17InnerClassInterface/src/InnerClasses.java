
public class InnerClasses {
	private int num=10;
	A obj = new A();
	
	
	public void show() 
	{
		obj.config();
		
		System.out.println(" In How : "+num);
	}
	
	// Class Inside the class 
	class A
	{
		
		public void config() 
		{
			System.out.println("In config");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		InnerClasses inc=new InnerClasses();
		
		inc.show();

	}

}
