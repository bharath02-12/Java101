import java.util.*;
import java.util.stream.Collectors;
public class StreamProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names= new ArrayList<String>();
		names.add("Sharukh");
		names.add("Salman");
		names.add("Aamir");
		names.add("Hrithik");
		names.add("Aksahy");
		names.add("Saif");
		System.out.println(names);
		// [Sharukh, Salman, Aamir, Hrithik, Aksahy, Saif]
		List<String> result =names.stream().filter(name->name.length()>5).collect(Collectors.toList());
		System.out.println(result.size());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("******* With Count **********8");
		long total=names.stream().filter(name->name.length()>5).count();
		System.out.println(total);
		
		// Comparable and Comparator !
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(15);
		al.add(50);
		al.add(25);
		al.add(30);
		System.out.println("ArrayList is "+al);
		System.out.println("************************************");
		System.out.println();
		System.out.println();

		List<Integer> ll=al.stream().sorted().collect(Collectors.toList());
		System.out.println("After Sorting "+ll);
		
		List<Integer> rl=al.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(rl);
		System.out.println("************************************");
		System.out.println();
		System.out.println();

		
		List<String> s=names.stream().sorted().collect(Collectors.toList());
		System.out.println(s);
		s.forEach(System.out::println);
		System.out.println("************************************");
		System.out.println();
		System.out.println();
		// Reversr 
		System.out.println(" Reverse ");
		System.out.println();
		System.out.println("************************************");

		System.out.println();
		System.out.println();
	
	List<String> rs=names.stream().sorted((obj1,obj2)->obj2.compareTo(obj1)).collect(Collectors.toList());
	System.out.println(rs);
	
	rs.forEach((s1)->System.out.println(s1));
	
	System.out.println("************************************");

	System.out.println(" Min Value");
	System.out.println("");
	Integer min=al.stream().min((i1,i2)->i1.compareTo(i2)).get();
	System.out.println(min);
	System.out.println("************************************");
	
	System.out.println(" Max Value");
	System.out.println("");
	Integer max=al.stream().max((i1,i2)->i1.compareTo(i2)).get();
	System.out.println(max);
	System.out.println("************************************");
	System.out.println("");
	System.out.println(" cONVERT lIST TO Array ");
	System.out.println("");
	System.out.println(" This is Object");
	Object[] arr=al.stream().toArray();
	for( Object obj:arr) {
		System.out.println(obj);
	}
	System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

	System.out.println(" This is Integer");
	Integer[] arrint=al.stream().toArray(Integer[]::new);
	for( Integer in:arrint) {
		System.out.println(in);
	}
	/*
	 * System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
	 * 
	 * System.out.println(" This is String"); String[]
	 * arrstr=((al.stream().toArray(String[]::new))); for( String ins:arrstr) {
	 * System.out.println(ins); }
	 */

		
		
	
		
		
	}

}
