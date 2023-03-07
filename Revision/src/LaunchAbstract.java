abstract class Movie{
	 Movie(){
		System.out.println(" I am the Constructor of ABstract class ");
	}
	 abstract void Telugu() ;

	void English() {
		System.out.println(" We are the English Cinemas");	}
	
	
}
 class Cinema extends Movie{
	 
	 Cinema(){
		 super();
	 }

	@Override
	void Telugu() {
	System.out.println(" Swagatham ");
		
	}
	
}
public class LaunchAbstract {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub\
		
		Movie c1 = new Cinema();
		c1.Telugu();
	
		
		

	}

}
