class Computer{
	public void config1() {
		
		System.out.println(" In Computer Config");
	}
	
}

public class InnerClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer ob= new Computer()
		{
	
				public void config1() 
				{
					System.out.println(" Somthing New  ");
				}
			
		};
		ob.config1();

	}

}
