abstract class Plane{
	
	abstract public void takeoff();
	
	abstract public void fly();
	
	abstract public void landing();
	
}

class CargoPalne extends Plane{
	public void takeoff() {
		System.out.println("Cargo plane needs longer time to take off  !!");
	}
	
	public void fly() {
		
		System.out.println("CargoPlane flies at lower height !!");
	}
	
public void landing() {
		
		System.out.println( "Cargo plane needs longer time to land !!");
	}
	
	

	
}

class PassengerPalne extends Plane{
	

	public void takeoff() {
		System.out.println("Passenger plane needs less time to take off  !!");
	}
	
	public void fly() {
		
		System.out.println("PP Plane flies at Medium height !!");
	}
	
public void landing() {
		
		System.out.println( " PP plane needs less time to land !!");
	}

}

 
public class LaunchInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
