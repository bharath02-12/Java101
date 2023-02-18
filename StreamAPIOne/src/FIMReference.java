interface Hello
{
	void print();
}
public class FIMReference
{

	public static void printer() 
	{
		System.out.println(" I am the Static Hello Printer !");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Hello h= ()->System.out.println(" Just Hello Printer ! ");
		h.print();
		
		System.out.println("*********************************");
		
		Hello h1 =FIMReference::printer;
		h1.print();

	}

}
