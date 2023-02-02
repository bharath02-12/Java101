 abstract class Vechile{
	//private int num=10;
	public  void  speed() {
		System.out.println(" Hello Vechicle ");
	}
}
class Car extends Vechile{
	public  void  sspeed() {
		
		System.out.println(" Hello Car !!");;}
}
class Race extends Car{
	public   void  speed() {
		System.out.println(" Hello RACE ");
	} 
}
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Race r = new Race();
		Car c = new Race();
		Car c1= new Car();
		r.speed();
		c.speed();
		c1.speed();

	}

}

/* Hello RACE 
 Hello RACE 
 Hello Car !!
*/
