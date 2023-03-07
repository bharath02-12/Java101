class Car{
	int doors;
	String engineSize;
	int price;
	String carType;
	int seats;
	
	Car(){
		System.out.println(" I am Basic car model");
	}
	public Car(int doors, String engineSize, int price, String carType, int seats) {
		this.doors = doors;
		this.engineSize = engineSize;
		this.price = price;
		this.carType = carType;
		this.seats = seats;
	}
	
	
	
	public void speed() {
		System.out.println(" Car should go in the normal speed but this is "+carType+" Car goes so speedm as  its engine is of  "+engineSize);
	}
	
	public void horn() {
		System.out.println(" I honk horn ");
	}
	
	
}

class Kia extends Car
{
	
	Kia(){
		System.out.println("I am basic Kia ");
	}

	public Kia(int doors, String engineSize, int price, String carType, int seats) {
		super(doors, engineSize, price, carType, seats);

		
		/*
		 * this.doors=doors;
		 * 
		 * this.engineSize=engineSize; this.price = price;
		 * 
		 * this.carType=carType; this.seats=seats;
		 */
		
	}

	 public void myCarSpecs(String name) {
		
		System.out.println("This is Kia car a and we have the best Engine"+engineSize+" and the type is "+carType+" and have"+seats+" seats and "+doors+" doors ");
	}
}

class SportsCar extends Kia
{

	public SportsCar(int doors, String engineSize, int price, String carType, int seats) {
		//super(doors, engineSize, price, carType, seats);
		
	}
	
	public void speed() {
		System.out.println(" SportsCar is  speedest  than the all the  cars");
	}
	
    public void myCarSpecs() {
		
		
    	System.out.println("This is Kia car a and we have the best Engine"+this.engineSize+" and the type is "+this.carType+" and have"+this.seats+" seats and "+this.doors+" doors ");
    	
	}
    
    public void model() {
    	System.out.println(" I am Sports model ");
    }
	
	
}

public class LuanchInheritanceTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car c= new Car();
		Car c1 = new Car(4,"4L",22000,"Sedan",5);
		c1.speed();
		
		Car k = new Kia();
		Car k1 = new Kia(2,"6L",45000,"SUV",2);
		k1.horn();
		
		
			
			
		
		
		
	}

}
