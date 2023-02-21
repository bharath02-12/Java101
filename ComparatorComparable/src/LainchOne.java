import java.util.*;
public class LainchOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet ts = new TreeSet<String>();
		ts.add(new StringBuffer("A"));
		ts.add(new StringBuffer("Z"));
		ts.add(new StringBuffer("L"));
		ts.add(new StringBuffer("B"));
		
		System.out.println(ts);
		// Output : [A, B, L, Z]--> SORTED !!
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Hello");
		System.out.println(al);
 
		
		
		

	}

}
