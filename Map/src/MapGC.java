import java.util.*;
class Employee{
	private int empid;
	private String empname;
	private String empAddr;
	// setter and getters
	@Override
	public String toString() {
		return "Bharat";
	}
	
	public void finalize() {
		System.out.println("Garbage Collector collted the Obj ");
	}
}
public class MapGC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		HashMap hm= new HashMap();
		hm.put(e, "Hello");
		
		
		e= null;// Eligiblae for garbage collection !!
		
		System.gc();
		System.out.println(" Last Line");

	}

}
