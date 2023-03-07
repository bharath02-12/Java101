// Inner classes --> 1) To Override the methods and Also to Implement the abstarct methods 

abstract class Movie1 {
	abstract void telugu1();
}

class Cinema1{
	public void indianCinema()
        {
		System.out.println(" Bollywood !");
        }
	}

public class LaunchAnonymousInnerClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// While creating th eObj , give the Immplentation of the abstract method !
		
		// Impelentation for the Abstract class 
		Movie1 m1 = new Movie1() 
		{
			void telugu1() {
				System.out.println(" I am Telugu Movie ");
			
			}
						
		};
		
		
		
		// Overriding 
		Cinema1 c1 = new Cinema1() 
		{
			public void indianCinema() {
				System.out.println(" Hindi+ Telugu+ Tamil+ Malyalam +Kannada ");
			}
			
		};
		

	}

}
