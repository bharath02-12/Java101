import java.util.*;
//interface Compa
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		System.out.println(" Everytime the compare metod is called");
		Integer i1 =  (Integer)o1;
		Integer i2= (Integer) o2;
		if(i1<i2) {
			return +1;
		}
		else if(i1>i2) {
			return -1;
		}
		else {
			return 0;
		}
	}
	

	
	}
public class LaunchComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Need to pass the Obj which implements the Comparator 
		MyComparator mc = new MyComparator();
		
		
		TreeSet ts =  new TreeSet(mc);
		ts.add(10);
		ts.add(20);
		ts.add(50);
		ts.add(1);
		ts.add(100);
		//ts.add("Strig");
		System.out.println(ts);

	}

}
