import java.util.*;
public class Generics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		al.add("Hello");
		al.add("man");
		al.add(new Integer(20));
		System.out.println(al);
		
		//String s =al.get(2);
		
		ArrayList<String> as = new ArrayList<String>();
		as.add("1");
		as.add("2");
		//as.add(new Integer(10));
		
		String s1 =as.get(0);
		String s2 =as.get(1);
		System.out.println(s1);
		System.out.println(s2);
		 
		ArrayList<Integer> ai = new ArrayList<Integer>();
		
		

	}

}
