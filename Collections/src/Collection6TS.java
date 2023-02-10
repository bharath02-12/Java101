import java.util.Iterator;
import java.util.TreeSet;

public class Collection6TS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		ts.add(50);
		ts.add(175);
		System.out.println(ts);//-------------> No Duplicats 
		System.out.println("-------------------------");
		System.out.println(ts.ceiling(50));
		System.out.println(ts.higher(50));
		System.out.println(ts.floor(50));
		System.out.println(ts.lower(50));
		System.out.println("*************");
		System.out.println(ts.ceiling(40));
		System.out.println(ts.higher(40));
		System.out.println(ts.floor(40));
		System.out.println(ts.lower(40));
		System.out.println("################################");
		Iterator it=ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
