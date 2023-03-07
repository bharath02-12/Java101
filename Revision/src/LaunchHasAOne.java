class School{
	String sName;
	int totalBuses;
	int time;
	Bus b;
	public School(String sName, int totalBuses, int time, Bus b) {
		
		this.sName = sName;
		this.totalBuses = totalBuses;
		this.time = time;
		this.b = b;
	}
	
	
	public void display() {
		System.out.println(sName+" has "+totalBuses+" buses in total , All comes around "+time+"am  and the bus is");
		System.out.println("-----");
		System.out.println(" The Bus color is "+b.color+" which have the capacity of "+b.totalkids+" the type of bus is "+b.type);
		System.out.println("*******************************************************************************************************");
	}
	
}

class Bus{
	String color;
	int totalkids;
	String type;
	public Bus(String color, int totalkids, String type) {
		
		this.color = color;
		this.totalkids = totalkids;
		this.type = type;
	}
	
	
}

public class LaunchHasAOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		
		Bus b1 = new Bus("Yello ",45," Mid bus");
		
		School s = new School(" Wilmington local public ",20,7,b1);
		s.display();
		School s1 = new School(" Hampton local public ",25,7,b1);
		s1.display();
		School s2= new School(" Dayton local public ",100,8,b1);
		
		s2.display();
		

	}

}
