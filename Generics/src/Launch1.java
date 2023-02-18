interface Calculator{}
class Casio implements Calculator{}
class Quartz implements Calculator{}
class Kadio implements Calculator{}


public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c1 =new Casio();
		System.out.println(c1.getClass().getName());
		Calculator c2 =new Quartz();
		System.out.println(c2.getClass().getName());

		Calculator c3 =new Kadio();
		System.out.println(c3.getClass().getName());

		

	}

}
