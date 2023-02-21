import java.util.*;
class Compare1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2=o2.toString();
		int len1=s1.length();
		int len2=s2.length();
		
		if(len1<len2) {
			return -1;
		}
		else if(len1>len2){
		return +1;
		}
		else {
			return s1.compareTo(s2);
		}
		
		
		
		
	}
	
}
public class LaunchCompUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compare1 c = new Compare1();
		
		TreeSet st = new TreeSet(c);
		st.add("A");
		st.add(new StringBuffer("ABC"));
		st.add(new StringBuffer("AA"));
		st.add("XX");
		st.add("ABCE");
	//	st.add("A");
	
		System.out.println(st);
		
		//TreeMap<> tm = new TreeMap();

	}

}

// Output : [A, AA, XX, ABC, ABCE]

