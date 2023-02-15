import java.util.*;

class Employee1{
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
public class LaunchWeakHM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee();
		WeakHashMap whm= new WeakHashMap();
		whm.put(e, "Hello");
		System.out.println(whm);
		
		
		e= null;// Eligiblae for garbage collection !!
		
		System.gc();
		System.out.println(" Last Line");
		System.out.println(whm);
	}

}
