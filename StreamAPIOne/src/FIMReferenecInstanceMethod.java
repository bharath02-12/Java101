@FunctionalInterface
interface Welcome
{
	void message();
}
public class FIMReferenecInstanceMethod {
	
	public void message1() {
		
		System.out.println(" Welcome to the Paty my Friend !!");
	}

	public static void main(String[] args)
	{
		Welcome w =()->System.out.println(" Welcome to Lambda Party !");
		w.message();
		
		System.out.println("******************");
		
		Welcome w1=new FIMReferenecInstanceMethod()::message1;
		w1.message();
		
	}

}
