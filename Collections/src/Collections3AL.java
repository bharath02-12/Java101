import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Collections3AL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al5= new ArrayList();
		al5.add(11);
		al5.add(22);
		al5.add(33);
		al5.add(44);
		System.out.println(al5);
		System.out.println(al5.contains(44));
		

		System.out.println(al5.indexOf(22));
		System.out.println(al5.isEmpty());
		System.out.println(al5.size());
		Iterator it=al5.iterator();
		System.out.println("#################");

		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(" Reverse");
		
		ListIterator lit=al5.listIterator(al5.size());
		
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
		

		
	}

}
